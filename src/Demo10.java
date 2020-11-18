import java.util.Scanner;

/**
 * switch-case语法
 * 1.switch中的表达式或者变量的值只能是int或者能自动转为int，也可以为枚举、String
 * 2.case后面只能为常量，常量值不能重复，只能用于等值判断
 * 3.注意加break
 * 4.default的优先级低于case，但是放在前面可能影响效果
 * 5.能用switch-case的分支结构，一定能用if结构
 */
public class Demo10 {
    public static void main(String[] args) {
        //例 变量参与运算作为判断，其本身的值也会改变
        boolean b1 = true;
        boolean b2 = false;
        if ((b1 = 2 > 3) && (b2 = 5 > 4)) {
            System.out.println("hello");
        } else {
            System.out.println("b1=" + b1 + ";b2=" + b2);
        }
        Scanner input = new Scanner(System.in);
        /**
         * 例 根据输入的月份判断季节
         */
        System.out.print("请输入月份：");
        int b = input.nextInt();
        switch (b) {
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
        }
        /**
         * 例 分数大于60输出合格，小于60输出不合格
         */

        System.out.print("请输入分数：");
        double i = input.nextDouble();
        switch ((int) i / 60) {
            case 1:
                System.out.println("合格");
                break;
            case 2:
                System.out.println("不合格");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
        /**
         * 例 输入一个小写英文字母，输出对应的大写字母
         */
        System.out.println("请输入一个小写字母：");
        char a = input.next().charAt(0);
        if (a >= 97 && a <= 129) {
            System.out.println((char) (a - 32));
        } else {
            System.out.println("other");
        }
    }
}
