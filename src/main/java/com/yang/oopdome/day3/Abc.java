package com.yang.oopdome.day3;

public class Abc {
    int a;
    int b;
    int d;
    public int e(int c) {
        if (c>3)
            return e(c-1)+e(c-2);

    return 0;
    }


}
