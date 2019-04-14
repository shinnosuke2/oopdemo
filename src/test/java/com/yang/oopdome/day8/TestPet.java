package com.yang.oopdome.day8;

import com.yang.oopdome.day8.Cat;
import com.yang.oopdome.day8.Dog;
import com.yang.oopdome.day8.Master;
import com.yang.oopdome.day8.Pet;

import java.util.Scanner;

public class TestPet {


    public static void main(String[] args) {
        int n = 0;
        Scanner input = new Scanner(System.in);
        Pet dog = new Dog("多多", 3, 50, "吉娃娃");
        Pet cat = new Cat("点点", 4, 33, "橘黄");
        Master a = new Master();
        System.out.println("您要买宠物吗？");
        dog.show();
        cat.show();

        a.crue(dog);
        a.crue(cat);
        dog.show();
        cat.show();
        boolean flag = true;
        while (flag) {
            System.out.println("您要喂宠物吗？（y/n）");
            String answer = input.next();
            if (answer.equals("n")) {
                flag = false;
                continue;
            }
            a.feed(dog);
            a.feed(cat);
            cat.show();
            dog.show();
        }
        System.out.println("请选择与那只宠物玩耍（1.狗狗，2.猫咪）");
        int answer = input.nextInt();
        switch (answer) {
            case 1:
                if (dog instanceof Dog) {
                    Dog d = (Dog) dog;
                    d.play();
                }

                break;
            case 2:
                if (cat instanceof Cat) {
                    Cat c = (Cat) cat;
                    c.play();
                }

                break;
            default:
                break;

        }

    }
}
