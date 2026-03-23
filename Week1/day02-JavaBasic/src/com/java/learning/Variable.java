package com.java.learning;
// java中的变量
/*
* 为什么需要变量：变量是不可或缺的组成单位
* 变量的概念：
* 内存中的一个存储单位，该区域的数据可以在同一类型范围内不断变化
* 变量的构成包含的三个要素：数据类型，变量名，存储的值（符合类型）
* Java中变量声明的格式：数据类型 变量名 = 变量值;
* Java中有哪些数据类型：
* 基本数据类型（8种）：
* 整型：byte，short，int，long
* 浮点型：float，double
* 字符型：char
* 布尔型：Boolean
* 引用数据类型：
* 类（class）
* 数组（array）
* 接口（interface）
*
* 枚举（enum）
* 注解（annotation）
* 记录（record）
*
* 定义变量时，变量名要遵循标识符的命名规范和规则
*
* 说明：变量都有其作用域，变量只在作用域内有效
* 在同一个作用域内，不能声明两个同名的变量
* 定义好变量以后，就可以通过变量名的方式对变量进行调用和运算
* 变量值在赋值时必须满足变量的数据类型，并且在数据类型有效的范围内变化
* */
public class Variable {
    public static void main(String[] args) {
        System.out.println("Variable");
        char gender;// 过程一：变量的声明
        gender = '男';// 过程二：变量的赋值（或初始化）

        int age = 10;

        System.out.println(age);
        System.out.println("age = " + age);// +是连接符

        // 同一个作用域内不能声明两个同名的变量，但可以重新赋值
        // char gender = '男'; ×
        gender = '男';// √

        // 由于number没有提前声明类型，所以编译不通过
        //number = 12;

        byte b1 = 127;
        // b1 = 128; 超出范围
    }

    public static void main123(String[] args) {
        // System.out.println(gender);// age不在作用域内

        char gender = '女';
    }
}
