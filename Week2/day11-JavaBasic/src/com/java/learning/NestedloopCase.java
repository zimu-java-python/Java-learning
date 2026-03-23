package com.java.learning;
/*
测试嵌套循环的使用
1.嵌套循环:是指一个循环结构A的循环体是另一个循环结构B。
外层循环:循环结构A
内层循环:循环结构B

2.说明
    内层循环充当了外层循环的循环体
    对于两层嵌套循环来说，外层循环控制行数，内层循环控制列数。
    举例：外层循环执行m次，内层循环执行n次，则内层循环的循环体共执行m*n次
    实际开发中，我们不会出现三层以上的循环结构，三层的循环结构都很少见

 */
public class NestedloopCase {
    public static void main(String[] args) {
        for (int i = 0;i <=60;i++){
            System.out.print("*");
        }

        System.out.println();
        System.out.println("------------------------------------");

        /*
        打印5行
        ******
        ******
        ******
        ******
        ******
         */
        for (int i = 1;i <=5;i++){
            for (int j = 0;j <=6;j++){
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("------------------------------------");

        /*
        打印
        *
        **
        ***
        ****
        *****
         */
        for (int i = 1;i <=5;i++){
            for (int j = 1;j <= i;j++){
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("------------------------------------");

        /*
        打印
        *****
        ****
        ***
        **
        *
         */
        for (int i = 5;i >= 1;i--){
            for (int j = 1;j <= i;j++){
                System.out.print('*');
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("------------------------------------");

        // 打印99乘法表
        for (int i = 1;i <=9;i++){
            for (int j = 1;j <= i;j++){
                System.out.print(j + "*" + i +"=" + (i*j) + "\t");
            }
            System.out.println();
        }
    }
}
