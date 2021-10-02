package com.book_management;

public class Image extends BaseBookEntry {
    public Image(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Image{} " + super.toString();
    }
}
