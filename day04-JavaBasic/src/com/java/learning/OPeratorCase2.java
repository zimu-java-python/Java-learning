package com.java.learning;
/*
案例2:为抵抗洪水，战士连续作战89小时，编程计算共多少天零多少小时?
 */
public class OPeratorCase2 {
    public static void main(String[] args) {
        int hours = 936;
        int days = hours / 24;
        int hour = hours % 24;
        System.out.println("共" + days + "天" + hour + "小时");

        // 额外的练习1：
        System.out.println("5 + 5 = " + 5 + 5);// 5+5=55
        System.out.println("5 + 5 = " + (5 + 5));// 5+5=10

        // 额外的练习2：
        byte bb1 = 127;
        bb1++;
        System.out.println("bb1 = " + bb1);// -128

        // 额外的练习3：
        int i = 1;
        int j = i++ + ++i * i++;
        System.out.println("j = " + j);// 10
        System.out.println("i = " + i);// 4

        // 额外的练习4：
        int i1 = 2;
        int j1 = i1++;
        System.out.println(j1);// 2

        int m = 2;
        m = m++;
        System.out.println(m);// 2

        int k = 2;
        k = ++k;
        System.out.println(k);
    }
}
