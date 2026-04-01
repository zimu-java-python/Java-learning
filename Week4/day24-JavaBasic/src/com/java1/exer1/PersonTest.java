package com.java1.exer1;

import java.awt.*;

/**
 * ClassName：PersonTest
 * Description：
 *
 * @Author 刁博翔
 * @Create 2026/4/1 19:50
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "jack";
        p1.age = 21;
        p1.gender = '男';

        System.out.println(p1.name + "," + p1.age + "," + p1.gender);

        p1.study();

        System.out.println(p1.showAge());

        p1.addAge(2);
        System.out.println(p1.showAge());
    }
}
