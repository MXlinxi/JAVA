import java.util.Scanner;

/**
 * continue结构
 * 1.只对循环起作用，对switch不起作用
 * 2.默认跳出最近的一层循环
 * 3.相当于少一个else嵌套
 */
public class Demo19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //从键盘输入个数不确定的整数，判断正数和负数的个数，输入0时退出程序
        boolean flag = true;
        int x = 0;
        int y = 0;
        do {
            System.out.println("请输入整数（输入0时退出）：");
            int a = input.nextInt();
            if (a > 0) {
                x++;
            } else if (a < 0) {
                y++;
            } else {
                flag = false;
            }
        } while (flag);
        System.out.println("正数：" + x + "个" + ";" + "负数" + y + "个");

        //案例：实现打印1-100之内的奇数
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

        //打印1-100之间13的倍数
        for (int i = 1; i <= 100; i++) {
            if (i % 13 != 0) {
                continue;
            }
            System.out.println(i);
        }

        //通过加标签跳出多层循环
        label:
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 4) {
                    continue label;
                }
                System.out.println(j);
            }
            System.out.println("----" + i + "------");
        }

        //不对switch起作用，不输出1
        label:
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                switch (j) {
                    case 1:
                        System.out.println("switch");
                        continue;
                }
                System.out.println(j);
            }
            System.out.println("----" + i + "------");
        }

    }
}
