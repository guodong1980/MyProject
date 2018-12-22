package com.day02;

/*语法
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
 *
 *
 *
 *
 *
 */

/**
 * 功能描述: 语法
 *
 * @classname:Grammer
 * @since: 1.0.0
 * @Author:guodong
 * @Date:2018-12-22
 */

public class Grammer {
    public static void main(String[] args) {
        int myInt = 1;
        System.out.println("myInt = " + myInt);
        boolean b = true;
        if (b) {
            System.out.println("正确");
        }else {
            System.out.println("错误");
        }


    }
}
