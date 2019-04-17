package com.yang.oopdome.day9;

public class Computer {
     Cpu cpu;
   Rom rom;
    HardDisk hardDisk;

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Rom getRom() {
        return rom;
    }

    public void setRom(Rom rom) {
        this.rom = rom;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }
    public void show(){
        System.out.println("这台计算机的信息如下：\nCPU:"+cpu.getpai()+"\t"+cpu.getHz()+"\n运存："+rom.gettype()+"\t"+rom.getrom()+"G\n内存："+hardDisk.getrom());
    }
}
