package com.java.learning;
// 测试条件运算符的使用
/*
句式：(条件表达式) ？ 表达式1:表达式2

说明：条件表达式的结果是boolean类型
    若结果为true：运算结果是表达式1
    若结果为false：运算结果是表达式2
表达式1和表达式2需要是相同的类型或者是能兼容的类型

结论：开发中，凡是可以使用条件运算符的位置，都可以改写为if-else。
    反之，能使用if-else结构，不一定能改写为条件运算符。

建议：在二者都能使用的情况下，推荐使用条件运算符。因为执行效率稍高。
 */
public class ConditionalOperator {
    public static void main(String[] args) {
        String info;
        info = (2 > 1) ? "表达式1" : "表达式2";
        System.out.println(info);

        double result;
        result = (2 > 1) ? 1 : 2.0;
        System.out.println(result); // 1.0

        // 练习1：获取两个整数的较大值
        int m = 10;
        int n = 20;

        int max = (m > n) ? m : n;
        System.out.println("较大值为" + max);

        // 练习2：获取三个整数的较大值
        int i = 20;
        int j = 30;
        int k = 23;

        int tempMax = (i > j) ? i : j;
        int finalMax = (tempMax > k) ? tempMax : k;
        System.out.println("最大值为" + finalMax);

    }
}
