import sun.print.SunMinMaxPage;

import java.util.Scanner;

/**
 * while循环
 * 1.四要素：循环变量初始化
 * 循环条件
 * 循环操作
 * 循环变量更新
 * <p>
 * 2.题型一 知道循环个数
 * int i=初始值
 * while(i<=次数或终止值){
 * 循环操作
 * i++;
 * }
 */

public class Demo12 {
    public static void main(String[] args) {
        //案例：打印1-100这些数字
        int number = 1;
        //循环条件执行101次
        while (number < 101) {
            //循环体执行100次
            System.out.println(number);
            number++;
        }

        //案例：打印100-200之间的所有偶数
        //第一种方式：设置循环条件
        int num = 100;
        while (num % 2 == 0 && num < 201) {
            System.out.println(num);
            num = num + 2;
        }
        //第二种方式：设置输出方式
        while (num < 201) {
            if (num % 2 == 0)
                System.out.println(num);
            num++;
        }


        //案例：打印1-100的和
        int i = 1;
        int sum = 0;
        while (i < 101) {
            sum += i;
            i++;
        }
        System.out.println(sum);


        //案例：打印100-999之间所有能被3整除但不能被7整除的数的和
        int n = 100;
        int he = 0;
        while (n < 1000) {
            if (n % 3 == 0 && n % 7 != 0) {
                System.out.println(n);
                he += n;
            }
            n++;
        }
        System.out.println(he);


        //案例：输入10名学生的年龄，统计>18岁的人数
        Scanner input = new Scanner(System.in);
        int count = 0;
        int t = 1;
        while (t < 11) {
            System.out.print("请输入第" + t + "名学生的年龄：");
            int age = input.nextInt();
            if (age > 18) {
                count++;
            }
            t++;
        }
        System.out.println("年龄大于18岁的人数为：" + count);
    }
}
