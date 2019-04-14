package com.yang.oopdome.day8;

public class TestGoods {
    public static void main(String[] args) {
       Goods good=Factory.getGoods("TV");
       good.printprice();

    }
}
