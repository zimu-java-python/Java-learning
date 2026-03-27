package com.java.learning;

/**
 * ClassName：ArrayExer
 * Description：案例：反转数组
 *
 * @Author 刁博翔
 * @Create 2026/3/27 19:40
 * @Version 1.0
 */
public class ArrayExer1 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{34,54,3,2,65,7,
        34,5,76,34,67};

        // 方式1
        // 交互arr1[i] 与 arr1[arr1.length - 1 - i]位置的元素
//        for (int i = 0; i < (arr1.length / 2); i++) {
//            int temp = arr1[i];
//            arr1[i] = arr1[arr1.length - 1 - i];
//            arr1[arr1.length - 1 - i] = temp;
//        }

        // 方式2
        for (int i = 0,j = arr1.length - 1; i < j; i++,j--) {
            // 交换arr[i]和 arr[j]的位置
            int temp = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = temp;
        }


        // 方式3：不推荐
//        int[] newArr = new int[arr1.length];
//        for (int i = arr1.length -1  ; i >= 0; i--) {
//            newArr[arr1.length -1 - i] = arr1[i];
//        }
//
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.print(newArr[i] + " ");
//        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
    }
}
