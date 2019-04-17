package com.yang.oopdome.day9;
//U盘
public class UsbDisk implements Usb {
    @Override
    public void service() {
        System.out.println("插上U盘，传东西");
    }
}
