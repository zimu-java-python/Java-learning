package com.java.learning;
// 演示do-while循环
/*
1.凡是循环结构，就一定会有4个要素:
初始化条件
循环条件--->一定是boolean类型的变量或表达式
循环体
迭代部分

2.do-while格式
    1.
    do{
    3
    4.
    }while(2);

3.执行过程:1->3->4->2->3->4->...->2

4.说明:
    do-while循环至少执行一次循环体。
    for、while、do-while循环三者之间是可以相互转换的
    do-while循环结构，在开发中，相较于for、while循环来讲，使用的较少。
*/
public class DoWhileloopStructureCase {
    public static void main(String[] args) {
        // 需求：遍历100以内的偶数，并输出偶数的个数和总和
        int i = 1;
        int count = 0;
        int sum = 0;
        do {
            if (i%2==0){
                count++;
                sum += i;
            }
            i++;
        }while(i<=100);
        System.out.println(count);
        System.out.println(sum);

        //------------------------------------

        // 验证：至少循环一次
        int num1 = 10;
        while(num1 > 10){
            System.out.println("while:hello");
            num1--;
        }

        int num2 = 10;
        do{
            System.out.println("do-while:hello");
            num2--;
        }while(num2 > 10);
    }
}
