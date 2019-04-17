package com.yang.oopdome.day11;

public class TestPhone {
    public static void main(String[] args) {
        Phone phone = new Nokia("诺基亚", "5310");
        phone.show();
        phone.call();
        phone.sendmsg();
        ((Nokia) phone).music();
        Phone phone1 = new Iphone("苹果", "iphoneXsMax");
        phone1.show();
        phone1.call();
        phone1.sendmsg();
        ((Iphone) phone1).inter();
        ((Iphone) phone1).takePhone();
        ((Iphone) phone1).playing();
        ((Iphone) phone1).music();
    }
}
