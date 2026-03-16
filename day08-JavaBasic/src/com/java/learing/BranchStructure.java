package com.java.learing;
// 分支结构1：if-else条件判断结构

/* 格式:l
    if(条件表达式) {
        语句块;
    }

    格式2： "2选1"
    if(条件表达式) {
        语句块;
    }else{
        语句块2;
    }

    格式3： "多选1"
    if(条件表达式1) {
        语句块1;
    }else if(条件表达式2){
        语句块2;
    }
    ...
    }else if (条件表达式3){
        语句块n;
    }else{
        语句块n+1;
    }

 */
public class BranchStructure {
    public static void main(String[] args) {
//        // 案例一：
//        // 案例1:成年人心率的正常范围是每分钟60-100次。
//        // 体检时，如果心率不在此范围内，则提示需要做进一步的检查。
//        int heart = 70;
//        if (60 < heart && heart < 100){
//            // 错误的写法：60 < heart <100;
//            System.out.println("心率正常");
//        }else{
//            System.out.println("心率不正常,需要进一步检查");
//        }
//    }

        // ------------------------------------------

        // 案例二：
        // 定义一个整数，判定是偶数还是奇数
        int num = 15;
        if (num % 2 == 0) {
            System.out.println(num + "是偶数");
        } else {
            System.out.println(num + "是奇数");
        }
    }
}
