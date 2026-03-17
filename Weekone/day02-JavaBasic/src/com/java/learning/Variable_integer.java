package com.java.learning;
// 整形和浮点型变量的使用

/*
*字节(Byte):是计算机用于计量存储容量的基本单位，一个字节等于8bit。
* 位(bit):是数据存储的最小单位。二进制数系统中，每个0或1就是一个位，叫做bit(比特)，其中8bit
就称为一个字节(Byte)。 */
public class Variable_integer {
    public static void main(String[] args) {
        System.out.println("Variable_integer");
        // 测试整形变量的使用
        // byte(1字节)(-128,127),short(2字节),int(4字节),long(8字节)

        byte b1 = 12;
        byte b2 = 127;
        // 编译不通过，因为超出了byte的范围
        // byte b3 = 128;

        short s1 = 1234;

        int i1 = 12345678;
        // 声明long类型变量时，需要提供后缀：l或L
        long l1 = 123456789l;

        // 开发中，定义整形变量时，没有特殊情况的话，通常都声明为int类型
    }
}
