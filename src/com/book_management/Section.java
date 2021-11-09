package com.book_management;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    private String title;
    private List<Element> children;

    Section(String title) {
        this.title = title;
        this.children = new ArrayList<>();
    }

    public void print() {
        System.out.println("Section " + title);
        children.forEach(Element::print);
    }

    public void add(Element element) {
        children.add(element);
    }

    public void remove(Element element) {
        children.remove(element);
    }

    public Element get(int idx) {
        return children.get(idx);
    }

}
