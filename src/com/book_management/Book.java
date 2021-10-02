package com.book_management;

import java.util.List;
import java.util.ArrayList;

public class Book {
    private String title;
    private List<BaseBookEntry> entries;

    public Book(String title) {
        this.title = title;
        this.entries = new ArrayList<>();
    }

    public void createNewParagraph(String name) {
        entries.add(new Paragraph(name));
    }

    public void createNewImage(String name) {
        entries.add(new Image(name));
    }

    public void createNewTable(String name) {
        entries.add(new Table(name));
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", entries=" + entries +
                '}';
    }

    public void print() {
        System.out.println(this);
    }

}
