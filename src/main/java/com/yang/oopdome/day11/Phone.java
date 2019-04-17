package com.yang.oopdome.day11;

public abstract class Phone {
    private String name;
    private String type;

    public Phone() {
    }

    public Phone(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void sendmsg(){
        System.out.println("发送信息");
    }
    public void call(){
        System.out.println("打电话");
    }

    public abstract void show();

}
