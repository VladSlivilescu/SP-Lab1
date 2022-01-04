package com.book_management;

public class ImageProxy implements Element, Picture {
    private Image image;
    private String url;

    public ImageProxy(String url) {
        this.url = url;
        this.image = null;
    }

    @Override
    public void print() {
        if (this.image == null) {
            this.image = new Image(url);
        }
        this.image.print();
    }

    @Override
    public String url() {
        return url;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
