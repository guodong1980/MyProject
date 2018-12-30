package com.java.day04;

/**
@author 郭栋
@create 2018-12-26
*面向对象
* 1.面向对象的编程是类的设计
* 2.设计类是设计类的成员
* 3.类的基本成员:属性(成员变量或field)和方法(Method),类中只能有方法和属性,不能有其他内容
* 4.面向对象的思想
*      (1)设计类和设计的成员
*      (2)通过类,来创建类的对象
*      (3)通过"对象.属性",或"对象.方法"来调用,完成功能
* 5.创建多个对象,彼此各自拥有一套类的属性.当对其中一个对象的属性进行修改时不会影响其他对象的属性值
* 6.类的属性(成员变量)
*       (1)成员变量与局部变量
*             1)相同点:a.遵循变量声明的格式,  数据类型 变量名 = 值   b.都有作用域
*             2)不同点:a.声明的位置不同,成员变量声明在类里,方法外,局部变量:声明在方法内
*                      b.成员变量的修饰符有四个:public private protected 缺省,  局部变量没有修饰符
*                      c.成员变量一定有默认的初始化值,局部变量要显示赋值
*                      d.二者在内存中存放的位置不同:成员存放在堆中,局部在栈中
* 7.类的方法:提供某种功能的实现
*        (1)格式:权限修饰符   返回值类型(void:无返回值/具体返回值)    方法名(形参) {方法体}
*        (2)关于返回值类型:
*           1)void:无返回值
*           2)有返回值的方法:在方法的最后一定有return + 返回值类型对应的变量
*        (3)方法中不能再定义另一个方法,但可以调用其他方法
* 8.方法的重载(overload):
*        (1)条件:a.同一个类中 b.方法名必须相同 c.方法的参数列表不同(个数,类型,顺序)
*                d.和方法的返回值没有关系 e.方法体中的内容不同
* 9.匿名类对象:创建类的对象是匿名的,
 *        (1)当我们只需要一次调用类的对象时,只需要一次
*/


public class TestOOP {
    public static void main(String[] args) {
        TestPerson p = new TestPerson();
        p.name = "小虎";
        p.age = 10;
        p.sex = false;
        p.info();

        System.out.println("-------------");
        p.showAge();
        p.study();
        int newAge = p.addAge();
        System.out.println("newAge=" + newAge);

        System.out.println("-----------");
        Circle circle = new Circle(7.0);
        double area = circle.getArea();
        System.out.println("面积=" + area);

        System.out.println("-----------");
        TestOverload testOverload = new TestOverload();
        testOverload.overLoad(6);
        testOverload.overLoad("");


    }
}


