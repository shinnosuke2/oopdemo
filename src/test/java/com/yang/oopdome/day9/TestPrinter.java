package com.yang.oopdome.day9;

public class TestPrinter {
    public static void main(String[] args) {
        InkBox inkBox=new Gray();
        Paper paper=new A4();
        Printer printer=new Printer();
        printer.setInkBox(inkBox);
        printer.setPaper(paper);
        printer.print();
        inkBox=new Color();
        paper=new B5();
        printer.setPaper(paper);
        printer.setInkBox(inkBox);
        printer.print();
    }
}
