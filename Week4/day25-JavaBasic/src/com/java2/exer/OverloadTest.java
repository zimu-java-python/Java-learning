package com.java2.exer;

/**
 * ClassName：OverloadTest
 * Description：方法的重载
 *
 * @Author 刁博翔
 * @Create 2026/4/2 21:03
 * @Version 1.0
 */
public class OverloadTest {
    public static void main(String[] args) {
        OverloadTest test = new OverloadTest();
        test.add(1,2,3);
    }


    public void add(int i,int j){

    }

    public void add(int i,int j,int k){

    }

    public void add(String s1,String s2){

    }

    public void add(String s1,int i){

    }

    public void add(int i,String s1){

    }

//    public int add(int i,int j){
//        return 0;
//    }

}
