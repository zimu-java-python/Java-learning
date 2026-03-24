package com.java.learning;

/**
 * ClassName：OneArrayTest
 * Description：
 *
 * @Author 刁博翔
 * @Create 2026/3/24 20:27
 * @Version 1.0
 */

/*
1.数组的理解（Array）：
概念:是多个相同类型数据按一定顺序排列的集合，并使用一个名字命名，并通过编号的方式对这些数据进行统一管理。

简称：多个数据的组合

Java中的容器：数组，集合框架，在内存中对多个数据的存储

2.几个相关的概念
>数组名
>数组的元素（即内部存储的多个元素）
>数组的下标，角标，索引，index（即找到指定数组元素所使用的编号）
>数组的的长度(即数组容器中存储的元素的个数)

3.数组的特点
>数组中的元素在内存中是依次紧密排列的，有序的。
>数组，属于引用数据类型的变量。数组的元素既可以是基本数据类型，也可以是引用数据类型
>一旦初始化完成，其长度就确定了，并且不可更改
>创建数组对象会在内存中开辟一整块’连续的空间”。占据的空间的大小，取决于数组的长度和数组中元素的类型。

4.复习:变量按照数据类型的分类
4.1 基本数据类型：byte\short\char\int\long\float\double\boolean
4.2 引用数据类型：类，数组，接口，枚举，注解，记录

5.数组的类型
5.1 按照元素的类型:基本数据类型元素的数组:引用数据类型元素的数组
5.2 按照数组的维度来分：一维数组，二维数组

6.一维数组的使用（6个基本点）
>一维数组的声明和初始化
>调用数组的指定元素
>数组的属性：length，表示数组的长度
>数组的遍历

>数组元素的默认初始化值
>一维数组的内存解析（难）

7.数组元素的默认初始化值的情况
注意:以数组的动态初始化方式为例说明。

>整型数组元素的默认初始化值:
>浮点型数组元素的默认初始化值:
>字符型数组元素的默认初始化值:
>boolean型数组元素的默认初始化值:
>引用数据类型数组元素的默认初始化值:

8.一维数组的内存解析
8.1 Java中的内存结构是如何划分的?(主要示心JVM的运行时内存环境)
> 将内存区域划分为5个部分:程序计数器、虚拟机栈、本地方法栈、堆、方法区

> 与目前数组相关的内存结构: 比如 int arr1 = new int[]{1,2,3};
    > 虚拟机栈:用于存放方法中声明的变量。 比如：arr1
    >堆：用于存放数组的实体(即数组中的所有元素) 比如:1,2,3

8.2举例:具体一维数组的代码的内存解析

 */
public class OneArrayTest {
    public static void main(String[] args) {
        // 1.数组的声明和初始化
        // 复习：变量的定义格式 ：数据类型 变量名 = 变量值;
        int num1 = 10;
        int num2;// 声明
        num2 = 20;// 初始化

        // 1.1 声明数组
        double[] prices;
        // 1.2 数组的初始化
        // 静态初始化：数组变量的赋值与数组元素的赋值操作同时进行。
        prices = new double[]{20.32,43.21,43.22};

//        String[] food;
//        food = new String[]{"拌海蜇","玉兰片","炝冬笋","龙须菜"};

        // 动态初始化：数组变量的赋值与数组元素的赋值操作分开进行。
        String[] food = new String[4];

        // 其他正确的方式
        int arr[] = new int[4];
        int[] arr1 = {1,2,3,4};// 类型推断

        // 错误的方式
//        int[] arr2 = new int[4]{1,2,3};
//        int[3] arr3 = new int[];

        // 2.数组的调用
        // 通过角标的方式，获取数组的元素
        // 角标的范围是从0开始到数组的长度-1结束
        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
        // System.out.println(prices[3]); // 报异常：ArrayIndexOutOfBoundsException

        food[0] = "拌海蜇";
        food[1] = "玉兰片";
        food[2] = "炝冬笋";
        food[3] = "龙须菜";
        //food[0] = "酱茄子"; // 报异常：ArrayIndexOutOfBoundsException

        // 3.数组的长度：用来描述数组容器中容量的大小
        // 使用length属性表示
        int long1 = food.length;
        int long2 = prices.length;
        System.out.println(long1);
        System.out.println(long2);

        // 4.如何遍历数组
//        System.out.println(food[0]);
//        System.out.println(food[1]);
//        System.out.println(food[2]);
//        System.out.println(food[3]);

        for (int i = 0; i < long1; i++) {
            System.out.println(food[i]);
        }

        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }
    }
}
