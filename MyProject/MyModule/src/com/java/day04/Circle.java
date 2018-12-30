package com.java.day04;

/**
 @作者 郭栋
 @日期 2018-12-28
 @类名:TestCircle
 @描述:求圆的面积
 *
 *
 */
public class Circle {
    double radius;//定义半径
    //public final double PI=3.14;

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
