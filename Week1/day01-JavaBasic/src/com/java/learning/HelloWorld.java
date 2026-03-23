package com.java.learning;
/**
 * 总结：
 * 1.Java程序编写和执行的过程：
 * 步骤一：编写：将java代码编写在.java结尾的源文件中
 * 步骤二：编译：针对于.java结尾的源文件进行编译操作；格式：javac 源文件名.java
 * 步骤三：运行：针对于编译后生成的字节码文件，进行解释运行；格式：java 字节码文件名
 *
 * 2.针对与步骤一的编写过程进行说明
 * 一.其中class关键字，表示“类”，后面跟着类名
 *
 * 二.main()方法的格式是固定的，务必记住，表示程序的入口
 * public static void main(String[] args)
 * 如果要有变化，只能变化String[] args结构：
 * 可以写成：方式一：String args[]
 * 方式二：String[] a
 * args 全称是：arguments，可以简写成args
 *
 * 三.java程序是严格区分大小写的
 *
 * 四.关于从控制台输出数据的操作
 * System.out.println("输出的信息");   输出之后会换行
 * System.out.print();    输出之后不会换行
 * 每一行执行语句必须以";"结束
 *
 * 3.针对于步骤二的编译过程进行说明
 * 如果编译不通过，可以考虑的问题
 * 问题一.查看编译的文件名、文件路径是否书写错误
 * 问题二.查看代码中是否存在语法问题，如果存在，就可能导致编译不通过
 *
 * 编译后，会生成一个或多个字节码文件，每一个字节码文件对应一个java类，并且字节码文件名和类名相同
 *
 * 4.针对于步骤三运行的说明
 * 我们是针对于字节码文件对应的Java类进行解释运行的
 * 要注意区分大小写
 *
 * 如果运行不通过，可以考虑的问题
 * 问题一.查看解释运行的类名、字节码文件路径是否书写错误
 * 问题二.可能存在运行时异常（第九章）
 *
 * 5.一个源文件中可以生成多个类，但是最多只能有一个类使用public进行声明
 * 且要求声明为public的类的类名与源文件名相同
 *
 *
 * */
public class HelloWorld {
    // 这是我的第一个Java程序，HelloWorld
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.print("你好 世界"); // 不换行
        System.out.println("123abc");
        System.out.println(123 + 1);
    }
}
