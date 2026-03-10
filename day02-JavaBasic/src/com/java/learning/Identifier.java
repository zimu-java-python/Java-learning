package com.java.learning;
// java中的标识符
/*
*定义：Java中变量，方法，类等要素的命名时使用的字符序列，称为标识符
*技巧：凡是可以自己起名字的地方都叫做标识符，比如：类名，方法名，变量名，包名，常量名等
*
*标识符的命名规则：(必须要遵守！！！否则编译不通过)
* 由26个英文字母大小写，0-9，_或$组成
* 数字不可以开头
* 不可以使用关键字和保留字，但可以包含关键字和保留字
* Java中严格区分大小写，长度无限制
* 标识符不可以包含空格
*
* 标识符的命名规范(建议遵守，不遵守也可以正常运行)：
* 包名：多单词组成时所有字母都小写：xxxyyyzzz
* 例如：java，lang，com.atguigu.beam
*
* 类名，接口名：多单词组成时，所有单词首字母大写：XxxYyyZzz
* 例如：HelloWorld，String，System
*
* 变量名，方法名：多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首字母大写：xxxYyyZzz
* 例如：age,name,bookName,main,binarySearch,getName
*
* 常量名：所有字母都大写，多个单词时每个单词中间用_连接：XXX_YYY_ZZZ
* 例如：MAX_VALUE,PI,DEFAULT_CAPACITY
*
* 说明：建立标识符时要“见名知意”
*/
public class Identifier {
    public static void main(String[] args) {
        System.out.println("identifier");
        int age = 12;
        char gender = '男';
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
    }
    public static void main1(String[] args){

    }
    class _a$bc{

    }

    class Public{

    }

    class PublicStatic{

    }

}
