package com.java.learning;

/**
 * ClassName：ArrayExer3
 * Description：案例：数组的缩容
 *现在有数组 int arr[] = {1,2,3,4,5,6,7};
 * 现在需要删除数组中的元素“5”
 * @Author 刁博翔
 * @Create 2026/3/27 20:11
 * @Version 1.0
 */
public class ArrayExer3 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};

        int deleteIndex = 4;

        // 方法1：不新建数组
//        for (int i = deleteIndex;i < arr.length - 1;i++){
//            arr[i] = arr[i + 1];
//        }
//
//        // 修改最后元素为默认值
//        arr[arr.length-1] = 0;

        // 方式2：新建数组，新的数组的长度比原来的数组少一个
        int arr2[] = new int[arr.length - 1];
        for (int i = 0;i < deleteIndex;i++){
            arr2[i] = arr[i];
        }

        for (int i = deleteIndex; i < arr.length - 1;i++){
            arr2[i] = arr[i+1];
        }

        arr = arr2;

        // 遍历数组
        for (int i = 0;i <arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }

        // 遍历数组
//        for (int i = 0;i < arr.length;i++){
//            System.out.print(arr[i] + "\t");
//        }
    }
}
