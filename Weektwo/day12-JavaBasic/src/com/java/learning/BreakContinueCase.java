package com.java.learning;
// 关键字break和continue的使用
/*              使用范围        在循环结构中的作用           相同点
break：          switch-case
                循环结构中       结束（或跳出）当前循环结构   在此关键字的后面不能声明执行语句。

continue：       循环结构中       结束（或跳出）当“次”循环   在此关键字的后面不能声明执行语句。

2.了解带标签的break和continue的使用

3.开发中，break的使用频率要远高于continue
 */
public class BreakContinueCase {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 4 == 0) {
                // break;
                continue;

                // 编译不通过
                // System.out.println("111");
            }
            System.out.print(i);
        }
        System.out.println();
        // --------------------------------------------
        label:for (int j = 1; j <= 4; j++) {
            for (int i = 1; i <= 10; i++) {
                if (i % 4 == 0) {
                    // break;
                    // continue;

                    // 了解
                    // break label;
                    continue label;

                    // 编译不通过
                    // System.out.println("111");
                }
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
