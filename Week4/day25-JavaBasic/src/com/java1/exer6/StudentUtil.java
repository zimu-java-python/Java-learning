package com.java1.exer6;

/**
 * ClassName：StudentUtil
 * Description：
 *
 * @Author 刁博翔
 * @Create 2026/4/2 20:39
 * @Version 1.0
 */
public class StudentUtil {
    /**
     * 打印出指定年级的学生信息
     */
    public void printStudentsWithState(Student[] students,int state ) {
        for(int i=0;i<students.length;i++){
            if(students[i].state== state){
                Student stu = students[i];
//                System.out.println("number:"+stu.number+",state:"+stu.state
//                        +",score:"+stu.score);
                System.out.println(stu.show());
            }
        }
    }

    /**
     * 遍历指定的学生数组
     * @param students
     */
    public void printStudents(Student[] students) {
        for (int i=0;i<students.length;i++){
            System.out.println(students[i].show());
        }
    }

    /**
     * 针对学生数组按照score，从低到高进行排列
     * @param students
     */
    public void sortStudents(Student[] students) {
        for(int i=0;i<students.length - 1;i++){
            for(int j = 0;j<students.length - 1 - i;j++){
                if(students[j].score > students[j+1].score){
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;

                }
            }
        }
    }


}
