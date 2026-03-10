package com.java.learning;
// 案例1:定义圆周率并赋值为3.14.现有3个圆的半径分别为1.2、2.5、6.求它们的面积。
public class Variable_floating_case1 {
    public static void main(String[] args) {
        // 定义圆周率
        double pi = 3.14;

        // 定义三个圆的半径
        double radius1 = 1.2;
        double radius2 = 2.5;
        int radius3 = 6;

        // 计算面积
        double area1 = pi * radius1 * radius1;
        double area2 = pi * radius2 * radius2;
        double area3 = pi * radius3 * radius3;

        // 打印面积
        System.out.println("圆1的面积是：" + area1);
        System.out.println("圆2的面积是：" + area2);
        System.out.println("圆3的面积是：" + area3);

    }
}
