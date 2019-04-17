package com.yang.oopdome.day11;

public class Print {
    private Paper paper;
    private InkBox inkBox;
    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public InkBox getInkBox() {
        return inkBox;
    }

    public void setInkBox(InkBox inkBox) {
        this.inkBox = inkBox;
    }
    public void print(){
        System.out.println("使用"+inkBox.getColor()+"墨盒,打印"+paper.getsize()+"纸");
    }
}
