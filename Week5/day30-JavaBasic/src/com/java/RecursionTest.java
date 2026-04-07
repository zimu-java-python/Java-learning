package com.java;


/**
 * ClassName：RecursionTest
 * Description：
 *
 * @Author 刁博翔
 * @Create 2026/4/7 20:31
 * @Version 1.0
 */
public class RecursionTest {
    public static void main(String[] args) {
        RecursionTest test = new RecursionTest();
        // test.method1();
        System.out.println(test.getSum(100));
        System.out.println(test.getSum2(100));
        System.out.println(test.getMul(5));
        System.out.println(test.getSum3(10));
    }

    /**
     * 举例1：计算1-100内自然数的和
     */
    public int getSum(int num){
        int sum = 0;
        for(int i=0;i<=num;i++){
            sum+=i;
        }
        return sum;
    }

    public int getSum2(int num){
        if (num == 1){
            return 1;
        }else{
            return getSum(num-1)+num;
        }
    }

    /**
     * 举例2：计算n的阶乘
     */
    public int getMul(int num){
        if (num == 1){
            return 1;
        }else {
            return getMul(num-1)*num;
        }
    }

    /**
     * 举例3：快速排序
     */

    /**
     * 举例4：汉诺塔游戏
     */

    /**
     * 举例5：斐波那契数列
     */
    public int getSum3(int num){
        if (num == 1){
            return 1;
        }else if (num == 2){
            return 1;
        }else{
            return getSum3(num-1)+getSum3(num-2);
        }
    }

    /**
     * 举例6：
     * File类的对象表示一个文件目录
     * 计算指定的文件目录的大小，遍历指定的文件目录中的所有的文件，删除指定的文件目录。
     */



    /**
     * 如下递归方法的调用，会导致StackOverflowError
     */
    public void method1(){
        System.out.println("method1()....");
        method1();
    }

}
