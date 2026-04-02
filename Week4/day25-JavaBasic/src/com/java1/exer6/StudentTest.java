package com.java1.exer6;



/**
 * ClassName：StudentTest
 * Description：
 *
 * @Author 刁博翔
 * @Create 2026/4/2 20:12
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        // 创建一个Student[]
        Student[]  students = new Student[20];

        // 使用循环，给数组的元素赋值
        for(int i=0;i<students.length;i++){
            students[i] = new Student();
            // 给每一个学生对象的number，state，score属性赋值
            students[i].number = i + 1;
            students[i].state = (int)(Math.random() * 6 + 1);
            students[i].score = (int)(Math.random() * 101);
        }

        // 打印出3年级(state值为3)的学生信息。
        StudentUtil util = new StudentUtil();
        util.printStudentsWithState(students,3);

        System.out.println("-----------------------------------------------");

        // 使用冒泡排序按学生成绩排序，并遍历所有学生信息

        // 排序前遍历
        util.printStudents(students);

        System.out.println("-----------------------------------------------");

        util.sortStudents(students);

        // 排序后遍历
        util.printStudents(students);


    }
}
