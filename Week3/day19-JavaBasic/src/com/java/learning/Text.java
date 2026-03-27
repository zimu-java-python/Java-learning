package com.java.learning;

/**
 * ClassName：Text
 * Description：案例：冒泡排序
 * 如： int arr[] = new int[]{34,54,3,2,65,7,34,5,76,34,67};
 * @Author 刁博翔
 * @Create 2026/3/27 21:21
 * @Version 1.0
 */
public class Text {
    public static void main(String[] args) {
        int arr[] = new int[]{34,54,3,2,65,7,34,5,76,34,67};

        // 遍历排序前的数组
        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        // 冒泡排序
        for(int i=0;i<arr.length - 1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        // 遍历排序后的数组
        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
