package com.day04;

/**
 * @author 郭栋
 * @create 2018-12-16 19:16
 */
public class Sub extends Base {
    int age;
    public Sub(int id, String name) {
        super(id, name);
    }

    public Sub() {
        super(100,"小强");
    }
    // 方法覆盖
    @Override
    public void say(String name) {
        System.out.println("覆盖后的name = " + name );
    }
    public void sayAge(int age) {
        System.out.println("age = " + age);
        System.out.println(super.name);
    }
}
