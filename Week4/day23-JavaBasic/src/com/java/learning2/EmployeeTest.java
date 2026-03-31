package com.java.learning2;

/**
 * ClassName：EmployeeTest
 * Description：
 *
 * @Author 刁博翔
 * @Create 2026/3/31 20:47
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        // 员工1
        Employee1 emp1 = new Employee1();
        emp1.id = 1001;
        emp1.name = "张三";
        emp1.age = 18;
        emp1.salary = 5000;
        emp1.birthday = new MyDate();// 注意
        emp1.birthday.year = 1999;
        emp1.birthday.month = 1;
        emp1.birthday.day = 23;

        // 员工信息
        System.out.println("id = " +  emp1.id + ",name = " + emp1.name
                + ",age = " + emp1.age +  ",salary = " + emp1.salary
                + ",birthday = [" + emp1.birthday.year + "年" + emp1.birthday.month
                + "月" + emp1.birthday.day + "日]");


        // Employee emp2 = new Employee();
    }
}
