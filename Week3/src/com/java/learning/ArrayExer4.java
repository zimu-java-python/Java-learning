package com.java.learning;

/**
 * ClassName：ArrayExer4
 * Description：案例：评委打分
 *
 * @Author 刁博翔
 * @Create 2026/3/26 17:21
 * @Version 1.0
 */
public class ArrayExer4 {
    public static void main(String[] args) {
        // 定义数组
        int[] arr1 = new int[]{5,4,6,8,9,0,1,2,7,3};

        // 求最高分
        int Max = arr1[0];
        for (int j = 1; j < arr1.length; j++) {
            if (arr1[j] > Max) {
                Max = arr1[j];
            }
        }

        // 求最低分
        int min = arr1[0];
        for (int j = 1; j < arr1.length; j++) {
            if (arr1[j] < min) {
                min = arr1[j];
            }
        }

        // 求总分
        int sum = 0;
        for (int j = 0; j < arr1.length; j++) {
            sum += arr1[j];
        }

        // 减去一个最高分和最低分,得到最终得分
        int grade = ((sum - (Max + min)) / (arr1.length - 2));
        System.out.println(grade);
    }
}
