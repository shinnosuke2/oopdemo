package com.yang.oopdome.day7;

import java.util.Scanner;

public class AddTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AddC a = new AddC();
        while (true) {
            String num = input.nextLine();
            if ("bye".equals(num)) {
                a.show();
                break;
            }
            if ("back".equals(num)) {
                a.back();
                continue;
            }
            a.add(Integer.parseInt(num));
        }
    }

}
