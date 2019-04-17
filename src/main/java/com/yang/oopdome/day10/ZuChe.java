package com.yang.oopdome.day10;

public class ZuChe {


//    public void zuJIn(Car car,int choose,int days) {
//        if (choose<=4){
//            car.sum(car.jiaoChes,choose,days);
//        }else {
//            car.sum(car.keChes,choose,days);
//        }


  //  }
    public Car xuanChe(int choose){
        Car car=null;
        if (choose<4){
            car=new JiaoChe();
        }else {
            car= new KeChe();
        }
        return car;
    }
}


