package com.yang.oopdome.day7;

import java.util.Objects;

public class Add {
    private int sum;


    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void add(int num) {
        sum+=num;
    }

    public void show() {
        System.out.println(sum);
    }
}
