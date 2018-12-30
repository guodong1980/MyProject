package com.java.example.bank2;

import com.java.example.bank1.Account;

/**
 * Created with IntelliJ IDEA.
 * Description: 
 * User: guodong
 * Date: 2018-12-30
 */
public class Customer {
    private String firstName;//第一个名字
    private String lastName;//最后一个名字
    private Account account;//银行账户
    //用构造器初始化第一个名字和最后一个名字
    public Customer(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //取得第一个名字
    public String getFirstName(){
        return  firstName;
    }
    //取得最后一个名子
    public String getLastName(){
        return  lastName;
    }
    //取得银行账户
    public Account getAccount(){
        return account;
    }
    //设置
    public void setAccount(Account account) {
        this.account = account;
    }
}
