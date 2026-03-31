package com.java1.method.exer;

/**
 * ClassName：MethodTest
 * Description：
 *
 * @Author 刁博翔
 * @Create 2026/3/31 21:24
 * @Version 1.0
 */
public class MethodTest {
    public static void main(String[] args) {

    }
}
class Person {

    // 属性
    String name;
    int age;
    char gender;

    // 方法
    public void eat(){
        System.out.println("人吃饭");
    }

    public void sleep(int honr){
        System.out.println("人至少每天睡觉" + honr + "个小时");
    }

    public String interests (String hobby){
        String info = "我的爱好是" + hobby;
        System.out.println(info);
        return info;
    }

    public int getAge() {
        return age;
    }


}
