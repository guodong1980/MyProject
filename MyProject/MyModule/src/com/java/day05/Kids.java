package com.java.day05;

/**
 * Created with IntelliJ IDEA.
 * Description:继承示例
 * User: guodong
 * Date: 2018-12-31
 */
public class Kids extends ManKind {
    private int yearsOld;

    public static void main(String[] args) {
        Kids someKid = new Kids(0, 500, 5);
        System.out.println("someKid.getSex() = " + someKid.getSex());
        System.out.println("someKid.getSalary() = " + someKid.getSalary());
        someKid.manOrWorman();
        someKid.employeed();
        someKid.printAge();

    }

    public Kids(int sex, int salary, int yearsOld) {
        super(sex, salary);
        this.yearsOld = yearsOld;
    }

    public void printAge() {
        System.out.println("yearsOld = " + yearsOld);
    }
}
