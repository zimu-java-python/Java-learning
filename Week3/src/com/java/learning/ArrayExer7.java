package com.java.learning;

/**
 * ClassName：ArrayExer7
 * Description：
 *
 * @Author 刁博翔
 * @Create 2026/3/26 18:03
 * @Version 1.0
 */
public class ArrayExer7 {
    public static void main(String[] args) {
        int[] arr1,arr2;

        // 使用大括号{}，把arr1初始化为8个素数:2,3,5.7,11,13,17,19.
        arr1 = new int[]{2,3,5,7,11,13,17,19};

        // 显示arr1的内容
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }

        // 复制arr1数组给arr2，修改arr2中的偶索引元素，使得其值等于索引值
        arr2 = new int[arr1.length];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr1[i];
        }

        System.out.println();
        System.out.println(arr1);
        System.out.println(arr2);

        // 打印出arr1（因为将地址赋值给了arr2，所以2个地址指向同一个数组结构）
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
    }
}
