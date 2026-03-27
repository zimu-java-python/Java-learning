package learning;

/**
 * ClassName：ArrayExer3
 * Description：案例：
 * 定义一个int型的一维数组，包含10个元素，
 * 分别赋一些随机整数，然后求出所有元素的最大值，最小值，总和，平均并输出出来。
 * @Author 刁博翔
 * @Create 2026/3/26 17:04
 * @Version 1.0
 */
public class ArrayExer3 {
    public static void main(String[] args) {
        // 创建数组（动态初始化）
        int[] arr1 = new int[10];

        // 通过循环给数组元素赋值
        for(int i=0;i < arr1.length;i++){
            arr1[i] = (int) (Math.random() * (99 - 10 + 1)) + 10;
        }

        // 检测数组内的元素
        for (int j=0;j<arr1.length;j++){
            System.out.print(arr1[j] + ",");
        }
        System.out.println();

        // 求特征值
        // 最大值
        int Max = arr1[0];
        for (int j = 1; j < arr1.length; j++) {
            if (arr1[j] > Max) {
                Max = arr1[j];
            }
        }
        System.out.println("最大值为：" + Max);

        // 最小值
        int min  = arr1[0];
        for (int j = 1; j < arr1.length; j++) {
            if (arr1[j] < min) {
                min = arr1[j];
            }
        }
        System.out.println("最小值为：" + min);

        // 求总和
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        System.out.println("总和为：" + sum);

        // 求平均值
        System.out.println("平均值为：" + (sum / arr1.length));

    }
}
