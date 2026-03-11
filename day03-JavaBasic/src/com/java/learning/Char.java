package com.java.learning;
// java中的字符类型和布尔类型
/*
* */
public class Char {
    public static void main(String[] args) {
        System.out.println("Char");
        // 字符类型：char(2字节)

        // 表示形式1：使用一对单引号''表示，内部有且只有一个字符
        char c1 = 'a';
        char c2 = '中';
        char c3 = '1';
        char c4 = 'γ';
        char c5 = '%';

        //  编译不通过
        // char c6 = '';
        // char c7 = 'ab';

        // 表示形式2：直接使用unicode值来表示字符型常量
        char c8 = '\u0043';
        char c9 = '\u0036';
        System.out.println(c8);
        System.out.println(c9);

        // 表示形式3：使用转义字符
        char c10 = '\n';
        char c11 = '\t';
        System.out.println("hello" + c10 + "world");
        System.out.println("hello" + c11 + "world");

        // 表示形式4：使用字符对应的数值（ASCII码）
        // a:97,A:65,0:48
        char c12 = 97;
        System.out.println(c12);

        char c13 = '1';
        char c14 = 1;


    }
}
