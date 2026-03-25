package com.java.learning;

import java.util.Scanner;

/**
 * ClassName：ArrayTest2
 * Description：案例：学生考试等级划分
 * 从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
 * 成绩>=最高分-10   等级为'A'
 * 成绩>=最高分-20   等级为'B’
 * 成绩>=最高分-30   等级为'C'
 * 其余             等级为'D'
 *
 * 提示:先读入学生人数，根据人数创建int数组，存放学生成绩。
 * @Author 刁博翔
 * @Create 2026/3/25 20:22
 * @Version 1.0
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        // 从键盘输入学生的人数，根据人数，创建数组（动态初始化）
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入学生人数：");
        int Students = sc.nextInt();

        int[] scores = new int[Students];

        // 根据提示，依次输入学生的成绩，并将成绩保存在数组元素中
        System.out.println("请输入" + Students + "个成绩");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
        }
        // 获取学生成绩的最大值
        int MaxScore = 0;// 或者scores[0]
        for (int i = 0; i < scores.length; i++) {
            if (MaxScore < scores[i]) {
                MaxScore = scores[i];
            }
        }
        System.out.println("最高分是：" + MaxScore);
        // 遍历数组元素，根据学生成绩的差值，得到每个学生的等级，并输出成绩和等级
        char grade ='0';
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > MaxScore - 10) {
                grade = 'A';
            } else if (scores[i] > MaxScore - 20) {
                grade = 'B';
            } else if (scores[i] > MaxScore - 30) {
                grade = 'C';
            }else{
                grade = 'D';
            }
            System.out.println("student " + i + " score is " + scores[i]
                    + " grade is " + grade);
        }
        sc.close();
    }
}
