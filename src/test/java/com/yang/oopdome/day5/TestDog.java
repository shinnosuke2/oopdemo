package com.yang.oopdome.day5;

public class TestDog {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.setName("多多");
        dog.setLove(66);
        dog.setStrain("点点");
        dog.setHealth(80);
        dog.show();
        System.out.println(dog.getHealth());
    }
}
