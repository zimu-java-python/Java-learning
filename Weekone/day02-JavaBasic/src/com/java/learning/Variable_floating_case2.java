package com.java.learning;
// 案例2：小明要到美国旅游，可是那里的温度是以华氏度为单位记录的。
//它需要一个程序将华氏温度(80度)转换为摄氏度，并以华氏度和摄氏度为单位分别显示该温度。

//转换公式：°C=(°F -32)/1.8
public class Variable_floating_case2 {
    public static void main(String[] args) {
        double Fahrenheit = 80;
        double Celsius = (Fahrenheit - 32) / 1.8;
        System.out.println("当前摄氏温度是：" + Celsius + "当前华氏温度是：" + Fahrenheit);
    }
}
