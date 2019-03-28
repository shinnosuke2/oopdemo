package com.yang.oopdome.day2;

import java.util.Scanner;

public class TestDog {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("输入健康值：");
        Dog dog=new Dog();
        dog.setName("多多");
        dog.setHealth(input.nextInt());
        dog.setLove(99);
        dog.setStrain("二哈");
        dog.print();
        //只想获取够够的健康值
//        System.out.println(dog.getName());
//        System.out.println(dog.getHealth());
//        System.out.println(dog.getLove());
//        System.out.println(dog.getStrain());


    }
}
