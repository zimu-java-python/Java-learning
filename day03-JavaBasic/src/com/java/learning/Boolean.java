package com.java.learning;
// Java中的布尔类型
public class Boolean {
    public static void main(StringDemo[] args) {
        System.out.println("Boolean");

        // 布尔类型：boolean
        // 只有2个取值：true，false
        boolean bo1 = true;
        boolean bo2 = false;

        // 编译不通过
        // boolean bo3 = 0;
        // 常使用在流程控制语句中。比如:条件判断、循环结构等
        boolean isMarried = true;
        if (isMarried) {
            System.out.println("Married");
        }else  {
            System.out.println("Not Married");
        }

        // 不讨论Boolean类型占用的空间大小。但是，真正在内存中分配的话，使用的是4个字节
    }
}
