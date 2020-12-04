import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * do-while循环
 * 语法格式：
 * 【初始化语句块】
 * do{
 * 操作语句；
 * }while(条件);
 */
public class Demo14 {
    public static void main(String[] args) {
        //案例：打印1-100
        int n = 1;
        do {
            //循环操作执行了100遍
            System.out.println(n);
            n++;
            //循环条件操作了100遍
        } while (n < 101);

        //案例：打印1-1000之内所有奇数的和
        int i = 1;
        int sum = 0;
        do {
            if (i % 2 == 1) {
                sum += i;
            }
            i++;
        } while (i < 1001);
        System.out.println("和：" + sum);

        //案例：不断输入一个姓名，直到输入exit或q停止
        Scanner input = new Scanner(System.in);
        //可以不初始化
        String name;
        do {
            System.out.print("请输入姓名：");
            name = input.next();
        } while (!name.equals("exit") && !name.equals("q"));

        //案例：如果老公同意购物，则老婆将一直购物，直到老公说不同意为止
        String advice = "";
        do {
            System.out.println("老婆：可以购物吗？");
            System.out.print("老公：");
            advice = input.next();
            if ("同意".equals(advice))
                System.out.println("老婆：购物中...");
        } while (advice.equals("同意"));

        //案例：统计1-200之间能被5整除但不能被3整除的个数
        int m = 1;
        int count = 0;
        do {
            if (m % 5 == 0 && m % 3 != 0) {
                count++;
            }
            m++;
        } while (m < 201);
        System.out.println("个数：" + count);
    }
}
