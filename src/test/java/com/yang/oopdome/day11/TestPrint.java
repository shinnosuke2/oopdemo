package com.yang.oopdome.day11;

import java.util.Scanner;

public class TestPrint {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Print print = new Print();
        Paper paper = new B5();
        InkBox inkBox = new Black();
        print.setInkBox(inkBox);
        print.setPaper(paper);
        System.out.println(print.getPaper().getsize());
        print.print();

    }
}
