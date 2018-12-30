package com.java.day05;

/**
 * Created with IntelliJ IDEA.
 * Description:面向对象的特性
 * User: guodong
 * Date: 2018-12-30
 * 面向对象
 * 1.隐藏和封装特性
 *   (1)当创建了类的对象以后,如果直接通过对象.属性的方式赋值,会出现意外,一般通过对象.方法的形式来访问
 *   (2)封装性:将类的属性私有化private,提供setter和getter方法实现
 * 2.权限修饰符:private  protected  缺省 public 可以用来修饰成员变量和方法,类只能用缺省和public修饰
 *   (1)private:只能在本类中调用
 *   (2)proteced:在本类中和同一包中,子类中可以调用
 *   (3)缺省:在同一包中
 *   (4)public:公共的
 * 3.类的构造器(constuctor):
 *   (1)作用:创建对象,初始化对象成员变量
 *   (2)设计类时,若不显示声明类的构造器,则提供默认的空参构造器
 *   (3)一旦显示定义构造器,那么默认的构造器就不在提供
 *   (4)格式:权限修饰符 类名(形参){}
 * 4.类对象的成员变量赋值的先后顺序
 *   (1)成员变量的默认初始化
 *   (2)成员变量的显示初始化
 *   (3)通过构造器给成员变量初始化对象
 *
 */
public class OOPFeature {
    public static void main(String[] args) {
        Person p = new Person(18,"大虎");
        p.setAge(16);

        System.out.println("设置的值是 = " + p.getAge());
    }
}
