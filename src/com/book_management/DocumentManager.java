package com.book_management;

public class DocumentManager {
    private static DocumentManager instance;
    private Book book;
    private DocumentManager() {
        this.book = null;
    }

    public static DocumentManager getInstance() {
        if (instance == null) instance = new DocumentManager();
        return instance;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }
}
