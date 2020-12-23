import java.time.Month;
import java.util.Scanner;

/**
 * 循环练习题
 */
public class Demo18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //案例：随机猜数游戏（有十次机会猜随机数）
        System.out.print("-------随机猜数游戏-------");
        boolean flag = true;
        int k = 1;
        do {
            System.out.print("请输入：");
            //产生1-100的随机数
            int readom = (int) (Math.random() * 100 + 1);
            int n = input.nextInt();
            if (readom == n || k == 10) {
                flag = false;
            }
            k += 1;
        } while (flag);
        //输出结果
        if (k == 1) {
            System.out.println("你真是个天才");
        } else if (k > 1 && k <= 3) {
            System.out.println("你很聪明，赶上我了");
        } else if (k > 3 && k < 10) {
            System.out.println("一般般");
        } else if (k == 10) {
            System.out.println("可算猜对了");
        } else {
            System.out.println("你让我说你点啥好呢");
        }

        //案例：输入年月日，判断该日是当年的第几天

        //1.巧用switch中break
        System.out.print("年：");
        int year = input.nextInt();
        System.out.print("月：");
        int month = input.nextInt();
        System.out.print("日：");
        int day = input.nextInt();
        int sum = 0;
/*        switch (month-1){
            case 11:sum+=30;
            case 10:sum+=31;
            case 9:sum+=30;
            case 8:sum+=31;
            case 7:sum+=31;
            case 6:sum+=30;
            case 5:sum+=31;
            case 4:sum+=30;
            case 3:sum+=31;
            case 2:
                if (year%4==0&&year%100!=0||year%400==0) {
                    sum+=29;
                }else sum+=28;
            case 1:sum+=31;
        }
        sum+=day;
        System.out.println("第"+sum+"天");
    }*/
        //2.用循环
        for (int i = 1; i < month; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    sum += 31;
                    break;
                case 2:
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        sum += 29;
                    } else sum += 28;
                    break;
                default:
                    sum += 30;
                    break;
            }
        }
        sum += day;
        System.out.println("第" + sum + "天");
    }
}
