package com.java2.exer2;

/**
 * ClassName：OverloadExer
 * Description：
 *
 * @Author 刁博翔
 * @Create 2026/4/2 21:17
 * @Version 1.0
 */
public class OverloadExer {
    public static void main(String[] args) {
        OverloadExer test = new OverloadExer();

        int num = test.mOL(5);
        System.out.println(num);

        int num2 = test.mOL(5,6);
        System.out.println(num2);

        test.mOL("hello");
    }


    public int mOL(int a){
        int num = a * a;
        return num;
    }

    public int mOL(int a,int b){
        int num =  a * b;
        return num;
    }

    public void mOL(String s1){
        System.out.println(s1);
    }

    public int max(int a,int b){
        return a>b?a:b;
    }

    public double max(double a,double b){
        return a>b?a:b;
    }

    public double max(double a,double b,double c){
        double tempMax = max(a,b);
        return max(tempMax,c);
    }
}
