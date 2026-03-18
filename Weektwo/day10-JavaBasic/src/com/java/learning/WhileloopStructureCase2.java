package com.java.learning;
/*随机生成一个100以内的数，猜这个随机数是多少?
从键盘输入数，
    如果大了，提示大了;
    如果小了，提示小了;
    如果对了，就不再猜了，并统计一共猜了多少次

提示:生成一个[a,b]范围的随机数的方式:(int)(Math.random()*(b - a+1)+a)
 */
import java.util.Scanner;
public class WhileloopStructureCase2 {
    public static void main(String[] args) {
        // 生成一个随机数
        int num = (int) (Math.random()*100)+1;
        System.out.println(num);

        // 从键盘获取一个数据
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a guess:");
        int guess = sc.nextInt();

        // 使用循环结构，进行多次循环的对比和获取数据
        int count = 1;
        while(guess != num){
            if(guess > num){
                System.out.println("您猜的大了!");
            }else if(guess < num){
                System.out.println("您猜的小了!");
            }
            System.out.print("enter a guess:");
            guess = sc.nextInt();
            count++;
        }
        System.out.println("恭喜你猜对了！" + "您猜了" + count + "次");

        sc.close();
    }
}
