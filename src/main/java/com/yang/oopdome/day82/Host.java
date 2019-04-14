package com.yang.oopdome.day82;

public class Host {
    //主人类赠送动物  将父类类型作为返回值
    public Animal sendAnimal(String type) {
        Animal animal = null;
        if (type.equals("dog")) {
            animal = new Dog();
        } else if (type.equals("cat")) {
            animal = new Cat();
        } else {
            animal = new Duck();
        }

        return animal;
    }
}
