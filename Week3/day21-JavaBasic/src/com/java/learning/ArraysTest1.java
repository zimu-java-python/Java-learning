package com.java.learning;

import java.util.Arrays;

/**
 * ClassName：ArraysTest1
 * Description：测试数组的工具类:Arrays的使用 (了解)
 *
 * @Author 刁博翔
 * @Create 2026/3/29 20:45
 * @Version 1.0
 */
public class ArraysTest1 {
    public static void main(String[] args) {
        // 比较两个数组的元素是否依次相等:Arrays.equals
        int arr1[] = new int[]{1,2,3,4,5};
        int arr2[] = new int[]{1,2,3,4,5};

        System.out.println(arr1 == arr2);// 比地址
        boolean isEquals = Arrays.equals(arr1,arr2);
        System.out.println(isEquals);// 比内容（依次比，有顺序）

        // 输出数组元素信息:Arrays.toString
        System.out.println(arr1);// 地址
        System.out.println(Arrays.toString(arr1)); // 元素

        // 将指定的值填充到数组中：Arrays.fill
        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));

        // 使用快速排序算法实现的程序：Arrays.sort
        int arr3[] = new int[]{34,54,3,2,65,7,34,5,76,34,67};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));

        // 二分查找：Arrays.sort
        // 使用前提：数组是有序的
        int index = Arrays.binarySearch(arr3,5);
        if (index >= 0) {
            System.out.println("找到了，索引为" + index);
        }else{
            System.out.println("未找到");
        }



    }
}
