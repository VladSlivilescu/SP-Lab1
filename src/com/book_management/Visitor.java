package com.book_management;

public interface Visitor<T> {
    public T visit(Book book);
    public T visit(Section section);
    public T visit(TableOfContents toc);
    public T visit(Paragraph paragraph);
    public T visit(ImageProxy imageProxy);
    public T visit(Image image);
    public T visit(Table table);
}
