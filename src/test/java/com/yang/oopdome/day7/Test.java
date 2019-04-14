package com.yang.oopdome.day7;

public class Test {
    public static void main(String[] args) {
        Dog dog=new Dog("多多",88,45,"吉娃娃");
//        dog.setName("多多");
//        dog.setHealth(88);
//        dog.setLove(45);
       // dog.setStrain("吉娃娃");
        dog.show();
        System.out.println();
        Cat cat=new Cat("小黑",90,99,"黑色");
//        cat.setName("小黑");
//        cat.setHealth(90);
//        cat.setLove(98);
//        cat.setColor("黑色");
        cat.show();

    }



}
