package com.java.day05;

/**
 * User: guodong
 * Date: 2019-01-05
 * Description:
 *   面向对象
 *    1.隐藏和封装特性
 *      (1)当创建了类的对象以后,如果直接通过对象.属性的方式赋值,会出现意外,一般通过对象.方法的形式来访问
 *      (2)封装性:将类的属性私有化private,提供setter和getter方法实现
 *    2.权限修饰符:private  protected  缺省 public 可以用来修饰成员变量和方法,类只能用缺省和public修饰
 *      (1)private:只能在本类中调用
 *      (2)proteced:在本类中和同一包中,子类中可以调用
 *      (3)缺省:在同一包中
 *      (4)public:公共的
 *    3.类的构造器(constuctor):
 *      (1)作用:创建对象,初始化对象成员变量
 *      (2)设计类时,若不显示声明类的构造器,则提供默认的空参构造器
 *      (3)一旦显示定义构造器,那么默认的构造器就不在提供
 *      (4)格式:权限修饰符 类名(形参){}
 *    4.类对象的成员变量赋值的先后顺序
 *      (1)成员变量的默认初始化
 *      (2)成员变量的显示初始化
 *      (3)通过构造器给成员变量初始化对象
 *    5.this关键字
 *      (1)修饰范围:成员变量 方法 构造器
 *      (2)this可以理解为当前对象或当前正在创建的对象
 *      (3)构造器中可以使用this(形参),可以用来显示的当前类的重载的其它构造器且要写在构造器中的首行
 *    6.JavaBean
 *      (1)package:声明源文件所在的包,一定要放第一行,每"."一次,表示一层文件目录,包名都要小写
 *      (2)import:显示的导入指定包下类或接口,需要引入多个类并列写出,lang包不需要引入,
 *                improt static指导入指定类的static的属性或方法
 *    7.继承:
 *      (1)格式:通过"class A(子类) extends B(父类)"类实现类的继承
 *      (2)子类继承父类以后,父类中声明的属性,方法,子类都可以使用
 *      (3)当父类中有私有的属性或方法时,子类同样可以获得,但由于封装,使子类不可以直接调用
 *         子类除了通过继承,获取父类的结构外,还可以定义自己的特有成分
 *      (4)子类是父类的扩展不是子集
 *      (5)java是单继承,不能多继承
 *    8.方法的重写
 *      (1)前提:有子类继承
 *      (2)子类继承父类后,如果父类的方法对子类不适用,那么子类可以对父类的方法重写overide(覆盖 覆写)
 *      (3)规则: 1)子类的方法的返回值类型 方法名(参数列表) 与父类的方法一样
 *               2)子类方法的修饰符不能小于父类方法的修饰符
 *               3)若父类方法抛异常,子类方法抛的异常不能大于父类
 *               4)子父类的方法必须同为static或同为非static
 *               5)私有方法不能重写,在子类中的方法是新的方法
 *    9.super关键字
 *      (1)作用:可用于访问父类中定义的属性,方法,构造器,
 *               1)当子类和父类中有同名的属性时,可以通过"super.此属性",此属性显示的低矮用父类中声明的属性,若想调用子类中的同名的属性用"this.此属性"
 *               2)当子类重写父类的方法后,在子类总若行再显示的调用父类的方法,就需要使用"super.方法"
 *               3)修饰构造器:通过子类中使用"super(形参列表)"来显示的调用父类的指定的构造器,且必须声明在首行
 *               4)在构造器内部,this(形参列表) super(形参列表)不能同时出现
 *               5)当构造器中,不显示调用,则默认调用空参的构造器
 *
 *    10.static关键字
 *      (1)static静态的,可以用来修饰属性,方法,代码块(或初始化块),内部类
 *    10.多态性:
 *      (1)子类对象的多态性:父类的引用指向子类对象,当调用方法时,实际执行的是子类重写父类的方法
 *      (2)子类对象使用的前提:1)要有类的继承  2)要有子类对父类方法的重写
 *      (3)程序运行分为编译状态和运行状态:
 *         1)对于多态来说,编译时,看作左边,将此变量理解为父类的类型
 *         2)对于多态来说,运行时,看作右边,关注于真正对象的实体,子类的对象.那么执行的方法时子类的重写
 *           不能执行父类中的方法,意思就是子类中定义的方法,但父类中没有定义,父类的引用不能执行
 *      (4)引用类型的转型:
 *         1)向上转型--->子类转型成父类,自动转型
 *         2)向下转型--->父类强转成子类,需要强制(只能子类和父类之间)
 *      (5)instanceof关键字
 *         1)格式:对象a instanceof 类A:判断对象a是否是类A的一个实例,真,返回true,否则false
 *                若a是A的实例,那么a也一定是A类的父类的实例
 *      (6)子类对象的多态性,并不适用于属性,只适用于子类的方法
 *
 *
 */

