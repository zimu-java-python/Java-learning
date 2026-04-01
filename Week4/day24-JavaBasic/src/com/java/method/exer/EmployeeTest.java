package com.java.method.exer;

/**
 * ClassName：EmployeeTest
 * Description：
 *
 * @Author 刁博翔
 * @Create 2026/3/31 20:20
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        // 员工1
        Employee p1 = new Employee();
        p1.id = 1;
        p1.name = "张三";
        p1.age = 21;
        p1.salary = 5000.0;

        // 员工2
        Employee p2 = new Employee();
        p2.id = 2;
        p2.name = "李四";
        p2.age = 21;
        p2.salary = 6000.0;

        // 替换为
        p1.show();
        p2.show();
        System.out.println(p1.show1());

        // System.out.println(p1.show()); 编译错误

//        System.out.println("id = " + p1.id + ",name = " + p1.name
//                + ",age = " + p1.age + ",salary = " + p1.salary);
//
//        System.out.println("id = " + p2.id + ",name = " + p2.name
//                + ",age = " + p2.age + ",salary = " + p2.salary);

    }
}
