package com.java.example.bank1;

/**
 * Created with IntelliJ IDEA.
 * Description: 
 * User: guodong
 * Date: 2018-12-30
 */
public class Account {
    private double balance;//账户余额

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void dePosit(double amt) {
        balance += amt;
    }

    public void withDraw(double amt) {
        if (balance > amt) {
            balance -= amt;
        }else{
            System.out.println("余额不够!");
        }



    }
}
