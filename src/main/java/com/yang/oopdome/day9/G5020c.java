package com.yang.oopdome.day9;

public class G5020c extends Phone implements Music {
    public G5020c(String brand, String type) {
        super(brand, type);
    }

    public G5020c() {
    }


    public void music(String tpye) {
        System.out.println("开始播放:"+tpye);
    }

    @Override
    public void call() {
        System.out.println("可以语音通话");

    }

    @Override
    public void send() {
        System.out.println("可以发送文字信息");
    }
}
