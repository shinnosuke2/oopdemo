package com.yang.oopdome.day5;

public class TuZi {
    public int diGui(int i){
        if (i==1|i==2){
            return 1;
        }
        return diGui(i-1)+diGui(i-2);
    }
}
