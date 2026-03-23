package com.java.learning;
/*
随意给出一个三位整数，打印显示它的个位数，十位数，百位数的值。
格式如下:
数字xxx的情况如下：
个位数：
十位数：
百位数：

例如：
数字153的情况如下：
个位数：3
十位数：5
百位数：1

 */
public class OperatorCase1 {
    public static void main(String[] args) {
        int exam = 654;

        int num1 = exam % 10;
        int num2 = (exam / 10) % 10;// 或 int num2 = exam % 100 / 10
        int num3 = exam / 100;

        System.out.println("百位数是：" + num3);
        System.out.println("十位数是：" + num2);
        System.out.println("个位数是：" + num1);
    }
}
