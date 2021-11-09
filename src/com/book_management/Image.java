package com.book_management;

public class Image implements Element {
    private String url;

    public Image(String url) {
        this.url = url;
    }

    public void print() {
        System.out.println("Image " + url);
    }

}
