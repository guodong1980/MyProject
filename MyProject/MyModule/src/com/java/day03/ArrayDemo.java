package com.java.day03;

/**数组
 * 1.定义:多个相同类型的数据的组合
 * 2.格式:
 *   (1)静态初始化:数据类型[] 变量名 = new 数据类型[]{元素1,元素2,....}   如:int[] age = new int[3]{4,5,6}
 *                 数据类型[] 变量名 = {元素1,元素2,....} 如: String[] name = new String[3]
 *   (2)动态初始化:数据类型[] 变量名 = new 数据类型[元素个数]
 * 3.数组的调用:用下角标的方式,下角标从0开始
 * 4.数组的长度:通调用过数组的length属性,数组一旦初始化其长度不可变
 * 5.二维数组:
 *    (1)格式:int[][] age = {{1,3,4},{3,4,5,4}}//静态初始化
 *            int[][] age = new int[5][4] //5代表有5组,每组有4个元素,动态初始化
 *            int[][] age = new int[5][]  //动态分配5个组,但每个组的元素个数不确定
 *
 *            int[][] age = new int[][];//这个是错误的,一定要有组
 *            int[][] age = new int[][5];//这个也是错误的,不能没有组,但有组中的元素的个数
 *    (2)数组的长度:length, 如 age.length的值为5,age[1].length的值为4
 *    (3)数组的遍历:for(int i = 0; i < 5; i++){
 *                      for(int j = 0; j < age[i].length; j++){
 *                          System.out.println(age[i][j]);
 *                      }
 *                  }
 * 6.数组异常:
 *     (1)数组下标越界异常:java.lang.ArrayIndexOutOfBoundsException:
 *     (2)空指针的异常:java.lang.NullPointerException
 *
 *
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] age = {45, 56, 60};//静态初始化
        String[] name = new String[2];//动态初始化
        System.out.println("age.length = " + age.length);//静态数组的长度
        System.out.println("name.length = " + name.length);//动态数组的长度
        name[0] = "小明";
        name[1] = "小花";

        // java.lang.ArrayIndexOutOfBoundsException:
        // name[4] = "小黄";
        // for(int i = 0; i <=i.length ; i++) {
        // }
        for (String sName : name) {
            System.out.println("sName = " + sName);
        }
        for (int i = 0; i < age.length; i++) {
            System.out.println("age[i] = " + age[i]);
        }

        int[][] age1 = new int[2][3];
        age1[0][3] = 6;//多维数组的复制
    }
}
