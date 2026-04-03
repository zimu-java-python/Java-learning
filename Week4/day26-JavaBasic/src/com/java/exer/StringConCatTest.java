package com.java.exer;

/**
 * ClassName：StringConCatTest
 * Description：
 *
 * @Author 刁博翔
 * @Create 2026/4/3 19:24
 * @Version 1.0
 */
public class StringConCatTest {
    public static void main(String[] args) {
        StringConCatTest test=new StringConCatTest();
        String info = test.concat("-","hello","world");
        System.out.println(info);
        System.out.println(test.concat("/","hello"));
        System.out.println(test.concat("-"));

    }


    public String concat(String operator,String ... strs){
        String result = "";
        for(int i=0;i<strs.length;i++){
            if(i==0){
                result += strs[i];
            }else{
                result += operator+strs[i];
            }
        }

        return result;
    }
}
