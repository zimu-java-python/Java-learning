package com.java.learning;

/**
 * ClassName：ArrayExer2
 * Description：数组的扩容
 *现在有数组 int[] arr = new int[]{1,2,3,4,5};
 * 现在将数组长度扩容一倍，并将10，20，30三个数据添加到数组arr中，如何操作
 * @Author 刁博翔
 * @Create 2026/3/27 19:59
 * @Version 1.0
 */
public class ArrayExer2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};

        System.out.println(arr);

        // 扩容一倍（新建一个数组）
        int arr2[] = new int[arr.length * 2];
        // 或左移一位
        //int arr2[] = new int[arr.length << 1];

        // 将原有的数组元素复制到新数组中
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }

        // 将10，20，30三个数据添加到数组arr2中
        arr2[arr.length] = 10; // 注意不要减一
        arr2[arr.length + 1] = 20;
        arr2[arr.length + 2] = 30;

        // 将新的数组的地址赋值给原来的数组
        arr = arr2;
        System.out.println(arr2);
        System.out.println(arr);

        // 遍历新数组
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\t");
        }
    }
}
