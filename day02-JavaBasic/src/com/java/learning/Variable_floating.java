package com.java.learning;
// 浮点型变量的使用
/*
* float(4字节):单精度，尾数可以精确7位有效数字。很多情况下，精度很难满足需求。
* double(8字节):双精度，精度是float的两倍。通常采用此类型。*/
public class Variable_floating {
    public Variable_floating() {
    }

    public static void main(String[] args) {
        System.out.println("Variable_floating");
        // 测试浮点型变量的使用

        double d1 = 12.3;
        // 声明float类型变量时需要提供后缀：f或F
        float f1 = 12.3f;
        System.out.println("f1 = " + f1);

        // 开发中定义浮点型变量时，没有特殊情况的话，通常都声明为double类型，因为精度更高。

        // float类型表数范围要大于long类型的表数范围。但是精度不高。

        // 测试浮点型变量的精度
        // 结论:通过测试发现浮点型变量的精度不高。如果在开发中，需要极高的精度，需使用BigDecimal类替换浮点型变量
        System.out.println(0.1 + 0.2);

        float ff1 = 123123123f;
        float ff2 = ff1 + 1;
        System.out.println(ff1);
        System.out.println(ff2);
        System.out.println(ff1 == ff2);
    }

}
