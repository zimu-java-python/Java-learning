package com.java.learning;
// 测试运算符的使用1:算术运算符的使用
/*
1.+ - + - * / % （前）++ （后）++ （前）-- （后）-- +
 */
public class OperatorDemo1 {
    public static void main(String[] args) {
        // 除法：/
        int m1 = 12;
        int n1 = 5;
        int k1 = m1 / n1;
        System.out.println(k1);// 2

        System.out.println(m1 / n1 * n1); // 按顺序求解 10

        // 取模（或取余）：%
        int i1 = 12;
        int j1 = 5;
        System.out.println(i1 % j1); // 2

        // 开发中经常用来判断某个数num1是否能整数另一个数num2. num1 % num2 ==0;

        // 结论:取模以后，结果与被模数的符号相同
        int i2 = -12;
        int j2 = 5;
        System.out.println(i2 % j2); // -2

        int i3 = 12;
        int j3 = -5;
        System.out.println(i3 % j3); // 2

        int i4 = -12;
        int j4 = -5;
        System.out.println(i4 % j4); // -2

        // （前）++：先自增1，再运算
        // （后）++：先运算，再自增1
        int a1 = 10;
        int b1 = ++a1;
        System.out.println(a1);// 11
        System.out.println(b1);// 11

        int a2 = 10;
        int b2 = a2++;
        System.out.println(a2);// 11
        System.out.println(b2);// 10

        // 练习1
        int i = 10;
        i++;
        //++i;
        System.out.println(i);

        // 练习2
        short s1 = 10;
        // 方式1：

        // 编译不通过
        // s1 = s1 + 1;

        // s1 = (short) (s1 + 1);
        // System.out.println(s1);

        // 方式2：
        s1++;
        System.out.println(s1);

        // -----------------------------------------
        // （前）--：先自减1，再运算
        // （后）--：先运算，再自减1
        // 略

        // +：连接符：只适用于String和其他变量之间的运算，结果也是String类型
    }
}
