package learning;

import java.awt.*;

/**
 * ClassName：ArrayExer1
 * Description：案例：
 *遍历二维数组中的元素，并求和
 * @Author 刁博翔
 * @Create 2026/3/26 16:34
 * @Version 1.0
 */
public class ArrayExer1 {
    public static void main(String[] args) {
        // 声明并定义数组
        int[][] arr1 = new int[][]{{3,5,8},{12,9}, {7,0,6,4}};

        // 定义一个变量记录元素的总和
        int count = 0;

        // 嵌套循环遍历数组
        for(int j=0;j<arr1.length;j++){
            for(int k=0;k<arr1[j].length;k++){
                count += arr1[j][k];
            }
        }

        System.out.println("元素的和是：" + count);

    }
}
