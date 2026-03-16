package com.java.learing;
/*
测试if-else的嵌套使用
案例:由键盘输入三个整数分别存入变量num1、num2、num3，
    对它们进行排序(使用if-else if-else)，并且从小到大输出。

1.从开发经验上讲，没有写过超过三层的嵌套if-else结构。
2. 如果if-else中的执行语句块中只有一行执行语句，则此执行语句所在的一对{}可以省略。但是，不建议省略
 */
public class BranchStructureNested {
    public static void main(String[] args) {
    int num1=90;
    int num2=57;
    int num3=59;
    if (num1 < num2){
        if (num3 > num2){
            System.out.print(num1 + "<");
            System.out.print(num2 + "<");
            System.out.print(num3);
        }else if (num3 < num1){
            System.out.print(num3 + "<");
            System.out.print(num1 + "<");
            System.out.print(num2);
        }else {
            System.out.print(num1 + "<");
            System.out.print(num3 + "<");
            System.out.print(num2);
        }
    }else{
        if (num3 > num1){
            System.out.print(num2 + "<");
            System.out.print(num1 + "<");
            System.out.print(num3);
        }else if (num3 < num2){
            System.out.print(num3 + "<");
            System.out.print(num2 + "<");
            System.out.print(num1);
        }else{
            System.out.print(num2 + "<");
            System.out.print(num3 + "<");
            System.out.print(num1);
        }
    }
    }
}
