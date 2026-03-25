package com.java.learning;

/**
 * ClassName：TwoArrayTest2
 * Description：二维数组
 *
 * @Author 刁博翔
 * @Create 2026/3/25 21:22
 * @Version 1.0
 */
public class TwoArrayTest2 {
    public static void main(String[] args) {
        // 数组的默认初始化值
        // 动态初始化1
        int arr1[][] = new int[3][2];
        boolean arr2[][] = new boolean[3][4];
        String arr3[][] = new String[3][4];
        // 外层：默认存储地址值
        System.out.println(arr1[0]);// 地址
        System.out.println(arr2[0]);// 地址
        System.out.println(arr3[0]);// 地址
        // 内层：默认与一维数组元素的不同类型的初始值相同
        System.out.println(arr1[0][0]);// 0
        System.out.println(arr2[0][0]);// false
        System.out.println(arr3[0][0]);// null

        System.out.println("=======================================");
        // 动态初始化2
        int arr4[][] = new int[4][];
        // 外层：null
        System.out.println(arr4[0]);// null

        // 内层：不存在（报错：NullPointerException）
        System.out.println(arr4[0][0]);// 报错

    }
}
