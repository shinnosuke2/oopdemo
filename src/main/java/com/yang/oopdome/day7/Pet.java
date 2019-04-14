package com.yang.oopdome.day7;
//父类
public class Pet {
    private String name;
    private  int health;
    private  int love;
    public Pet(String name, int health, int love) {
        this.name = name;
        this.health = health;
        this.love = love;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }
    public void show(){
        System.out.println("我叫："+name+"\n健康值："+health+"\n亲密度："+love);
    }
}
