package com.java.learing;
/*
岳小鹏参加Java考试，他和父亲岳不群达成承诺:
如果:成绩为100分时，奖励一辆跑车:
成绩为(80，99]时，奖励一辆山地自行车:
成绩为[60，80]时，奖励环球影城一日游；
其它时，胖揍一顿

说明:默认成绩是在[0,100]范围内

// 注意：
    如果多个条件表达式之间没有交集(理解是互斥关系)，则哪个条件表达式声明在上面，哪个声明在下面都可以。
    如果多个条件表达式之间是包含关系，则需要将范围小的条件表达式声明在范围大的条件表达式的上面。否则，范围小的条件就不会执行
 */
public class BranchStructureCase {
    public static void main(String[] args) {
        int grade = 30;
        if (grade == 100) {
            System.out.println("奖励一辆跑车");
        }else if (80 < grade && grade <= 90) {
            System.out.println("奖励一辆山地自行车");
        }else if (60 < grade && grade <= 80) {
            System.out.println("奖励环球影城一日游");
        }else{
            System.out.println("胖揍一顿");
        }
    // 特别的：
        if (grade == 100) {
            System.out.println("奖励一辆跑车");
        }else if (80 < grade && grade <= 90) {
            System.out.println("奖励一辆山地自行车");
        }else if (60 < grade && grade <= 80) {
            System.out.println("奖励环球影城一日游");
        }//else{
//            System.out.println("胖揍一顿");
//        }
    }
}
