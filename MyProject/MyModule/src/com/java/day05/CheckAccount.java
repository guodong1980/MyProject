package com.java.day05;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: guodong
 * Date: 2018-12-31
 */
public class CheckAccount extends Account {
    private int overDraft;//信用额

    public CheckAccount(int id, double balance, double rate, int overDraft) {
        super(id, balance, rate);
        this.overDraft = overDraft;
    }

    public int getOverDraft() {
        return overDraft;
    }

    @Override
    //重写取款方法,可透支的取钱方法
    public void withDraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("你的余额为:" + getBalance());
        } else if (amount - getBalance() < overDraft) {
            System.out.println("你的透支额度为:" + (overDraft - (amount - getBalance())));
            overDraft -=(amount - getBalance());
            setBalance(0);
            System.out.println("你的余额为0");
        } else {
            System.out.println("你的透支限额超限");
            System.out.println("你的透支额度为:" + getOverDraft() );
            System.out.println("你的余额为:" + getBalance());
        }
    }
}

