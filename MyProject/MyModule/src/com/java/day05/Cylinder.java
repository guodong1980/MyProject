package com.java.day05;

/**
 * Created with IntelliJ IDEA.
 * Description:继承计算圆柱的体积
 * User: guodong
 * Date: 2018-12-31
 */
public class Cylinder extends Circle {
    private double length;

    public Cylinder() {
        this.length = 1;
    }

    @Override
    //重写父类的面积计算方法
    public double findArea() {
        return 3.14 * getRadius() * getRadius() * 2 + 2 * getRadius() * length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //计算圆柱体积
    public double findVoulme() {
        return super.findArea() * length;
    }
}
