package com.yang.oopdome.day82;

public class TestAnimal {
    public static void main(String[] args) {
        Host host=new Host();
        Animal animal=host.sendAnimal("cat");
        animal.shout();

    }
}
