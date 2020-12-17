import java.util.Scanner;

/**
 * 跳转结构
 * 1.概念：改变正常的程序控制流的结构
 * 2.break、continue、return
 * 3.break作用：跳出所在循环（注意：不是跳出if语句块）或switch结构，只能跳出一层循环
 * 4.break如果想跳出外层循环，可以搭配标签使用，但是不推荐使用；推荐用Boolean标记
 */
public class Demo17 {
    public static void main(String[] args) {

        //案例：使用标签退出外层循环
        label:
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println("-----");
                if (j == 3) {
                    break label;
                }
            }
            System.out.println("*****");
        }

        //案例:使用boolean标签推出外层循环
        boolean flag = true;
        for (int i = 1; flag && i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println("-----");
                if (j == 3) {
                    flag = false;
                    break;
                }
            }
            System.out.println("*****");
        }

        //案例：100以内的数求和，求出和第一次大于20的当前数
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
            if (sum > 20) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("\t" + j);
                }
                break;
            }
        }
        System.out.println();

        //案例：实现登录验证，有三次机会，正确输入显示登录成功，否则显示还有几次机会
        System.out.println("登录");
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.print("姓名：");
            String name = input.next();
            System.out.print("密码：");
            String password = input.next();
            if (name.equals("张三") && password.equals("123")) {
                System.out.println("登录成功！");
                break;
            } else {
                if (i == 3) {
                    System.out.println("登录失败");
                } else {
                    System.out.println("还有" + (3 - i) + "次机会");
                }
            }
        }
    }
}
