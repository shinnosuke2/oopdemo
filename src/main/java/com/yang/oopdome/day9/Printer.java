package com.yang.oopdome.day9;
//打印机
public class Printer {
    InkBox inkBox;
    Paper paper;

    public InkBox getInkBox() {
        return inkBox;
    }

    public void setInkBox(InkBox inkBox) {
        this.inkBox = inkBox;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }
    public void print(){
        System.out.println("使用"+inkBox.getcolor()+"，在："+paper.getPaper()+"上打印。");
    }
}
