package com.java.learning02;

/**
 * ClassName：Person
 * Description：
 *
 * @Author 刁博翔
 * @Create 2026/3/30 16:02
 * @Version 1.0
 */
public class Person {

    // 属性
    String name;
    int age;
    char gender;

    // 方法
    public void eat(){
        System.out.println("人吃饭");
    }

    public void sleep(int honr){
        System.out.println("人至少保证每天" + honr + "小时的睡眠");
    }

    public void interests(String hobby){
        System.out.println("我的爱好是：" + hobby);
    }
}
