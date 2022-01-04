package com.book_management;

public class TableOfContents implements Element {
    private Book book;

    TableOfContents(Book book) {
        this.book = book;
    }

    @Override
    public void print() {
        System.out.println("## TOC ##");
        System.out.println(generateContent());
        System.out.println("## END OF TOC ##");
    }

    public String generateContent() {
        ToCGenerator generator = new ToCGenerator();
        return book.accept(generator);
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
