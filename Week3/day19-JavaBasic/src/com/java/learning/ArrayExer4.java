package com.java.learning;

/**
 * ClassName：ArrayExer4
 * Description：案例：数组的线性查找
 *定义数组：int arr[] = new int[]{34,54,3,2,65,7,34,5,76,34,67};
 * 找出元素5，并索引
 * @Author 刁博翔
 * @Create 2026/3/27 20:30
 * @Version 1.0
 */
public class ArrayExer4 {
    public static void main(String[] args) {
        int arr[] = new int[]{34,54,3,2,65,7,34,5,76,34,67};

        int target = 5;
//        int target = 15;

        // 线性查找
        // 方式一
//        boolean isFlag = true;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==target) {
//                System.out.println("索引到元素" + target+ "对应的位置为" + i);
//                isFlag = false;
//                break;
//                }
//            }
//        if(isFlag){
//            System.out.println("没找到");
//        }

        // 方式二
        int i = 0;
        for(;i<arr.length;i++){
            if(arr[i]==target) {
                System.out.println("索引到元素" + target+ "对应的位置为" + i);
                break;
            }
        }
        if(i == arr.length){
            System.out.println("没找到");
        }


        }
}
