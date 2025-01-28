package com.efrei.tp3_efrei_spring;

import com.exemple.library.dto.BookDTO;
import com.exemple.library.model.Book;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {

    public BookDTO toDTO(Book book) {
        BookDTO dto = new BookDTO();
        dto.setIsbn(book.getIsbn());
        dto.setTitle(book.getTitle());
        dto.setAuthor(book.getAuthor());
        dto.setIsRented(book.isRented());
        dto.setRentedBy(book.getRentedBy());
        return dto;
    }

    public Book toEntity(BookDTO dto) {
        Book book = new Book();
        book.setIsbn(dto.getIsbn());
        book.setTitle(dto.getTitle());
        book.setAuthor(dto.getAuthor());
        book.setRented(dto.isRented());
        book.setRentedBy(dto.getRentedBy());
        return book;
    }
}

