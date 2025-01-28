package com.efrei.tp3_efrei_spring;

package com.exemple.library.repository;

import com.exemple.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> {
}
