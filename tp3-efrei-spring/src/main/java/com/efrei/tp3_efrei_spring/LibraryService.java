package com.efrei.tp3_efrei_spring;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LibraryService {
    private final BookRepository bookRepository;
    private final LibraryProperties properties;

    public LibraryService(BookRepository bookRepository, LibraryProperties properties) {
        this.bookRepository = bookRepository;
        this.properties = properties;
    }

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public void rentBook(String isbn, String studentId) {
        Book book = bookRepository.findByIsbn(isbn);
        if (book == null || book.isRented()) {
            throw new IllegalArgumentException("Book is not available.");
        }

        long rentedBooksCount = bookRepository.findAll().stream()
                .filter(b -> studentId.equals(b.getRentedBy()))
                .count();
        if (rentedBooksCount >= properties.getMaxBooksByUser()) {
            throw new IllegalArgumentException("Student has reached the max limit.");
        }

        book.setRented(true);
        book.setRentedBy(studentId);
    }

    public void returnBook(String isbn) {
        Book book = bookRepository.findByIsbn(isbn);
        if (book != null && book.isRented()) {
            book.setRented(false);
            book.setRentedBy(null);
        }
    }

    public List<Book> getAvailableBooks() {
        return bookRepository.findAll().stream()
                .filter(book -> !book.isRented())
                .collect(Collectors.toList());
    }
}
