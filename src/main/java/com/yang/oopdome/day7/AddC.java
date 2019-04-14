package com.yang.oopdome.day7;

import com.yang.oopdome.day3.Abc;

public class AddC extends Add {
    int n;

    public void add(int num) {
        n = num;
        super.add(num);
    }

    public void back() {
        setSum(getSum() - n);

    }

}
