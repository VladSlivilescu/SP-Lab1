package com.book_management;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private List<Element> elements;
    private String name;

    public SubChapter(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void print() {
        System.out.println("Subchapter " + name);
        elements.forEach(Element::print);
    }

    public void createNewParagraph(String text) {
        elements.add(new Paragraph(text));
    }

    public void createNewImage(String imageName) {
        elements.add(new Image(imageName));
    }

    public void createNewTable(String title) {
        elements.add(new Table(title));
    }
}
