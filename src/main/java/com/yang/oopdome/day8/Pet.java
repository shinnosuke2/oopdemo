package com.yang.oopdome.day8;

public abstract class Pet {

    private String name;
    private int age;
    private int health;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pet() {
    }

    public Pet(String name, int age, int health) {
        this.name = name;
        this.age = age;
        this.health = health;
    }
    public abstract void cure();
    public void show(){
        System.out.println("我叫："+name+"\n年龄："+age+"\n健康值："+health);
    }

    public void eat() {

    }

}

