package com.book_management;

public class BookStatistics implements Visitor<Void>{
    private int imageCount;
    private int tableCount;
    private int paragraphCount;

    BookStatistics() {
        imageCount = 0;
        tableCount = 0;
        paragraphCount = 0;
    }

    @Override
    public Void visit(Book book) {
        book.getChildren().forEach((child) -> child.accept(this));
        return null;
    }

    @Override
    public Void visit(Section section) {
        section.getChildren().forEach((child) -> child.accept(this));
        return null;
    }

    @Override
    public Void visit(TableOfContents toc) {
        return null;
    }

    @Override
    public Void visit(Paragraph paragraph) {
        paragraphCount++;
        return null;
    }

    @Override
    public Void visit(ImageProxy imageProxy) {
        imageCount++;
        return null;
    }

    @Override
    public Void visit(Image image) {
        imageCount++;
        return null;
    }

    @Override
    public Void visit(Table table) {
        tableCount++;
        return null;
    }

    public void printStatistics() {
        System.out.println("Book Statistics");
        System.out.printf("*** Number of images: %d\n", imageCount);
        System.out.printf("*** Number of tables: %d\n", tableCount);
        System.out.printf("*** Number of paragraphs: %d\n", paragraphCount);
    }
}
