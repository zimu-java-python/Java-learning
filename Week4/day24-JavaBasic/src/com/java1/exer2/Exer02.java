package com.java1.exer2;

/**
 * ClassName：Exer02
 * Description：
 *
 * @Author 刁博翔
 * @Create 2026/4/1 19:59
 * @Version 1.0
 */
public class Exer02 {
    public static void main(String[] args) {
            Exer02 a = new Exer02();
            // a.method();
            // int aera = a.method2();
            // System.out.println("面积为" + aera);

            int aera1 = a.method3(3,8);
            System.out.println(aera1);


    }

    public void method(){
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public int method2(){
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return 10 * 8;
    }

    public int method3(int m, int n){
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return m * n;
    }
}
