package com.yang.oopdome.day9;

public class Inter implements Cpu {

    @Override
    public String getpai() {
        return "英特尔";
    }

    @Override
    public String getHz() {
        return "3000MHz";
    }
}
