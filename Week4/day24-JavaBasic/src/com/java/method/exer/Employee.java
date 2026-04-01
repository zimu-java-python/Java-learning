package com.java.method.exer;

/**
 * ClassName：Employee
 * Description：
 *
 * @Author 刁博翔
 * @Create 2026/3/31 20:20
 * @Version 1.0
 */
public class Employee {

    // 属性
    int id;
    String name;
    int age;
    double salary;

    // 定义一个方法：用于显示员工的属性信息
    public void show(){
        System.out.println("id = " + id + ",name = " + name
                + ",age = " + age + ",salary = " + salary);
    }

    public String show1(){
        return "id = " + id + ",name = " + name
                + ",age = " + age + ",salary = " + salary;
    }
}
