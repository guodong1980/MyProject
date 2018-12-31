package com.java.day05;

/**
 * Created with IntelliJ IDEA.
 * Description:super账户类
 * User: guodong
 * Date: 2018-12-31
 */
public class Account {
    private int id;//账户id
    private double balance;//账户余额
    private double rate;//年利率

    public Account(int id, double balance, double rate) {
        this.id = id;
        this.balance = balance;
        this.rate = rate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    //返回月利率
    public double getMonthRate() {
        return rate / 12;
    }
    //取款方法
    public void withDraw(double amount) {
        if (balance > amount) {
            balance -= amount;
            System.out.println("剩余余额是:" + balance);
        } else {
            System.out.println("余额不足!");
            System.out.println("你的余额为:" + balance);
        }
    }
    //存款方法
    public void deposit(double amount) {
        balance += amount;
        System.out.println("余额为:" + balance);
    }
}
