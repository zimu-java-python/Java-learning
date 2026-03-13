package com.java.learning;
//案例：如何交换两个int型变量的值?String呢?
public class BitwiseOperatorCase1 {
    public static void main(String[] args) {
        int m,n;
        m = 10;
        n = 20;

        System.out.println("m = " + m + " n = " + n);

        // 交换两个变量的值
        // 方式1：声明一个临时变量（推荐）
//        int temp;
//        temp = m;
//        m = n;
//        n = temp;
//
        // 方式2：优点：不需要定义临时变量 缺点：难，适用性差（不适用非数值类型，可能超出int范围）
//        m = m + n;
//        n = m - n;
//        m = m - n;

        // 方式3：优点：不需要定义临时变量 缺点：真难，适用性差（不适用非数值类型）
        m = m ^ n;
        n = m ^ n;
        m = m ^ n;



        System.out.println("m = " + m + " n = " + n);


    }
}
