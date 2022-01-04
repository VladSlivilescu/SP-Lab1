package com.book_management;

public class Main {
    public static void Printing(){
        DocumentManager.getInstance().getBook().print();
    }
    public static void main(String[] args) throws Exception {
        Book book = new Book("O carte");
        TableOfContents toc = new TableOfContents(book);
        book.add(toc);
        Paragraph p1 = new Paragraph("Paragraph 1");
        book.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        book.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        book.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        book.add(p4);
        book.add(new ImageProxy("ImageOne"));
        book.add(new Image("ImageTwo"));
        book.add(new Paragraph("Some text"));
        book.add(new Table("Table 1"));

        BookStatistics stats = new BookStatistics();
        book.accept(stats);
        stats.printStatistics();

        book.print();
    }
}
