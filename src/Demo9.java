/**
 * 顺序结构
 * 1.if语句中只有一条语句时，大括号可以省略
 * 2.先搭框架
 * 3.区分多重if结构和多个if结构
 * 4.区分条件的判断运算符与赋值运算符
 * 5.作为条件的表达式，满足条件时也参与了运算
 * 6.技巧：提高代码复用性、直接用Boolean类型作为条件、
 */

import java.util.Scanner;

/**
 * 案例：某景区门票出票系统
 * 旺季：4-9
 * 成人(>18) 60块；老人(>70)或小孩(<=18) 40块；学生 30块
 * 淡季：1-3 10-12
 * 成人(>18) 40块；老人(>70)或小孩(<=18) 20块
 */

public class Demo9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入月份：");
        int month = input.nextInt();
        //输入月份为旺季
        if (month >= 4 && month <= 9) {
            System.out.print("是否有学生证(true/false):");
            boolean student = input.nextBoolean();
            //有学生证
            if (student) {
                System.out.println("30元");
            }
            //没有学生证
            else {
                System.out.print("请输入年龄：");
                int age = input.nextInt();
                //成人
                if (age > 18) {
                    System.out.println("60元");
                }
                //老人或小孩
                else {
                    System.out.println("40元");
                }
            }

        }
        //输入月份为淡季
        else {
            System.out.print("请输入年龄：");
            int age = input.nextInt();
            //成人
            if (age > 18) {
                System.out.println("40元");
            }
            //老人或小孩
            else {
                System.out.println("20元");
            }
        }
    }
}
