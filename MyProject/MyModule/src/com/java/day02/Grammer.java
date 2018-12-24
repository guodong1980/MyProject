package com.java.day02;

/**语法
 * 1.关键字:都以小写字母表示
 * 2.标识符:由26个英文,0-9,_或$,数字不能开头,不能包含空格,区分大小写
 * 3.java命名规范:
 *   (1)包名:多单词组成时所有字母都小写
 *   (2)类名,接口名,:多单词组成时,所有单词的首字母大写
 *   (3)变量名,方法名:多单词时,第一个单词字母小写,第二个单词开始每个单词首字母大写
 *   (4)常量名:所有字母都大写,多单词时可每个单词用下划线
 * 4.变量:
 *   (1)定义:内存中一个存储区域
 *   (2)格式:数据类型 变量名 = 初始化值;
 *   (3)特性:变量必须先定义后使用
 *   (4)分类:四类八种
 *      1)int:整形常量的默认类型,int = 5;
 *      2)byte: byte b = 127;
 *      3)short:
 *      4)long:整形常量后面要加L,如 long = 3L;
 *      5)float:浮点型的常量要加F,如:float f1 = 4.5F
 *      6)double:浮点型的常量的默认类型,如double d = 4.4
 *      7)char: 只能表示单字符,不能表示多字符,如 char c = 'd',不能是char c = 'ab';
 *              可以表示转义字符 char t = '\t'
 *      8)boolean:只取值false,true,默认是false
 * 5.变量之间的运算:(char,byte,short,int,long,float,double)
 *   (1)自动类型转换:当容量小的数据类型与容量大的类型做运算时,容量小的自动转换为容量大的
 *      1)byte,short,char之间做运算时,自动转换成int类型运行,char,byte,short==>int==>float==>double
 *      2)浮点类型运算时先转换成double类型再运算
 *      3)整形与浮点型运算,自动转换成浮点型运算
 *   (2)强制类型转换:容量大的转换成容量小的,要使用强制类型转换符(),如 int a = (int)3.14
 *      1)会导致精度损失
 *      2)"+"是连接成字符串 String ss = "abc" + 134;
 * 6.运算符:
 *   (1)算术运算符:+, -, *, /, %, ++, --, 如:/:除,  %:取余数,结果的符号取决于被模数
 *   (2)赋值运算符:=  %=   /=
 *   (3)比较运算符:==  !=  <  >   <=  >=  instanceof
 *   (4)逻辑运算符:&  |  &&  ||  !  ^
 *   (5)位运算符:<<  >>   >>>  |   &   ~(取反)   ^(异或)
 *   (6)三元运算符:
 *      1)格式:(条件表达式) ? 表达式1 : 表达式2;===>表达式1与表达式2是同种类型,一定有运算结果
 *      2)例子:String str = ( i > j) ? "i大" : "j大"
 *      3)特征:三元运算符在一定程度上可以if-else互换
 */

/**
 * 功能描述:语法
 *
 * @ClassName:Grammer
 * @Since: 1.0.0
 * @Author:guodong!
 * @Date:2018-12-23
 */


public class Grammer {
    public static void main(String[] args) {
        int myInt = 1;
        System.out.println("myInt = " + myInt);
        System.out.println("abc" + 123.5);
        boolean b1 = true;
        if (b1) {
            System.out.println("正确");
        } else {
            System.out.println("错误");
        }
        //如何使用三元运算符,输出三个数最大值
        int a = 40;
        int b = 50;
        int c = 60;
        int temp = (a > b) ? a : b;
        int result = (c > temp) ? c : temp;
        System.out.println("result = " + result);
    }
}
