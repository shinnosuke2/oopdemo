package com.yang.oopdome.day1;

public class ModifyCat {
    public void add(Cat[] cats){
        for (int i=0;i<cats.length;i++){
            if(cats[i].love<60){
                cats[i].love+=2;
            }
        }
    }

    public void showInfo(Cat[] cats){
        for (Cat cat:cats){
            cat.showInfo();
        }


    }
}
