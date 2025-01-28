package com.exemple.library.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Book {

    @Id
    private String isbn;

    @NotBlank
    private String title;

    @NotBlank
    private String author;
    private boolean isRented = false;
    private String rentedBy;

}
