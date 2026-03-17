package com.java.learning;
import java.util.Scanner;
// 使用switch-case实现:对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”。
public class SwitchCase1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入您的分数：");
        int score = input.nextInt();

        switch (score / 60) {
            case 0:
                System.out.println("不及格");
                break;
            case 1:
                System.out.println("及格");
                break;
            default:
                System.out.println("成绩输入有误");
                break;
        }

        // 方式2：体会case穿透
        switch (score) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不及格");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("及格");
                break;
            default:
                System.out.println("成绩输入有误");
                break;
        }
    }
}
