package com.java.learning;
/*
题目:找出100以内所有的素数(质数)?100000以内的呢?

质数:只能被1和它本身整除的自然数。比如: 2,3,5,7,11,13,17,19,23,....
---->换言之：从2开始到这个自然数-1为止，不存在此自然数的约数。
 */
public class PrimeNumberCase {
    public static void main(String[] args) {
        /*
        方式1
        for (int i = 2;i <= 100;i++){ // 遍历100以内的自然数

            int number = 0;// 重置
            // 判断i是否是质数
            for (int j = 2;j < i;j++){

                if (i % j == 0){
                    number++;
                }
            }
            if(number == 0){
                System.out.println(i);
            }
        }
    */
        // 方式2
        for (int i = 2;i <= 100;i++){ // 遍历100以内的自然数

            boolean isFlag = true;// 重置
            // 判断i是否是质数
            for (int j = 2;j < i;j++){

                if (i % j == 0){
                    isFlag = false;
                }
            }
            if(isFlag){
                System.out.println(i);
            }
        }
    }
}
