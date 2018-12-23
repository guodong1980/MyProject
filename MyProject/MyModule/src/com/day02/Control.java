package com.day02;

/*流程控制
 * 1.顺序结构:从上往下
 * 2.条件分支:
 *   (1)if-else
 *      1)if(条件判断) { }
 *      2)if(条件判断){ }else{ }
 *      3)if(条件判断){ }else if(条件判断){ }...else{ }
 *         如果多个条件之间存在"包含关系",要求范围小的写在范围大的上面
 *   (2)switch-case
 *      1)格式:switch(表达式){
 *               case 常量值1:
 *                  break;
 *                    ...
 *               default:
 *                  break;
 *              }
 *      2)特性:根据表达式的值,选择相应的case去判断,一旦满足case条件,就执行性case的相应的语句,注意case穿透
 *              default是可以选的,位置是灵活的
 *              case 值1:其中值1,只能是固定单个值,不能是范围
 *      3)表达式类型:只能是 char  byte  short  int  枚举  String
 *
 *
 *
 * 3.循环结构:
 *   (1)while
 *   (2)do..while();
 *   (3)for(;;)
 *
 *
 *
 *
 *
 */
public class Control {
    public static void main(String[] args) {
        //switch语句
        String weather = "春天";
        switch (weather) {
            case "春天" :
                System.out.println("现在是春天");
                break;
            case "夏天":
                System.out.println("现在是夏天");
                break;
            case "秋天":
                System.out.println("现在是秋天");
                break;
            default:
                System.out.println("现在只能是冬天");
        }



    }
}
