package com.yang.oopdome.day9;
//智能手机
public class I9100 extends Phone implements Internet,PlayVideo,Camer,Music {
    public I9100() {
    }

    public I9100(String brand, String type) {
        super(brand, type);
    }

    @Override
    public void takePhoto() {
        System.out.println("咔擦。。。拍照成功");
    }

    @Override
    public void internet() {
        System.out.println("已启动移动网络");

    }

    @Override
    public void call() {
        System.out.println("开始视频通话");

    }

    @Override
    public void send() {
        System.out.println("发送带有图片的信息");

    }

    @Override
    public void video() {
        System.out.println("开始播放视频《小时代》。。。。。");

    }

    @Override
    public void music(String type) {
        System.out.println("开始播放:"+type);
    }
}
