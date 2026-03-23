package com.java.learning;
/*
从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序。
 */
import java.util.Scanner;
public class InfiniteloopCase2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count1 = 0;
        int count2 = 0;
        boolean flag = true;

        do {
            System.out.print("请输入一个的整数：");
            int num = sc.nextInt();

            if(num > 0){
                count2++;
                System.out.println("正数有："+count2 + "个");
                System.out.println("负数有："+count1 + "个");
                // System.out.println("请输入一个的整数");
            }else if(num < 0) {
                count1++;
                System.out.println("正数有："+count2 + "个");
                System.out.println("负数有："+count1 + "个");
                // System.out.println("请输入一个的整数");
            }else {
                System.out.println("正数有："+count2 + "个");
                System.out.println("负数有："+count1 + "个");
                System.out.println("程序结束");
                flag = false;
            }
        }while(flag);

        sc.close();
    }
}
