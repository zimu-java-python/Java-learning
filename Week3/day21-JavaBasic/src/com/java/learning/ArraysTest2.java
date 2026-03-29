package com.java.learning;

/**
 * ClassName：ArraysTest2
 * Description：测试数组中常见的异常
 *
 * @Author 刁博翔
 * @Create 2026/3/29 21:02
 * @Version 1.0
 */
public class ArraysTest2 {
    public static void main(String[] args) {
        // 数组角标越界的异常
        int arr[] = new int[10];
        // 角标的有效范围：0-9
        // System.out.println(arr[10]);
        // System.out.println(arr[-1]);

        // 空指针异常
        // 情况1
//        int arr1[] = new int[10];
//        arr1 = null;
//        System.out.println(arr1[0]);

        // 情况2
//        int[][] arr2 = new int[3][];
//
//        // arr2[0] = new int[10];//此行代码不存在时，下一行代码出现NulLPointerException
//
//        System.out.println(arr2[0][1]);//NulLPointerException

        // 情况3
        String arr3[] = new String[4];
        System.out.println(arr3[0].toString());// NulLPointerException

        // 出现异常如何处理
        // 1.一旦程序执行中出现了异常，程序就会终止执行。
        // 2.针对异常提供的信息，修改对应的代码，避免异常再次出现。


    }
}
