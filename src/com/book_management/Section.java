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
        System.out.println("## SECTION " + title.toUpperCase() + " ##");
        children.forEach(Element::print);
        System.out.println("## END OF SECTION ##");
    }

    public String getTitle() {
        return title;
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

    public List<Element> getChildren() {
        return children;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
