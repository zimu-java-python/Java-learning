package com.java1.exer;

/**
 * ClassName：ValueTransferTest2
 * Description：
 *
 * @Author 刁博翔
 * @Create 2026/4/3 20:12
 * @Version 1.0
 */
public class ValueTransferTest2 {
    public static void main(String[] args) {
        ValueTransferTest2 test = new ValueTransferTest2();
        int m = 10;
        int n = 20;
        System.out.println("m = " + m + ", n = " + n);

        // 交换两个变量的值
//        int temp = m;
//        m = n;
//        n = temp;

        // 调用对象
        test.swap(m,n);

        System.out.println("m = " + m + ", n = " + n);
    }

    public void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
