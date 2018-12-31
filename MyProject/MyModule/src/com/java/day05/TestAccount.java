package com.java.day05;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: guodong
 * Date: 2018-12-31
 */
public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000, 0.045);
        account.withDraw(30000);//取款30000
        account.withDraw(2500);//取款2500
        account.deposit(3000);//存款3000
        System.out.println("你的月利率是:" + account.getMonthRate());
        System.out.println("-------------");

        CheckAccount checkAccount = new CheckAccount(1122,20000,0.045,5000);
        checkAccount.withDraw(5000);//取款5000
        checkAccount.withDraw(18000);//取款18000
        checkAccount.withDraw(3000);//取款3000



    }
}
