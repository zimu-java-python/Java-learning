package com.java.learning;
/*
遍历100000以内的所有的质数。体会不同的算法实现，其性能的差别
PrimeNumberCase3是针对与PrimeNumberCase2中算法的优化
 */
public class PrimeNumberCase3 {
    public static void main(String[] args) {
        // 获取系统当前的时间
        long star = System.currentTimeMillis();

        boolean isFlag = true;// 重置

        int count = 0;// 记录质数的个数

        for (int i = 2;i <= 100000;i++){ // 遍历100000以内的自然数

            // 判断i是否是质数
            for (int j = 2;j <= Math.sqrt(i);j++){ // Math.sqrt(i)开根号
            // Math.sqrt(i)是用来限制j的上限，并不会改变i本身
                if (i % j == 0){
                    isFlag = false;
                    break;// 针对非质数有效果
                }
            }
            if(isFlag){
                // System.out.println(i);
                count++;
            }
            isFlag = true;
        }
        long end = System.currentTimeMillis();

        System.out.println("质数的个数为：" + count);// 9592
        System.out.println("花费的时间为：" + (end - star) + "ms"); // 6ms
        // 不优化：5983ms，加上break：566ms，再加上Math.sqrt()：6ms
    }
}
