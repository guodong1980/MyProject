package com.java.day06.object;

/**
 * User: guodong
 * Date: 2019-01-01
 * Description:equals()方法练习
 */
public class OrderDemo {
    private int orderId;
    private String orderName;

    public OrderDemo(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }


    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj instanceof OrderDemo) {
            OrderDemo od = (OrderDemo) obj;
            return this.orderId == od.orderId && this.orderName.equals(od.orderName);
        } else {
            return false;
        }


    }

    public static void main(String[] args) {
        OrderDemo demo1 = new OrderDemo(1001,"AA");
        OrderDemo demo2 = new OrderDemo(1001,"AA");
        System.out.println(demo1.equals(demo2));
    }


}
