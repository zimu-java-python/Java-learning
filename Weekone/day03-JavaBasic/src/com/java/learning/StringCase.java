package com.java.learning;
// 关于String的练习
/*
要求填写自己的姓名、年龄、性别、体重、婚姻状况(已婚用true表示，单身用false表示)、联系方式等

 */
public class StringCase {
    public static void main(String[] args) {
        String name = "刁博翔";
        int age = 20;
        char gender = '男';
        double weight = 60.5;
        boolean isMarried = false;
        String tel = "15156139172";// 不要参与运算

        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("性别：" + gender);
        System.out.println("体重：" + weight + "kg");
        System.out.println("婚姻状况：" + isMarried);
        System.out.println("联系方式：" + tel);
    }
}
