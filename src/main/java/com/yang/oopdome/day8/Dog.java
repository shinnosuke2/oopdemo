package com.yang.oopdome.day8;

public class Dog extends Pet{
    private String strain;

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    public Dog(String strain) {
        this.strain = strain;
    }

    public Dog(String name, int age, int health, String strain) {
        super(name, age, health);
        this.strain = strain;
    }

    public void cure(){//看病
        this.setHealth(90);
        System.out.println("打针，吃药");
        System.out.println("我变好了，健康值为："+getHealth());

    }

    @Override
    public void show() {
        super.show();
        System.out.println("我是一只："+strain);
    }
    public void eat(){//喂食
        if (this.getHealth()>=100){
            this.setHealth(100);
            System.out.println("狗狗"+this.getName()+"吃饱了，不需要喂食！");
        }
        else {
            System.out.println("吃根骨头！");

            this.setHealth(this.getHealth()+3);
            if (this.getHealth()>=100){
                this.setHealth(100);
            }

        }

    }
    //狗狗会叼飞碟！
public void play(){
    System.out.println("狗狗叼飞碟！");
}

}
