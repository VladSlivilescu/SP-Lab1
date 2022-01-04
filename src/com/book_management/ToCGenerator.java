package com.book_management;

import java.util.stream.Collectors;

public class ToCGenerator implements Visitor<String> {
    private int sectionDepth = 0;
    private int sectionWidth = 0;

    @Override
    public String visit(Book book) {
        return String.format(
                "%s, by %s\n%s",
                book.getTitle(),
                String.join(", ", book.getAuthors().stream().map(Author::getFullName).collect(Collectors.joining(", "))),
                String.join("\n", book.getChildren().stream().map((child) -> {
                    sectionWidth++;
                    return child.accept(this);
                }).collect(Collectors.joining("\n"))));
    }

    @Override
    public String visit(Section section) {
        sectionDepth++;
        String returnString = String.format(
                "%s%s\n%s",
                " ".repeat(sectionDepth),
                section.getTitle(),
                section.getChildren().stream().map((child) -> {
                    sectionWidth++;
                    return child.accept(this);
                }).collect(Collectors.joining("\n")));
        sectionDepth--;
        sectionWidth = 0;
        return returnString;
    }

    @Override
    public String visit(TableOfContents toc) {
        return formatted("Table of Contents");
    }

    @Override
    public String visit(Paragraph paragraph) {
        return formatted("Paragraph " + paragraph.getText());
    }

    @Override
    public String visit(ImageProxy imageProxy) {
        return formatted("Image " + imageProxy.url());
    }

    @Override
    public String visit(Image image) {
        return formatted("Image " + image.url());
    }

    @Override
    public String visit(Table table) {
        return formatted("Table " + table.getTitle());
    }

    private String formatted(String in) {
        return String.format("%s%d.%s", " ".repeat(sectionDepth), sectionWidth, in);
    }
}
