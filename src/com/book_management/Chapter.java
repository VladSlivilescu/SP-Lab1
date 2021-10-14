package com.book_management;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String name;
    private List<SubChapter> subChapters;

    public Chapter(String name) {
        this.name = name;
        this.subChapters = new ArrayList<>();
    }

    public int createSubChapter(String name) {
        subChapters.add(new SubChapter(name));
        return subChapters.size() - 1;
    }

    public SubChapter getSubChapter(int idx) {
        return subChapters.get(idx);
    }

    public void print() {
        System.out.println("Chapter " + name);
        subChapters.forEach(SubChapter::print);
    }
}
