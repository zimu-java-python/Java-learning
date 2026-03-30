package com.java.learning;
/*
面向对象完成具体功能的操作的三步流程(非常重要)
步骤1.创建类，并设计类的内部成员(属性、方法)
步骤2.创建类的对象 比如：Phone p1 = new Phone();->类的实体化；
步骤3.通过对象来调用内部声明的属性或方法，并完成相关的功能
 */

/**
 * ClassName：phone
 * Description：
 *
 * @Author 刁博翔
 * @Create 2026/3/30 15:41
 * @Version 1.0
 */
public class Phone {

    // 属性(变量)
    String name;// 品牌
    double price;// 价格

    // 方法(功能)
    public void call(){
        System.out.println("手机能够拨打电话");
    }

    public void sendMessage(String message){
        System.out.println("发送信息：" + message);
    }

    public void playGame(){
        System.out.println("手机能够玩游戏");
    }


}
