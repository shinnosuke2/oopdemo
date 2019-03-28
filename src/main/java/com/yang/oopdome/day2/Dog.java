package com.yang.oopdome.day2;
//宠物狗类
//封装
/*
*便于使用着要正确使用系统，防止错误修改属性
* 有助于系统之间的松耦合，提高系统独立性
* 提高软件的可重用性
* 降低了构建大型系统的风险
 */
public class Dog {
    private String name="无名氏";//昵称
    private int health=100;//健康值
    private int love=0;//亲密度
    private String strain="聪明的金毛";//品种
    //为private的属性加一对setter/getter
    public void setName(String name){
        this.name=name;

    }
    public String getName(){
        System.out.print("名字叫：");
        return this.name;
    }
    public void setLove(int love){
        if (love<=0){
            this.love=60;
            System.out.print("亲密度不能低于０");
            return;
        }
        this.love=love;
    }
    public int getLove(){
        System.out.print("亲密度：");
        return this.love;
    }

    public String getStrain() {
        System.out.print("品种是：");
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    public void setHealth(int health){
        if (health<=0){//如果健康值不正确强制赋值60并结束
            this.health=60;
            System.out.print("健康值不能为负数");
            return;
        }
        this.health=health;//如果健康值合法则赋值
    }

    public int getHealth(){
        System.out.print("健康值是：");
        return this.health;
    }

    public void print(){//输出信息
        System.out.println("我叫："+name+"\n健康值是："+health+"" +
                "\n亲密度："+love+"\n品种："+strain);
    }
}
