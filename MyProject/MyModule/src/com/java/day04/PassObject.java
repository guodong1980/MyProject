package com.java.day04;

/**
 @作者: 郭栋
 @日期: 2018-12-30
 @类名:
 @描述:
 *
 *
 */
public class PassObject {
    public static void main(String[] args) {

    }
    public void printArea(Circle c,int time) {
        for (int i = 1; i < time; i++) {
            System.out.println("半径为:" + i );
            double area = c.getArea();
            System.out.println("area = " + area);
        }
    }
}
