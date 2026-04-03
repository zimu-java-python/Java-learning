package com.java1.exer;

/**
 * ClassName：ValueTransferTest1
 * Description：
 *
 * @Author 刁博翔
 * @Create 2026/4/3 19:59
 * @Version 1.0
 */
public class ValueTransferTest1 {
    public static void main(String[] args) {
        ValueTransferTest1 test = new ValueTransferTest1();
        // 对于基本数据类型的变量来说
        int m =10;

        test.method1(m);
        System.out.println(m);//10

        // 对于引用数据类型的变量来说
        Person p = new Person();
        p.age=10;

        test.method2(p);// 传递地址值
        System.out.println(p.age);

    }

    public void method1(int m){
        m++;
    }

    public void method2(Person p){
        p.age++;
    }
}

