package com.java.day05;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: guodong
 * Date: 2019-01-01
 */
public class TestShape {
    public static void main(String[] args) {
        TestShape ts = new TestShape();
        boolean b = ts.equalArea(new CircleShape("红色",5.5,6), new Rectangle("小黑",10,10,10));
        System.out.println("b=" + b);
        ts.display(new CircleShape("红色",1.0,1.0));
        ts.display(new Rectangle("红色",2.0,2.0,2.0));

    }
    public boolean equalArea(Shape sha1,Shape sha2){
        return sha1.findArad() == sha2.findArad();
    }
    public void display(Shape shape) {
        System.out.println("图形的面积为:" + shape.findArad());
    }
}
