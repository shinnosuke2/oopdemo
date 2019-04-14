package com.yang.oopdome.day8;

public class Master {
    public void crue(Pet pet) {
        if (pet.getHealth() < 60) {
            pet.cure();
        }
    }

    public void feed(Pet pet) {

        pet.eat();

    }

}
