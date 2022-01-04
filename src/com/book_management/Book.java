package com.book_management;

import java.util.List;
import java.util.ArrayList;

public class Book extends Section {
    private List<Author> authors;

    public Book(String title) {
        super(title);
        this.authors = new ArrayList<>();
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void print() {
        System.out.println("Book");
        authors.forEach(Author::print);
        super.print();
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
