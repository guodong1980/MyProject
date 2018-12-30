package com.java.example.testbanking;

import com.java.example.bank1.Account;
import com.java.example.bank2.Customer;

/**
 * Created with IntelliJ IDEA.
 * Description: 
 * User: guodong
 * Date: 2018-12-30
 */
public class TestBanking2 {
    public static void main(String[] args) {
        Customer customer = new Customer("小明","小红");
        Account account = new Account(1000.00);
        customer.setAccount(account);
        //取钱
        customer.getAccount().withDraw(585.00);
        System.out.println("余额为:" + account.getBalance());
        //存钱
        customer.getAccount().dePosit(252);
        System.out.println("余额为:" + customer.getAccount().getBalance());
    }
}
