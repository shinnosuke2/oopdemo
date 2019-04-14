package com.yang.oopdome.day6;
//oop 封装
public class Penguin {
    private int love;
    private int health;
    private String name;
    private String sex;

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
       if (love>100|love<0){
           System.out.print("企鹅的亲密度需在0到100之间，默认值为0.");
           this.love=0;
           return;
       }
       this.love=love;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health>100|health<0){
            System.out.println("企鹅的健康值需在0到100之间，默认值为60.");
            this.health=60;
            return;
        }
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (Integer.parseInt(sex)==1){
            this.sex="Q仔";
        }
        if (Integer.parseInt(sex)==2){
            this.sex="Q妹";
        }
    }
    public void show(){
        System.out.println("宠物的自白:\n我的名字叫:"+name+"，健康值是："+health+"，和主人的亲密度是："+love
        +"，我的性别是："+sex);
    }
}
