package com.java.learning;

/**
 * ClassName：FieldTest
 * Description：
 *
 * @Author 刁博翔
 * @Create 2026/3/31 19:53
 * @Version 1.0
 */
public class FieldTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        System.out.println(p1.name + "," +  p1.age);

        p1.sleep(8);

    }
}

class Person{
    // 属性(成员变量)
    String name;
    int age;
    char gender;

    // 方法
    public void eat(){
        String food = "巧克力";// 局部变量
        System.out.println("我喜欢吃：" + food);
    }

    public void sleep(int honr){// 形式参数：属于局部变量
        System.out.println("人不能小于" + honr +  "的睡眠");

        // 编译不通过，因为超出了food变量的作用域
        // System.out.println(food);

        // 编译通过
        // System.out.println("name = " + name);
    }
}
