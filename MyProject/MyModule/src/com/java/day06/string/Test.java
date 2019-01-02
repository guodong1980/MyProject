package com.java.day06.string;

/**
 * User: guodong
 * Date: 2019-01-02
 * Description:
 */
class Test {
    private int name;
    private int age;

    public Test(int name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}
