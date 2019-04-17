package com.yang.oopdome.day10;

import java.util.Arrays;

public abstract class Car {
    private String name;
    private String pai;
    private double zujin;
    JiaoChe[] jiaoChes;
    KeChe[] keChes;

    public void setJiaoChes(JiaoChe[] jiaoChes) {
        this.jiaoChes = jiaoChes;
    }

    public JiaoChe[] getJiaoChes() {
        return jiaoChes;
    }

    public KeChe[] getKeChes() {
        return keChes;
    }

    public void setKeChes(KeChe[] keChes) {
        this.keChes = keChes;
    }

    public Car() {
    }

    public Car(String name, String pai, double zujin) {
        this.name = name;
        this.pai = pai;
        this.zujin = zujin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public double getZujin() {
        return zujin;
    }

    @Override
    public String toString() {

        return "";
    }

    public void setZujin(double zujin) {
        this.zujin = zujin;
    }

        public  void xuanChe(int choose){

        };

    public abstract double sum(Car[] cars,int choose,int days);
}
