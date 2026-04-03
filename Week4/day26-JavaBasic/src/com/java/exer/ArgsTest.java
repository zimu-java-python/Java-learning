package com.java.exer;

/**
 * ClassName：ArgsTest
 * Description：
 *
 * @Author 刁博翔
 * @Create 2026/4/3 19:06
 * @Version 1.0
 */
public class ArgsTest {
    public static void main(String[] args) {
        ArgsTest a = new ArgsTest();
        a.print();
        a.print(1);
        a.print(1,2);

        a.print(new int[]{1,2,3});


    }

    public void print(int ... numbers){
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }

//    public void print(int[] arr1){
//        System.out.println("111");
//    }

    public void print(int a){
        System.out.println("222");
    }

    public void print(int a,int b){
        System.out.println("333");
    }

    public void print(int a,int ... numbers){

    }

//    public void print(int ... numbers,int a){
//
//    } 错误
}
