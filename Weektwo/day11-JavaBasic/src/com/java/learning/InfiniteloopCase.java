package com.java.learning;
/*
演示"无限"循环
1.格式：while(true), 或for(;;)
2.开发中，有时并不确定需要循环多少次，需要根据循环体内部某些条件，来控制循环的结束(使用break)
如果此循环结构不能终止，则构成了死循环!开发中要避免出现死循环。
 */

public class InfiniteloopCase {
    public static void main(String[] args) {
        for(;;){//while(true){
            System.out.println("I love you");
        }
        // 死循环后面不能有执行语句
        // System.out.println("end");
    }
}
