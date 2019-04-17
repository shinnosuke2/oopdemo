package com.yang.oopdome.day9;

public class TestI9001 {
    public static void main(String[] args) {
        I9100 i9100 = new I9100("HTC", "I9001");
        i9100.show();
        i9100.internet();
        i9100.video();
        i9100.takePhoto();
        i9100.music("勇气");
        i9100.send();
        i9100.call();
    }
}
