package com.java.learning;
// 测试比较运算符的使用
/*
1. == ！= > < >= <= instanceof

2.说明
instanceof 在面向对象的多态性的位置讲解
== ！= > < >= <= 适用于除boolean（ == ！= 可以）类型之外的其它7种基本数据类型。
运算的结果为boolean类型
了解：== ！= 可以适用于引用数据类型
区分：== 与 =

 */
public class ComparisonOperator {
    public static void main(String[] args) {
        int m1 = 10;
        int m2 = 20;
        boolean compare1 = m1 > m2;
        System.out.println(compare1);

        int n1 = 10;
        int n2 = 20;
        System.out.println(n1 == n2); // false
        System.out.println(n1 = n2); // 将n2赋值给n1，再打印：20

        boolean b1 = false;
        boolean b2 = true;
        System.out.println(b1 == b2); // false
        System.out.println(b1 = b2); //True
    }
}
