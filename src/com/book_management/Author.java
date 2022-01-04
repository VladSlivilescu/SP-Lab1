package com.book_management;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getFullName() {
        return String.format("%s %s", this.name, this.surname);
    }

    public void print() {
        System.out.println("Author " + name + " " + surname);
    }

}
