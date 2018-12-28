package com.java.day04;

/**
 @作者 郭栋
 @日期 2018-12-26
 *
 *
 */
class TestPerson {
    //1.属性
    String name;
    int age;
    boolean sex;

    //2.方法
    public void eat() {
        System.out.println("人吃饭");
    }

    public void sleep() {
        System.out.println("人睡觉");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void info() {
        eat();
        sleep();
        System.out.println("name=" + name + '\t' + "age=" + age + '\t' + "sex=" + sex);
    }

    public void study() {
        System.out.println("studying");
    }
    public void showAge() {
        System.out.println("age=" + age);
    }
    public int addAge(){
        age+=2;
        return age;
    }
}
