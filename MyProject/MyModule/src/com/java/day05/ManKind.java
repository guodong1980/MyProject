package com.java.day05;

/**
 * Created with IntelliJ IDEA.
 * Description:继承示例
 * User: guodong
 * Date: 2018-12-31
 */
public class ManKind {
    private int sex;
    private int salary;

    public ManKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void manOrWorman() {
        if(sex == 1) {
            System.out.println("他是男人");
        } else if (sex == 0){
            System.out.println("她是女人");
        }else{
            System.out.println("它是人妖!");
        }
    }
    public void employeed() {
        if (salary == 0) {
            System.out.println("他没有工作");
        }else{
            System.out.println("他有工作");
        }


    }
}
