package com.java.learning;
// 题目:输出所有的水仙花数，
// 所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。
// 例如:153 = 1*1*1 + 3*3*3 + 5*5*5
public class loopStructureCase2 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = (i / 10) % 10;
            int bai = i / 100;
            if ((ge * ge * ge) + (shi * shi * shi) + (bai * bai * bai) == i) {
                count++;
                System.out.println(i + "是一个水仙花数");
            }
        }
        System.out.println("一共有" + count + "个水仙花数");
    }
}

