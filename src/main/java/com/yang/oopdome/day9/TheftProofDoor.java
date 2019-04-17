package com.yang.oopdome.day9;

public class TheftProofDoor extends Door implements Lock,TakePhoto {
    @Override
    public void open() {
        System.out.println("开门");
    }

    @Override
    public void close() {
        System.out.println("关门");
    }

    @Override
    public void lockUp() {
        System.out.println("插进钥匙，往右转三圈，咔擦，锁上了");
    }

    @Override
    public void lockOpen() {
        System.out.println("插进钥匙，往左转三圈，咔擦，锁开了");

    }


    @Override
    public void takePhoto() {
        System.out.println("咔擦，拍了一张照片，原来是夏明！");
    }
}
