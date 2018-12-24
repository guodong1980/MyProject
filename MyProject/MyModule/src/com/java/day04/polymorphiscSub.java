package com.java.day04;

/**
 @author 郭栋
 @create 2018-12-16 21:48
 *
 *
 */
public class polymorphiscSub extends polymorphiscBase {
    String var = "subVar";
    static String staticVar = "staticSubVar";
    String subVar = "Var only to sub";
    @Override
    void method() {
        System.out.println("sub Method");
    }
    static void staticMethod(){
        System.out.println("Sub staticMethod");
    }
    void subMethod(){
        System.out.println("subMethod");
    }
}
