package com.efrei.tp3_efrei_spring;

import com.exemple.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> {
}
