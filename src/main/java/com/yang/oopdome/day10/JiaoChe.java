package com.yang.oopdome.day10;

public class JiaoChe extends Car {
    public JiaoChe() {
    }

    public JiaoChe(String name, String pai, double zujin) {
        super(name, pai, zujin);
    }

    @Override
    public void xuanChe(int choose) {
        System.out.println(jiaoChes[choose]);
    }

    @Override
    public String toString() {
        return "车辆信息：\t"+getName()+"\t\t"+getPai()+"\t\t"+getZujin();
    }

    @Override
    public double sum(Car[] cars,int choose,int days) {
        double sum=cars[choose].getZujin()*days;
        System.out.println("您应付："+sum);
        if (days>7){
            sum=cars[choose].getZujin()*days*0.9;
        }
        if (days>30){
            sum=cars[choose].getZujin()*days*0.8;
        }
        if (days>150){
            sum=cars[choose].getZujin()*days*0.7;
        }
        return sum;
    }
}
