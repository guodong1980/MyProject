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
    int id;


    Person(int age,String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println("吃饭");
    }
    public void walk() {
        System.out.println("走路");
    }
    public void setAge(int age) {
        if (age > 0 && age < 130) {
            this.age = age;
        } else {
            System.out.println("你输入的年龄不对");
        }
    }
}
