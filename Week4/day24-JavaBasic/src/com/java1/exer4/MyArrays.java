package com.java1.exer4;

/**
 * ClassName：MyArrays
 * Description：
 *
 * @Author 刁博翔
 * @Create 2026/4/1 20:26
 * @Version 1.0
 */
public class MyArrays {
    /**
     * 获取int型数组的最大值
     * @param arr 要获取最大值的数组
     * @return 数组的最大值
     */
    public int getMax(int[] arr){
        // 略
        return 0;
    }

    public int getMin(int[] arr){
        // 略
        return 0;
    }

    public int getSum(int[] arr){
        // 略
        return 0;
    }

    public int getAvg(int[] arr){
        return getSum(arr) / arr.length;
    }

    public void print(int[] arr){
        System.out.println("[");
        for(int i=0;i<arr.length;i++){
            if(i == 0){
                System.out.print(arr[i]);
            }else{
                System.out.print("," + arr[i]);
            }
        }
    }

    public int[] copy(int[] arr){
        int[] newArr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public void reverse(int[] arr){
        // 略
    }

    public void sort(int[] arr){
        for(int j=0;j<arr.length - 1;j++){
            for(int i = 0;i<arr.length - 1 - j;i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }

    /**
     * 使用线性查找的算查找指定的元素
     * @param arr 待查找的数组
     * @param target 要查找的元素
     * @return target元素在arr数组中的索引位置。若未找到，则返回-1
     */
    public int LineSearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        // 没找到
        return -1;
    }

}
