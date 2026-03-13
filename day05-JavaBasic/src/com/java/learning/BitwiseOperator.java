package com.java.learning;
// 测试位运算符的使用
/*
1.<< >> >>> & | ^ ~
2.说明：
<< >> >>> & | ^ ~ :针对数值类型的变量或常量进行运算，运算的结果也是数值
<<:在一定范围内，每向左移动一位，结果就在原有的基础上 * 2。(正数、负数都适用)（最低位均补0）
>>:在一定范围内，每向右移动一位，结果就在原有的基础上 / 2。(正数（最高位补0）、负数（最高位补1）都适用)（不能整数，则向下取整）
>>>:右移时最高位均补0
注意：使用& | ^ ~时
二进制里1可以理解为true，
取反时符号位也取反
3.面试题：高效的方式计算2 * 8：2 << 3 或 8 << 1
 */
public class BitwiseOperator {
    public static void main(String[] args) {
        int num1;
        num1 = 7;
        System.out.println("num1 << 1 : " + (num1 << 1));
        System.out.println("num1 << 2 : " + (num1 << 2));
        System.out.println("num1 << 28 : " + (num1 << 28));
        System.out.println("num1 << 29 : " + (num1 << 29));// -536870912

        num1 = -7;
        System.out.println("num1 << 1 : " + (num1 << 1));
        System.out.println("num1 << 2 : " + (num1 << 2));
        System.out.println("num1 << 3 : " + (num1 << 3));
    }
}
