package com.efrei.tp3_efrei_spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LibraryRunner implements CommandLineRunner {
    private final LibraryService libraryService;

    public LibraryRunner(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @Override
    public void run(String... args) {
        Book book1 = new Book("1", "book 1", "Adrien", false, null);
        Book book2 = new Book("2", "book 2", "Adrien", false, null);

        libraryService.addBook(book1);
        libraryService.addBook(book2);

        System.out.println("books: " + libraryService.getAvailableBooks());

        libraryService.rentBook("1", "test");
        System.out.println("livre disponible 1: " + libraryService.getAvailableBooks());

        libraryService.returnBook("2");
        System.out.println("livre disponible 2: " + libraryService.getAvailableBooks());
    }
}
