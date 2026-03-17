package com.java.learning;
// 测试逻辑运算符的使用
/*
1.& && | || ! ^
2.逻辑运算符针对的都是boolean类型的变量进行的操作
3.逻辑运算符运算的结果也是boolean类型。
4.逻辑运算符常使用条件判断结构、循环结构中
 */
public class LogicalOperator {
    public static void main(String[] args) {
        /*
        区分：& &&
        相同点:两个符号表达的都是"且"的关系。只有当符号左右两边的类型值均为true时，结果才为true。

        执行过程：
        1.如果符号左边是true，则& && 都会执行符号右边的操作
        2.如果符号左边是false，则&会执行符号右边的操作
                             && 不会执行符号右边的操作
        开发中：一般选择：&&
         */
        boolean b1 = true;
        b1 = false;
        int num1 = 10;

        if (b1 & (num1++ > 0)) { // 先运算 10 > 0
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        System.out.println("num1 = " + num1);

        //
        boolean b2 = true;
        b2 = false;
        int num2 = 10;

        if (b2 && (num2++ > 0)) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        System.out.println("num2 = " + num2);

        // ----------------------------------------------------
        /*
        区分：| 和 ||
        相同点:两个符号表达的都是"或"的关系。只要符号左右两边的类型值存在true，结果就为true。

        执行过程：
        1.如果符号左边是false，则| || 都会执行符号右边的操作
        2.如果符号左边是true，则|会执行符号右边的操作
                             || 不会执行符号右边的操作
        开发中：一般选择：||
         */

        boolean b3;
        b3 = true;
        int num3 = 10;

        if (b3 | (num3++ > 0)) { // 先运算 10 > 0
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        System.out.println("num3 = " + num3);

        //
        boolean b4;
        b4 = true;
        int num4 = 10;

        if (b4 || (num4++ > 0)) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        System.out.println("num4 = " + num4);
    }
}
