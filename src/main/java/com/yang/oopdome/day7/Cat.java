package com.yang.oopdome.day7;
//猫子类
public class Cat extends Pet {
    private String color;

    public Cat(String name, int health, int love, String color) {
        super(name, health, love);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override//重写方法
    public void show() {
        super.show();
        System.out.println("我的颜色是："+color);
    }
}
