package com.java.exer;

/**
 * ClassName：RecusionExer2
 * Description：
 *
 * @Author 刁博翔
 * @Create 2026/4/7 21:14
 * @Version 1.0
 */
public class RecusionExer2 {
    public static void main(String[] args) {
        RecusionExer2 r = new RecusionExer2();
        System.out.println(r.getsum(3));
        System.out.println(r.getsum(10));
        System.out.println(r.getsum(24));
    }
    public int getsum(int a){
        if(a==1){
            return 1;
        }else if (a==2){
            return 1;
        }else{
            return getsum(a-1) +  getsum(a-2);
        }
    }
}
