package com.java.learning;
// 测试运算符的使用2:赋值运算符
/*
1. = += -= *= /= %=
2.说明：
当“=”两侧数据类型不一致时，可以使用自动类型转换或使用强制类型转换原则进行处理。
支持连续赋值
+= -= *= /= %=不会改变变量本身的操作类型
 */
public class OperatorDemo2 {
    public static void main(String[] args) {
        int i = 5;

        long l = 10;// 自动类型提升

        byte bb1 = (byte) i;// 强制类型转换

        // 操作方式1：
        int a1 = 10;
        int b1 = 10;

        // 操作方式2：连续赋值
        int a2;
        int b2;
        // 或合并：int a2,b2;
        a2 = b2 =10;

        System.out.println(a2 + "," + b2);

        // 操作方式3：
        // int a3 = 10;
        // int b3 = 20;

        int a3 =10,b3 = 20;
        System.out.println(a3 + "," + b3);

        // ---------------------------------------------

        //说明：+=的使用
        int m1 = 10;
        m1 += 5; // 类似于：m1 = m1 +5;
        System.out.println(m1);

        byte by1 = 10;
        by1 += 5;// by1 = by1 + 5(操作报错)：应该写为：by1 = (byte) (by1 +5);
        System.out.println(by1);

        int m2 =1;
        m2 *= 0.1;// m2 = (int) (m2 * 0.1)
        System.out.println(m2);

        // 练习:如何实现变量的值增加2
        // 方式1：
        int i1 = 10;
        i1 = i1 + 2;
        System.out.println(i1);

        // 方式2：推荐
        int i2 = 10;
        i2 += 2;
        System.out.println(i2);

        // 练习2：如何实现变量的值增加1
        // 方式1：
        int i3 = 10;
        i3 = i3 +1;
        System.out.println(i3);

        // 方式2：
        int i4 = 10;
        i4 += 1;
        System.out.println(i4);

        // 方式3：
        int i5 = 10;
        i5++;
        System.out.println(i5);

        // 额外练习：
        int i6 = 10;
        i6 += (i6++) + (++i6);
        System.out.println(i6);
    }
}
