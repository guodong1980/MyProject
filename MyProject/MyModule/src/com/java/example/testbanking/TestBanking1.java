package com.java.example.testbanking;

import com.java.example.bank1.Account;

/**
 * Created with IntelliJ IDEA.
 * Description: 
 * User: guodong
 * Date: 2018-12-30
 */
public class TestBanking1 {
    public static void main(String[] args) {
        Account account = new Account(500.80);
        System.out.println("银行余额为:" + account.getBalance());
        account.withDraw(300.00);
        System.out.println("银行余额为:" + account.getBalance());
        account.dePosit(100);
        System.out.println("银行余额为:" + account.getBalance());


    }


}
