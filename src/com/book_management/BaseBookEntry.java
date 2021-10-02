package com.book_management;

public abstract class BaseBookEntry {
    private String name;

    public BaseBookEntry(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BaseBookEntry{" +
                "name='" + name + '\'' +
                '}';
    }
}
