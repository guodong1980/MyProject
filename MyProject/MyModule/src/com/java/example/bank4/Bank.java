package com.java.example.bank4;

import com.java.example.bank2.Customer;

/**
 * Created with IntelliJ IDEA.
 * Description: 
 * User: guodong
 * Date: 2018-12-30
 */
public class Bank {
    private Customer[] customers;//用于存放客户
    private int numberOfCustomers;//记录Customer个数

    public Bank() {
        customers = new Customer[5];
    }

}
