package com.java.day05;

/**
 * Created with IntelliJ IDEA.
 * Description: 继承的测试类
 * User: guodong
 * Date: 2018-12-31
 */
public class TestCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle();
        //计算圆的面积
        System.out.println("圆的默认面积 = " + circle.findArea());
        circle.setRadius(5.12);//设置圆的新半径
        //新半径的圆的面积
        System.out.println("圆的面积 = " + circle.findArea());
        System.out.println("-------------");
        Cylinder cylinder = new Cylinder();
        //计算圆柱体的默认体积
        System.out.println("圆柱的默认体积 = " + cylinder.findVoulme());
        //设置新的圆的的半径和长度
        cylinder.setRadius(2.0);
        cylinder.setLength(5.0);
        //计算圆柱体的新的体积
        System.out.println("圆柱体新的体积 = " + cylinder.findVoulme());

    }
}
