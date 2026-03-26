package com.java.learning;

/**
 * ClassName：ArrayExer6
 * Description：案例:复制，赋值
 *
 * @Author 刁博翔
 * @Create 2026/3/26 17:50
 * @Version 1.0
 */
public class ArrayExer6 {
    public static void main(String[] args) {
        int[] arr1,arr2;

        // 使用大括号{}，把arr1初始化为8个素数:2,3,5.7,11,13,17,19.
        arr1 = new int[]{2,3,5,7,11,13,17,19};

        // 显示arr1的内容
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }

        // 赋值arr2变量等于arr1，修改arr2中的偶索引元素，使得其值等于索引值
        arr2 = arr1;

        for (int i = 0; i < arr2.length; i++) {
            if(i % 2 == 0){
                arr2[i] = i;
            }
        }

        // 打印出arr1（因为将地址赋值给了arr2，所以2个地址指向同一个数组结构）
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }

    }
}
