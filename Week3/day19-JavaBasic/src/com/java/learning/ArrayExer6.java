package com.java.learning;

/**
 * ClassName：ArrayExer6
 * Description：案例：冒泡排序
 *如： int arr[] = new int[]{34,54,3,2,65,7,34,5,76,34,67};
 * @Author 刁博翔
 * @Create 2026/3/27 21:10
 * @Version 1.0
 */
public class ArrayExer6 {
    public static void main(String[] args) {
        int arr[] = new int[]{34,54,3,2,65,7,34,5,76,34,67};

        // 遍历
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        // 冒泡排序：实现数组从小到大排序
        for(int j = 0;j<arr.length - 1;j++){
            for(int i=0;i<arr.length - 1 - j;i++){
                if(arr[i] > arr[i+1]){
                    // 交换
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
        }

        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
