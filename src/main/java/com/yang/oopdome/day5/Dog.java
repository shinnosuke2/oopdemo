package com.yang.oopdome.day5;

public class Dog {
    private String name;
    private int health;
    private int love;
    private String strain;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    public void setHealth(int health) {
        if (health>100|health<0){
            //健康值不对，强制赋值60.
        this.health = 60;
            System.out.println("0-100");
            return;
        }
        //合法则赋值
        this.health=health;
    }
    public int getHealth() {
        return health;
    }
    public void show(){
        System.out.println("我叫："+name+"\n亲密度："+love+"\n健康值："+health+"\n品种："+strain);

    }
}
