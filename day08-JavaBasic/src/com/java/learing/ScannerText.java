package com.java.learing;
/*
如何从键盘获取不同类型(基本数据类型、String类型)的变量:使用Scanner类。

1.使用Scanner获取不同类型数据的步骤
    步骤1：导包： import java.util.Scanner;
    步骤2：提供（或创建）一个Scanner类的实例
    步骤3：调用Scanner类中的方法，获取指定类型的变量
    步骤4：关闭资源，调用Scanner类的close();

案例：小明注册某交友网站，要求录入个人相关信息。如下:
    请输入你的网名、你的年龄、你的体重、你是否单身、你的性别等情况

注意：
    Scanner类中提供了获取byte \short \int \long \float \double \ boolean \String类型变量的方法。
    没有提供获取char类型变量的方法。需要使用next().charAt(0)
 */

// 步骤1：导包： import java.util.Scanner;
import java.util.Scanner;

public class ScannerText {
    public static void main(String[] args) {
        // 步骤2：提供（或创建）一个Scanner类的实例
        Scanner input = new Scanner(System.in);

        System.out.println("欢迎光临");

        System.out.print("请输入您的网名：");
        // 步骤3：调用Scanner类中的方法，获取指定类型的变量
        String name = input.next();

        System.out.print("请输入您的年龄：");
        int age = input.nextInt();

        System.out.print("请输入您的体重：");
        double weight = input.nextDouble();

        System.out.print("您是否单身：（单身：true，不单身：false）");
        boolean isSingle = input.nextBoolean();

        System.out.print("请输入您的性别：");
        char gender = input.next().charAt(0);

        System.out.println("网名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("体重：" + weight);
        System.out.println("单身情况：" + isSingle);
        System.out.println("性别：" + gender);

        // 步骤4：关闭资源，调用Scanner类的close()
        input.close();

    }
}
