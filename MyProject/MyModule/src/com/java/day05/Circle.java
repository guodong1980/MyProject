package com.java.day05;

/**
 * Created with IntelliJ IDEA.
 * Description:继承计算圆的面积
 * User: guodong
 * Date: 2018-12-31
 */
public class Circle {
    private double radius;
    public Circle() {
        this.radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    //计算面积
    public double findArea(){
        return Math.PI * radius * radius;
    }
}
