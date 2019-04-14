package com.yang.oopdome.day7;
//狗狗子类
public class Dog extends Pet{
    private String strain;

    public Dog(String name, int health, int love,String strain) {
        super(name, health, love);
        this.strain=strain;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {

        this.strain = strain;
    }
    public void show(){//重写父类的show方法

        super.show();

        System.out.println("品种是："+strain);
    }
}
