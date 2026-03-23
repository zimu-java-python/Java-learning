package com.java.learning;
// 循环结构之一:for循环
/*
1.Java中规范了3种循环结构:for、while、do-while
2.凡是循环结构，就一定会有4个要素:
    初始化条件
    循环条件-->一定是布尔类型的变量或者表达式
    循环体
    迭代部分
3.for循环的格式：
    for(1;2;4){
        3
}
执行过程：1->2->3->4->2->3->4->...->2

 */
public class loopStructureCase {
    public static void main(String[] args) {
        // 需求一：输出5行hello world
        for(int i = 1;i <= 5;i++){
            System.out.println("HelloWorld");
        }

        // 需求二：
        int num = 1;
        for(System.out.print("a");num < 3;System.out.print("c"),num++){
            System.out.print("b");// abcbc
        }
        System.out.println();

        // 需求三：遍历1-100以内的偶数，并获取偶数的个数，获取所有偶数的和
        int count = 0;
        int sum = 0;

        for(int i = 1;i <= 100;i++){
            if(i%2==0){
                count++;
                sum += i;
            }
        }
        System.out.println("1-100以内有" + count + "个偶数");
        System.out.println("1-100以内所有偶数的和是" + sum);

    }
}
