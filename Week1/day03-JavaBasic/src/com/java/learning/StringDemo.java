package com.java.learning;
// 关于String的测试
/*
一、关于String的理解
* 1.String类，属于引用数据类型
* 2.String类型的变量，可以使用一对双引号""的方式进行赋值
* 3.String声明的字符串内部，可以包含0个，1个或多个字符。

二、String与基本数据类型变量间的运算
1.这里的基本数据类型包括boolean在内的8种
2.String与基本数据类型变量间只能做连接运算，使用"+"表示。
3.运算的结果是String类型
* */
public class StringDemo {
    public static void main(String[] args) {
        String str1 = "Hello World";
        System.out.println("str1");
        System.out.println(str1);

        String str2 = "";
        String str3 = "a";
        System.out.println(str2);

        // 测试连接运算
        int num1 = 10;
        boolean b1 = true;
        String str4 = "hello";

        System.out.println(str4 + b1);
        String str5 = str4 + b1;
        String str6 = str4 + b1 +num1;
        System.out.println(str6);

        // 编译不通过
        // String str7 = b1 + num1 + str4;// b1和num1不能运算

        // 如何将String类型的变量转换成基本数据类型
        String str7 = "abc"; // 不能考虑转换成基本数据类型

        int num2 = 10;
        String str8 = num2 + "";
        // 编译不通过
        // int num3 = (int) str8;

        // 如何实现?暂时了解
        int num3 = Integer.parseInt(str8);
        System.out.println(num3 +1);
    }
}
