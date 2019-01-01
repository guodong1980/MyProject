package com.java.day05;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: guodong
 * Date: 2019-01-01
 */
public class CircleShape extends Shape {
    private double radius;
    public CircleShape(String color, double weight,double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArad() {
        return Math.PI * radius * radius;
    }
}
