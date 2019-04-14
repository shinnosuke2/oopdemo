package com.yang.oopdome.day6;
//测试选民投票

public class TestElection {
    public static void main(String[] args) {
//      Election zhang=new Election("张三");
//      zhang.voteFor();
        Election v = new Election();
        for (int i = 1; i <= 103; i++) {
            v = new Election("第" + i);
            v.voteFor();
        }
        Election zhang = new Election("张三");
        zhang.voteFor();
        Election.printResult();
    }
}
