package com.java.learning;
/*
世界最高山峰是珠穆朗玛峰，它的高度是8848.86米，
假如我有一张足够大的纸，它的厚度是0.1毫米。
请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
 */
public class WhileloopStructureCase3 {
    public static void main(String[] args) {

        double Thickness = 0.1;// 单位：mm
        double zf = 8848860;
        int count = 0;

        while(Thickness <= zf){
            Thickness *= 2;
            count++;
        }
        System.out.println("Thickness is "+ (Thickness / 1000));
        System.out.println("count is "+count);
    }
}
