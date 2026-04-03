package com.java1.exer;

/**
 * ClassName：ValueTransferTest3
 * Description：
 *
 * @Author 刁博翔
 * @Create 2026/4/3 20:20
 * @Version 1.0
 */
public class ValueTransferTest3 {
    public static void main(String[] args) {
        ValueTransferTest3 test = new ValueTransferTest3();
        Date date = new Date();
        date.m = 10;
        date.n = 20;

        System.out.println("m = " + date.m + ",n = " + date.n);

//        int temp = date.m;
//        date.m = date.n;
//        date.n = temp;

        // 操作2
        test.swap(date);


        System.out.println("m = " + date.m + ",n = " + date.n);
    }
    public void swap(Date date) {
        int temp = date.m;
        date.m = date.n;
        date.n = temp;
    }
}

class Date{
    int m;
    int n;
}
