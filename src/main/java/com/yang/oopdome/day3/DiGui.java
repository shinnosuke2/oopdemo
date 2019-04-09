package com.yang.oopdome.day3;

public class DiGui {
    public int diGui(int n) {
        if (n < 0) {
            System.out.println("输入有误！");
        } else if (n == 1 | n == 2) {
            return 1;
        } else {
            return diGui(n - 1) + diGui(n - 2);
        }
        return n;
    }
}
