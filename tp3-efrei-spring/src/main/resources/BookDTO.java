package com.efrei.tp3_efrei_spring;


import jakarta.validation.constraints.NotBlank;

public class BookDTO {

    @NotBlank
    private String isbn;

    @NotBlank
    private String title;

    @NotBlank
    private String author;

    private boolean isRented;

    private String rentedBy;

    // Getters, setters et constructeurs
}
