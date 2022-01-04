package com.book_management;

public class Paragraph implements Element {
    private String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
        this.alignStrategy = null;
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }

    @Override
    public void print() {
        if (alignStrategy == null) {
            System.out.println("## PARAGRAPH ##\n" + text + "\n## END OF PARAGRAPH ##");
            return;
        }
        alignStrategy.render(this);
    }

    public String getText() {
        return text;
    }

    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
