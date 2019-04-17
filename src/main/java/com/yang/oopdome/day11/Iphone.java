package com.yang.oopdome.day11;

public class Iphone extends Phone implements Internet,Music,Playing,TakePhoto {
    public Iphone(String name, String type) {
        super(name, type);
    }

    @Override
    public void show() {
        System.out.println("我是一部"+getName()+"手机，型号为："+getType());
    }

    @Override
    public void inter() {
        System.out.println("上网");
    }

    @Override
    public void music() {
        System.out.println("播放音乐");
    }

    @Override
    public void playing() {
        System.out.println("播放视频");

    }

    @Override
    public void takePhone() {
        System.out.println("拍照");

    }
}
