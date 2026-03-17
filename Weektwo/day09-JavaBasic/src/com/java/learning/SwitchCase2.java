package com.java.learning;
// 从键盘上输入2023年的"month"和"dav"，要求通过程序输出输入的日期为2023年的第几天。
import java.util.Scanner;
public class SwitchCase2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("请输入月份：");
        int month = input.nextInt();
        System.out.print("请输入天份：");
        int day = input.nextInt();

        // 假设用户输入的数据是合法的。后期我们在开发中，使用正则表达式进行校验。
        int sumDays = 0;// 记录总天数

        // 方式1：不推荐，存在数据的冗余
//        switch (month) {
//            case 1:
//                break;
//            case 2:
//                sumDays += 31;
//                break;
//            case 3:
//                sumDays += 59;
//                break;
//            case 4:
//                sumDays += 90;
//                break;
//            case 5:
//                sumDays += 120;
//                break;
//            case 6:
//                sumDays += 151;
//                break;
//            case 7:
//                sumDays += 181;
//                break;
//            case 8:
//                sumDays += 212;
//                break;
//            case 9:
//                sumDays += 243;
//                break;
//            case 10:
//                sumDays += 273;
//                break;
//            case 11:
//                sumDays += 304;
//                break;
//            case 12:
//                sumDays += 334;
//                break;
//
//        }

//        if (day >= 1 && day <= 31) {
//            sumDays += day;
//        }


        // 方式2：推荐
        switch (month) {
            case 12:
                sumDays += 30;
            case 11:
                sumDays += 31;
            case 10:
                sumDays += 30;
            case 9:
                sumDays += 31;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 30;
            case 6:
                sumDays += 31;
            case 5:
                sumDays += 30;
            case 4:
                sumDays += 31;
            case 3:
                sumDays += 28;
            case 2:
                sumDays += 31;
            case 1:
                sumDays += day;
                break;
        }
        System.out.println(month + "月" + day + "日是2023年的第" +  sumDays + "天");

        input.close();
    }
}
