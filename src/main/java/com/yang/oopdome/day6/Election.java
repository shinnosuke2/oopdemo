package com.yang.oopdome.day6;

//静态变量 选民投票
public  class Election {
    //投票数到达100停止投票
    //所有选民都会改变同一个数据
    private String name;//姓名
    private static int i = 0;//静态变量  投票总数
    private static final int MAX_I = 100;//静态常量

    public static int getI() {

        return i;
    }

    public static void setI(int i) {
        Election.i = i;
    }

    public Election() {

    }

    public Election(String name) {
        this.name = name;
    }

    public String getName() {


        return name;
    }


    public void setName(String name) {
        this.name = name;
        i++;
    }

    //投票
    public void voteFor() {
        if (i == MAX_I) {
            System.out.println("投票结束");
            return;
        } else {
            i++;
            System.out.println("感谢" + name + "投票");
        }
    }

    //打印投票结果
    public static void printResult() {

        System.out.println( "投票总数"+i);

    }
}