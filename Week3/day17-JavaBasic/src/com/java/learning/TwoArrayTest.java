package com.java.learning;

/**
 * ClassName：TwoArrayTest
 * Description：二维数组
 *
 * @Author 刁博翔
 * @Create 2026/3/25 20:57
 * @Version 1.0
 */
public class TwoArrayTest {
    public static void main(String[] args) {
        // 1.数组的声明与初始化
        int[] arr1 = new int[10];// 一维数组
        //int[] arr1 = new int[]{1,2,3};

        int[][] arr2 = new int[3][3];// 二维数组
        // double[][] arr3 = new double[10][];
        // int[][] arr2 = new int[][]{{1,2,3},{4,5,6}};

        // 其他写法
        int arr3[][] = new int[10][10];
        int[] arr4[] = new int[10][10];
        int arr5[][] = {{1,2,3},{4,5,6}};// 类型推断
        String arr6[][] = new String[3][4];

        // 错误写法
        //int[][] arr7 = new int[2][3]{{1,2,3},{4,5,6}};
        //int[2][3] arr7 = new int[2][3]{{1,2,3},{4,5,6}};

        // 2.数组元素的调用
        int[][] arr7 =new int [][]{{1,2,3},{4,5},{6,7,8,9}};
        // 外层元素：{1,2,3},{4,5},{6,7,8,9}
        // 内层元素 1，2，3，4，5，6，7，8，9
        // 调用内层元素
        System.out.println(arr7[0][0]);
        System.out.println(arr7[2][1]);

        // 调用外层元素
        System.out.println(arr7[0]);

        // 数组的长度
        System.out.println(arr7.length);

        // 如何遍历数组
        for (int i = 0; i < arr7.length; i++) {
            for (int j = 0; j < arr7[i].length; j++) {
                System.out.println(arr7[i][j]);
            }
        }

    }
}
