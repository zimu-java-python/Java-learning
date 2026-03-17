package com.java.learning;
// 如何获取一个随机数
/*
1.可以使用Java提供的API:math类的random()： double类型
2.random()调用后会返回一个[0.0.1.0)范围的double型的随机数
3.  需求1：获取一个[0,100]的随机整数
    需求2：获取一个[1,100]的随机整数
4.  需求3:获取一个[a,b]范围的随机整数?
    (int) (Math.random() * (b - a + 1) + a)

 */
public class MathRandomCase {
    public static void main(String[] args) {
        double d1 = Math.random();
        System.out.println(d1);

        // 需求1
        int num1 = (int) (Math.random() * 101);
        System.out.println(num1);

        // 需求2
        int num2 = (int) (Math.random() * 100) + 1;
        System.out.println(num2);
    }
}
