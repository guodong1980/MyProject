package com.java.day05;

import java.util.SplittableRandom;

/**
 * Created with IntelliJ IDEA.
 * Description: 
 * User: guodong
 * Date: 2018-12-30
 */
class Person {
    private int age;
    private String  name;


    Person(int age,String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name) {
        this.name = name;
    }


    public void setAge(int age) {
        if (age > 0 && age < 130) {
            this.age = age;
        } else {
            System.out.println("你输入的年龄不对");
        }
    }
}
