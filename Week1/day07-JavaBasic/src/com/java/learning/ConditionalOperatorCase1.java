package com.java.learning;
// 今天是周2，10天以后是周几?

// 要求:控制台输出"今天是周2，10天以后是周x"

public class ConditionalOperatorCase1 {
    public static void main(String[] args) {
        int week = 4;

        week += 10;
        int NewWeek = week %= 7;
//        NewWeek = (NewWeek == 0) ? 7 : NewWeek;
        System.out.println("今天是周4,10天以后是周" + ((NewWeek == 0) ? "日" : NewWeek));

    }
}
