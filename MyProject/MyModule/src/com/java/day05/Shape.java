package com.java.day05;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: guodong
 * Date: 2019-01-01
 */
public class Shape {
    String color;//图形的颜色
    double weight;//图形的重量

    //构造器
    public Shape(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double findArad( ) {
        return -1;
    }
}
