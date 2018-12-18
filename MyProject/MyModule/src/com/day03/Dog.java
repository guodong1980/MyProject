package com.day03;
/**
 *
 */
class Dog {
     private int size;
     private String bread;
     private String name;
     private String age;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    void bark() {
        if(size > 60) {
            System.out.println("你的年龄大于60岁");
        } else {
            System.out.println("你的年龄小于60岁");
        }
        System.out.println("size=" + size + '\n' + "name=" + name);
    }
    public String getName() {
        return name;
    }

}
