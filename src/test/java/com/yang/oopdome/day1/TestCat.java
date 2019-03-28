package com.yang.oopdome.day1;

public class TestCat {
    public static void main(String[] args) {
        ModifyCat a=new ModifyCat();
        Cat[] cats=new Cat[2];
        /*Cat s1=new Cat();
        s1.name="tim";
        s1.age=3;
        s1.love=45;
        */
        Cat s1=new Cat("tim",3,45);
        /*Cat s2=new Cat();
        s2.name="tom";
        s2.age=2;
        s2.love=66;
        */
        Cat s2=new Cat("tom",2,66);
        cats[0]=s1;
        cats[1]=s2;
        a.add(cats);
        a.showInfo(cats);

    }
}
