package com.java.day05;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: guodong
 * Date: 2018-12-31
 */
public class Student extends Person {
    int id;
    Student(int age, String name,int id) {
        super(age, name);
        this.id = id;
    }

    public Student(String name) {
        super(name);
    }
}
