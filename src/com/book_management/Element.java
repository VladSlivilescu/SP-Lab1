package com.book_management;

public interface Element {
    public void print();

    public default void add(Element element) {
        throw new java.lang.UnsupportedOperationException();
    }

    public default void remove(Element element) {
        throw new java.lang.UnsupportedOperationException();
    }

    public default Element get(int idx) {
        throw new java.lang.UnsupportedOperationException();
    }

    public <T> T accept(Visitor<T> visitor);

}
