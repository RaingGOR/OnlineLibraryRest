package ru.Raingor.OnlineLibraryRest.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "book", schema = "online_library_rest")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "book_img")
    private String bookImg;

    @Column(name = "name")
    private String name;

    @Column(name = "author")
    private String author;

    @Column(name = "rating")
    private int rating;

    @Column(name = "description")
    private String description;

    @Column(name = "genre")
    @Enumerated(value = EnumType.STRING)
    private Genre genre;

    @Column(name = "age_restriction")
    private String ageRestriction;

    @Column(name = "fulltext")
    private String text;

    public Book(String bookImg, String name, String author, String description, Genre genre, String ageRestriction,
                String text) {
        this.bookImg = bookImg;
        this.name = name;
        this.author = author;
        this.description = description;
        this.genre = genre;
        this.ageRestriction = ageRestriction;
        this.text = text;
    }

    public Book(String bookImg, String name, String author, int rating, String description, Genre genre,
                String ageRestriction, String text) {
        this.bookImg = bookImg;
        this.name = name;
        this.author = author;
        this.rating = rating;
        this.description = description;
        this.genre = genre;
        this.ageRestriction = ageRestriction;
        this.text = text;
    }
}
