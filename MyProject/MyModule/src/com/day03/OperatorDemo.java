package com.day03;

/**
 * @Created by sing on 2018-12-11.
 * @desc:
 * @Author:郭栋
 * 1.关键字:
 * 2.标识符:可以自己命名的地方,如类名,方法名等,由字母,0-9,_或$,不能以数字开头
 * 3.变量:四类八样
 */
public class OperatorDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        /*dog.size = 5000;
        dog.name = "郭栋";

        dog.bread = "法式软面包";
        Dog[] pets = new Dog[6];
        pets[1] = new Dog();
        pets[1].name = "小明";
        pets[1].size = 100;
        pets[1].bread = "饭团";*/
        dog.setAge("100");
        dog.setName("小明");
        dog.setSize(500);
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        if(dog1.equals(dog2)) {
            System.out.println("dog1与dog2相等");
        } else {
            System.out.println("dog1与dog2不相等");

        }



        dog.bark();
//        pets[1].bark();
//        System.out.println("dog.size = " + dog.size);




    }
}
