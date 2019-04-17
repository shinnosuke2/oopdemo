package com.yang.oopdome.day10;

public class KeChe extends Car {
    private String zuo;

    public KeChe() {
    }

    @Override
    public double sum(Car[] cars, int choose, int days) {
        double sum=cars[choose-cars.length].getZujin()*days;
        System.out.println("您应付："+sum);
        if (days>=3){
            sum=cars[choose-cars.length].getZujin()*days*0.9;
        }
        if (days>=7){
            sum=cars[choose-cars.length].getZujin()*days*0.8;
        }
        if (days>=30){
            sum=cars[choose-cars.length].getZujin()*days*0.7;
        }
        if (days>=150){
            sum=cars[choose-cars.length].getZujin()*days*0.6;
        }
        return sum;
    }

    @Override
    public String toString() {
        return "车辆信息：\t"+getName()+"\t\t\t"+getPai()+"\t\t"+getZujin()+"\t\t"+getZuo();
    }

    public KeChe(String name, String pai, double zujin, String zuo) {
        super(name, pai, zujin);
        this.zuo = zuo;
    }

    public String getZuo() {
        return zuo;
    }

    public void setZuo(String zuo) {
        this.zuo = zuo;
    }

//    @Override
//    public void sum(int days) {
//        super.sum();
//    }
}
