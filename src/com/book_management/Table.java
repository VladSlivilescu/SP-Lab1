package com.book_management;

public class Table implements Element {
    private String title;
    public Table(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("## TABLE " + title + " ##");
    }

    public String getTitle() {
        return title;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
