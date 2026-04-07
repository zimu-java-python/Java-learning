package com.java.exer;

/**
 * ClassName：RecusionExer1
 * Description：
 *
 * @Author 刁博翔
 * @Create 2026/4/7 20:59
 * @Version 1.0
 */
public class RecusionExer1 {
    public static void main(String[] args) {
        RecusionExer1 r = new RecusionExer1();
        System.out.println(r.getNum(10));
        System.out.println(r.f(10));
    }
    public int getNum(int n){
        if(n==20){
            return 1;
        }else if(n==21){
            return 4;
        }else{
            return getNum(n+2) - 2*getNum(n+1);
        }
    }

    public int f(int n){
        if(n==0){
            return 1;
        }else if(n==1){
            return 4;
        }else{
            return 2*f(n-1) + f(n-2);
        }
    }
}
