package com.java.learning;

import java.util.Scanner;

/**
 * ClassName：ArraytTest
 * Description：案例
 * 案例:输出英文星期几
 *
 * 用一个数组，保存星期一到星期天的7个英语单词，从键盘输入1-7，显示对应的单词
 * {"Monday","Tuesday", "Wednesday","Thursday", "Friday", "Saturday", "Sunday"}
 * @Author 刁博翔
 * @Create 2026/3/25 20:01
 * @Version 1.0
 */
public class ArraytTest {
    public static void main(String[] args) {
//        声明并定义一个数组
        String[] Week = {"Monday","Tuesday",
                "Wednesday","Thursday", "Friday", "Saturday", "Sunday"};

        // 从键盘获取数据
        Scanner input = new Scanner(System.in);
        System.out.print("请输入1-7：");
        int day = input.nextInt();

        if (day < 1 || day > 7) {
            System.out.println("您输入的数据有误");
        }else  {
            System.out.println(Week[day-1]);
        }

        input.close();
    }
}
