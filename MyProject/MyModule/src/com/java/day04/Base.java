package com.java.day04;

/**
 * @author 郭栋
 * @create 2018-12-16 19:02  //
 */
public class Base {
    //    方法重载(Overload)
    int id;
    String name;//姓名

    public Base(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void say(int id, String name) {
        System.out.println("id = " + id + '\t' + "name=" + name);
    }

    public void say(String name) {
        System.out.println("name = " + name);
    }

}
