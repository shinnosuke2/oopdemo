package com.yang.oopdome.day9;

public class TestUsb {
    public static void main(String[] args) {
        Usb f=new UsbFeng();
        f.service();
        Usb u=new UsbDisk();
        u.service();
    }
}
