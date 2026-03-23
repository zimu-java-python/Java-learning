package com.java.learning;
// 分支结构之switch-case的使用
/*
1.语法结构
switch(表达式){
    case 常量:
        //执行语句1
        //break;
    case 常量2:
        //执行语句2
        //break;
    ....
    default:
        // 执行语句
        // break;
}

2.执行过程
根据表达式中的值，依次匹配case语句。一旦与某一个case中的常量相等，那么就执行此case中的执行语句。
    执行完此执行语句之后
    情况1.遇到break，则执行break后，跳出当前的switch-case结构
    情况2.没有遇到break，则继续执行其后的case中的执行语句。--> case穿透
        ....
        直到遇到break或者执行完所有的case及default中的语句，退出

3.说明
switch中的表达式只能是特定的数据类型：byte，short，char，int，枚举（JDK5.0新增），String（JDK7.0新增）
case后都是常量，不能写范围
开发中，使用switch-case时，通常case匹配的情况都有限。
break:可以使用在switch-case中，一旦执行此break关键字，就跳出当前的switch-case结构
default:类似于if-else中的else结构。
    default是可选的，而且位置是灵活的。
4.switch-case 与if-else之间的转换
    开发中凡是可以使用switch-case结构的场景，都可以改写为if-else，反之不成立
    开发中，如果一个具体问题既可以使用switch-case，又可以使用if-else的时候，推荐使用switch-case。
    为什么?switch-case相较于if-else效率稍高。|
 */
public class SwitchCase {
    public static void main(String[] args) {
        int num = 1;
        switch (num){

            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;// 结束当前的switch-case结构
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("other");
                break;
        }
    }
}
