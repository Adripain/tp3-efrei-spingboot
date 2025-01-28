package com.efrei.tp3_efrei_spring;

import com.exemple.library.dto.BookDTO;
import com.exemple.library.model.Book;
import com.exemple.library.service.LibraryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final LibraryService libraryService;

    public BookController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @GetMapping
    public List<BookDTO> getAllBooks() {
        return libraryService.getAllBooks();
    }

    @PostMapping
    public BookDTO createBook(@RequestBody BookDTO bookDTO) {
        return libraryService.createBook(bookDTO);
    }

    @GetMapping("/{isbn}")
    public BookDTO getBookByIsbn(@PathVariable String isbn) {
        return libraryService.getBookByIsbn(isbn);
    }

    @PutMapping("/{isbn}/rent")
    public BookDTO rentBook(@PathVariable String isbn, @RequestParam String studentId) {
        return libraryService.rentBook(isbn, studentId);
    }

    @PutMapping("/{isbn}/return")
    public BookDTO returnBook(@PathVariable String isbn) {
        return libraryService.returnBook(isbn);
    }
}
s