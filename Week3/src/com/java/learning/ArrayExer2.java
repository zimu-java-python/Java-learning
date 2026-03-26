package com.java.learning;

/**
 * ClassName：ArrayExer2
 * Description：案例
 *
 * @Author 刁博翔
 * @Create 2026/3/26 16:44
 * @Version 1.0
 */
public class ArrayExer2 {
    public static void main(String[] args) {
        // = :赋值符号
        int i = 10;
        int j = i;

        long l = i;// 自动类型提升

        byte b = (byte) i;// 强制类型转换

        // 举例：数组,
        // 赋值时：类型一致，维度一致
        int[] arr1 = new int[10];
        byte[] arr2 = new byte[20];
//        arr1 = arr2;// 编译不通过，原因：int[]，byte[]是两种不同类型的引用变量
        System.out.println(arr1);
        System.out.println(arr2);

        int[][] arr3 = new int[3][2];
//        arr3 = arr1;// 编译不通过

        arr3[0] = arr1;
        System.out.println(arr3[0]);
        System.out.println(arr1);
    }
}
