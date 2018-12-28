package com.java.day04;

/**
 @作者 郭栋
 @日期 2018-12-28
 @类名:TestCircle
 @描述:求圆的面积
 *
 *
 */
public class TestCircle {
    double radius;//定义半径
    public final double PI=3.14;

    public double getArea(){
        return PI * radius * radius;
    }

    public TestCircle(double radius) {
        this.radius = radius;
    }
}
