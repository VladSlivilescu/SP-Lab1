package com.book_management;

import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture {
    private String url;

    public Image(String url) {
        this.url = url;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void print() {
        System.out.println("Image " + url);
    }

    @Override
    public String url() {
        return url;
    }
}
