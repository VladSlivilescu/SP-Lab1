package com.book_management;

import java.util.List;
import java.util.ArrayList;

public class Book {
    private String title;
    private List<Author> authors;
    private List<Chapter> chapters;

    public Book(String title) {
        this.title = title;
        this.chapters = new ArrayList<>();
        this.authors = new ArrayList<>();
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public int createChapter(String name) {
        chapters.add(new Chapter(name));
        return chapters.size() - 1;
    }

    public Chapter getChapter(int idx) {
        return chapters.get(idx);
    }

    public void print() {
        System.out.println("Book " + title);
        System.out.println("Authors");
        authors.forEach(Author::print);
        System.out.println("Chapters");
        chapters.forEach(Chapter::print);
    }
}
