package com.java.day05;

/**
 * Created with IntelliJ IDEA.
 * Description: 
 * User: guodong
 * Date: 2018-12-31
 */
public class Work extends Person {
    Work(int age, String name) {
        super(age, name);
    }
    public void info() {
        eat();
        walk();
    }
}
