package com.java1.exer1;

/**
 * ClassName：Person
 * Description：
 *
 * @Author 刁博翔
 * @Create 2026/4/1 19:46
 * @Version 1.0
 */
public class Person {
    String name;
    int age;
    char gender;

    public void study(){
        System.out.println("Studying");
    }

    public int showAge(){
        return age;
    }

    public void addAge(int addAge){
        age += addAge;
    }
}
