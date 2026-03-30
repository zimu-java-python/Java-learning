package com.java.learning02;

/**
 * ClassName：PersonTest
 * Description：
 *
 * @Author 刁博翔
 * @Create 2026/3/30 16:06
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {

        // 创建对象，类的实例化
        Person p1 = new Person();

        // 通过对象调用属性或方法
        p1.name = "jack";
        p1.age = 18;
        p1.gender = '男';

        System.out.println("name = " + p1.name
        + ", age = " + p1.age + ", gender = " + p1.gender);

        p1.eat();
        p1.sleep(10);
        p1.interests("打游戏");

        // 再创建一个Person类的实例
        Person p2 = new Person();

        p2.name = "rose";
        p2.age = 19;
        p2.gender = '女';

        System.out.println("name = " + p2.name
                + ", age = " + p2.age + ", gender = " + p2.gender);

        p1.eat();
        p1.sleep(10);
        p1.interests("画画");






    }
}
