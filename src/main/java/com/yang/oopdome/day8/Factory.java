package com.yang.oopdome.day8;

public class Factory {
    //根据用户条件返回会相应商品
    //简单工厂模式
    //工厂类   抽象产品类   具体产品类   客户
    public static Goods getGoods(String type){
        Goods goods =null;
        if (type.equals("TV")){
            goods=new Tvs();
            goods.printprice();

        }else {
            goods=new Foods();
            goods.printprice();
        }
        return goods;
    }
}
