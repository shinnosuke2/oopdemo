package com.yang.oopdome.day11;

public class Nokia extends Phone implements Music {
    public Nokia(String name, String type) {
        super(name, type);
    }

    @Override
    public void sendmsg() {
        super.sendmsg();
    }

    @Override
    public void call() {
        super.call();
    }

    @Override
    public void show() {
        System.out.println("我是一部"+getName()+"手机，型号为："+getType());
    }

    @Override
    public void music() {
        System.out.println("播放音乐");
    }
}
