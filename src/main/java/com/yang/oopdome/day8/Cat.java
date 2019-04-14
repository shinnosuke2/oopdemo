package com.yang.oopdome.day8;

public class Cat extends Pet {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cat() {

    }

    public Cat(String name, int age, int health, String color) {
        super(name, age, health);
        this.color = color;
    }

    @Override
    public void cure() {
        System.out.println("吃药，疗养");
        this.setHealth(70);
        System.out.println("我好了，健康值为："+getHealth());
    }
    public void eat(){
        if (this.getHealth()==100){
            System.out.println("猫咪"+this.getName()+"吃饱了，不需要喂食！");
        }
        else {
            System.out.println("吃一条鱼！");
            this.setHealth(this.getHealth()+5);
        }
    }
    //猫咪会上树
    public void play(){
        System.out.println("猫咪上树!");
    }
}
