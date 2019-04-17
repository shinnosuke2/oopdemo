package com.yang.oopdome.day9;

public class TestComputer {
    public static void main(String[] args) {
       Cpu cpu=new Inter();
       Rom rom=new Sumsang();
       HardDisk hardDisk=new SanDisk();
       Computer computer=new Computer();
       computer.setCpu(cpu);
       computer.setRom(rom);
       computer.setHardDisk(hardDisk);
       computer.show();

    }
}
