package com.java.learning;

/**
 * ClassName：ArrayExer5
 * Description：案例：二分法查找（前提是有序数组）
 *定义数组 int arr[] = new int[]{2,4,5,8,12,15,19,26,37,49,51,66,89,100};
 * 查找元素5
 * @Author 刁博翔
 * @Create 2026/3/27 20:44
 * @Version 1.0
 */
public class ArrayExer5 {
    public static void main(String[] args) {
        int arr[] = new int[]{2,4,5,8,12,15,19,26,37,49,51,66,89,100};

//        int target = 5;
        int target = 17;

        int head = 0; // 默认首索引
        int end = arr.length-1;// 默认尾索引
        boolean isFlag = false;
        while(head<end){

            int mid = (head + end) / 2;

            if(arr[mid]==target){
                System.out.println("找到了" + target + "，对应的位置为" + mid);
                isFlag = true;
                break;
            }else if(target > arr[mid]){
                head = mid+1;
            }else{ // if(target < arr[mid])
                end = mid-1;
            }
        }
        if(!isFlag){
            System.out.println("没找到");
        }

    }
}
