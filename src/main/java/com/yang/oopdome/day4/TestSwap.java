package com.yang.oopdome.day4;

public class TestSwap {

    public static void main(String[] args) {
//        int a=5,b=8;
////        System.out.println("a="+a+",b="+b);
////        System.out.println("--------------");
////        //swap
////        swap(a,b);
////        System.out.println("a="+a+",b="+b);
////        //说明没有交换的原因
//        MyNum a = new MyNum();
//        a.n=5;
//        MyNum b = new MyNum();
//        b.n=8;
//        System.out.println("a="+a+",b="+b);
//        System.out.println("----------------");
//        swap(a,b);
//        System.out.println("a="+a+",b="+b);
            //说明上面代码的原因
            MyNum a = new MyNum();
            a.n=5;
            MyNum b = new MyNum();
            b.n=8;
            System.out.println("a="+a+",b="+b);
            System.out.println("----------------");
            swap2(a,b);
            System.out.println("a="+a+",b="+b);


        }
        private static void swap2(MyNum a, MyNum b) {
            a=new MyNum();
            b=new MyNum();
            int tmp = a.n;
            a.n=b.n;
            b.n=tmp;
        }

        private static void swap(MyNum a, MyNum b) {
            int tmp = a.n;
            a.n=b.n;
            b.n=tmp;
        }

        private static void swap(int a, int b) {
            int tmp = a;
            a = b;
            b =tmp;
            System.out.println(a+"   "+b);
        }
    }
    class MyNum {
        int n;
    }




