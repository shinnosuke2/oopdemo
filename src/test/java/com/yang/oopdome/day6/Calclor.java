package com.yang.oopdome.day6;

import java.util.Arrays;
import java.util.Scanner;

public class Calclor {

    public static void main(String[] args) {

        /*
           1+2*3+6/2*3-7*2-5

           运算符优先级如何解决

           方法调用是否是这个现象？  jia  jian  cheng  chu

           降阶

         */
        Scanner input = new Scanner(System.in);

        String e = input.nextLine();
        double rs = jia(e);
        System.out.println(rs);


    }

    private static double jia(String e) {
        String[] es = e.split("\\+");
        double sum = 0;
        for (String e1 : es) {
            sum += jian(e1);  //补齐法
        }
        return sum;
    }

    private static double jian(String e) {
        String[] es = e.split("\\-");
        double cha = cheng(es[0]);
        for (int i = 1; i < es.length; i++) {
            cha -= cheng(es[i]);
        }
        return cha;
    }                                                        // (1) + (2*3) +  (  (  (6/2) *(3) )   -   ((7)*(2) )  -  (5) )

    private static double cheng(String e) {
        String[] es = e.split("\\*");
        double ji = chu(es[0]);
        for (int i = 1; i < es.length; i++) {
            ji *= chu(es[i]);
        }
        return ji;
    }

    private static double chu(String e) {
        String[] es = e.split("\\/");
        double shang = Double.parseDouble(es[0]);
        for (int i = 1; i < es.length; i++) {
            shang /= Double.parseDouble(es[i]);
        }
        return shang;
    }
}


