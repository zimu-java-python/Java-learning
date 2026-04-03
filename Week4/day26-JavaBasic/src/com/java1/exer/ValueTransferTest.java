package com.java1.exer;

import java.util.Arrays;

/**
 * ClassName：ValueTest
 * Description：
 *
 * @Author 刁博翔
 * @Create 2026/4/3 19:43
 * @Version 1.0
 */
public class ValueTransferTest {
    public static void main(String[] args) {
        // 基本数据类型的局部变量
        int m = 10;
        int n = m;// 传递的是数据值

        System.out.println("m = " + m + ", n = " + n);

        m++;

        System.out.println("m = " + m + ", n = " + n);

        // 引用数据类型的局部变量
        // 数组
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = arr1;// 传递的是地址值

        arr2[0] = 10;
        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));

        // 对象类型
        Order order1 = new Order();
        order1.orderId = 1001;

        Order order2 = order1;// 传递的也是地址值
        order2.orderId = 1002;

        System.out.println("order1 = " + order1.orderId);
        System.out.println("order2 = " + order2.orderId);

        // 测试
        Person p1 = new Person();
        p1.name = "jack";
        p1.age = 18;

        Person p2 = p1;
        System.out.println("p1 = " + p1.name);
        System.out.println("p2 = " + p2.name);
    }
}

class Order{
    int orderId;
}

class Person{
    int age;
    String name;
}

