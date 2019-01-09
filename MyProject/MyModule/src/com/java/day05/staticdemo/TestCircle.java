package com.java.day05.staticdemo;

/**
 * User: guodong
 * Date: 2019-01-09
 * Description:
 */
public class TestCircle {
    private static int radius;
    private int total;

    public TestCircle(int total) {
        this.total = total;
    }

    public static int getRadius() {
        return radius;
    }

    public static void setRadius(int radius) {
        TestCircle.radius = radius;
    }

}
