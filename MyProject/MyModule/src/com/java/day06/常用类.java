package com.java.day06;

/**
 * Created with IntelliJ IDEA.
 * User: guodong
 * Date: 2019-01-01
 * Description:常用类笔记
 * 常用类:
 *  1.Object类
 *    (1)equals方法与==的区别
 *       1)==:两端是基本数据类型比较的是本身值,两端是引用类型比较的是地址值是否相等
 *       2)equals方法: a.只能处理引用类型比较,不能处理基本类型比较
 *                     b.String类,包装类,file类,Date类,这些类重写了Object类的equals()方法,比较对象的实体内容是否相同
 *    (2)toString方法
 *       1)当我们打印一个对象的引用时,实际上默认调用的就是这个对象的toString()方法
 *       2)当打印对象所在的类没有重写object中的toString()方法时,那么调用的就是Object中定义的toString()方法
 *       3)当我们打印的对象所在的类重写了toString()方法时,调用的就是我们重写的toString()方法
 *　2.String类
 *  3.包装类(Wrapper) 　　
 *    (1)种类:
 *       boolean     Boolean
 *       byte        Byte
 *       short       Short
 *       int         Integer
 *       char        Character
 *       float       Float
 *       double      Double
 *    (2)转换:基本类型--->包装类  Float f1 = new Float(float类型)
 *            包装类--->基本类型  float f2 = Float.floatValue();
 *    (3)JDk5.0以后,自动装箱和拆箱: Float f3 = 6.0(自动装箱); float f4 = f3(自动拆箱);
 *    (4)基本数据类型,包装类--->String类:调用String类的静态重载方法valueOf(Xxx x)方法
 *                              如:String str = String.valueOf(10);
 *    (5)String类--->基本数据类型,包装类:调用包装类.parseXxx(String str)方法
 *                              如:int i = Integer.parseInt(str3)
 *
 *
 *
 */


