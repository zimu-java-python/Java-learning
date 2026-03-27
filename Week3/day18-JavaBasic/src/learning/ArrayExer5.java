package learning;

/**
 * ClassName：ArrayExer5
 * Description：案例:使用二维数组打印一个10行杨辉三角。
 *
 * @Author 刁博翔
 * @Create 2026/3/26 17:31
 * @Version 1.0
 */
public class ArrayExer5 {
    public static void main(String[] args) {
        // 创建二维数组
        int[][] yangHui = new int[10][];

        // 使用循环结构，初始化外层数组元素
        for (int i = 0; i < yangHui.length; i++) {
            yangHui[i] = new int[i+1];
            // 给数组的元素赋值
            // 给数组每行的首末元素赋值为1
            yangHui[i][0] = 1;
            yangHui[i][i] = 1;

            // 给数组每行的非首末元素赋值
            for (int j = 1; j < yangHui[i].length - 1; j++) {
                yangHui[i][j] =  yangHui[i-1][j-1] + yangHui[i-1][j];
            }
        }

        // 遍历二维数组
        for (int i = 0; i < yangHui.length; i++) {
            for (int j = 0; j < yangHui[i].length; j++) {
                System.out.print(yangHui[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
