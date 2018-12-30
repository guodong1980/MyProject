package com.java.example.bank3;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;
import jdk.nashorn.internal.ir.SplitReturn;
import sun.font.TrueTypeFont;

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

    public boolean dePosit(double amt) {
        balance += amt;
        return true;
    }

    public boolean withDraw(double amt) {
        if (balance > amt) {
            balance -= amt;
            return true;
        }else{
            System.out.println("余额不够!");
        }
        return false;


    }
}
