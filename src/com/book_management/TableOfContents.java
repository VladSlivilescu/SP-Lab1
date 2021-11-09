package com.book_management;

public class TableOfContents implements Element {
    private String content;

    TableOfContents(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println("Table Of Contents\n" + this.content);
    }
}
