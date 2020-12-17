import java.util.Scanner;

/**
 * 嵌套循环案例
 */
public class Demo16 {
    public static void main(String[] args) {

        //案例：打印空心平行四边形
        int row = 10;
        for (int i = 1; i < row; i++) {
            //打印空格
            for (int j = 1; j < i; j++) {
                System.out.print("\t ");
            }
            //打印*
            for (int j = 1; j < row; j++) {
                if (j == 1 || j == row - 1 || i == 1 || i == row - 1)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

        //案例：打印等腰三角形
        for (int i = 1; i < row; i++) {
            //打印空格
            for (int j = 0; j < row - i; j++) {
                System.out.print(" ");
            }
            //打印*
            for (int j = 1; j < 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //案例：打印倒等腰三角形
        for (int i = row; i > 0; i--) {
            //打印空格
            for (int j = row; j > i; j--) {
                System.out.print(" ");
            }
            //打印*
            for (int j = 1; j < 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //案例：打印正方形
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.print("\t*");
            }
            System.out.println();
        }

        //案例：打印直角三角形
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("\t*");
            }
            System.out.println();
        }

        //案例：打印乘法表
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("\t" + i + "*" + j + "=" + i * j);
            }
            System.out.println();
        }

        //案例：打印三个班，每个班5名同学的平均分
        Scanner input = new Scanner(System.in);
        double summary = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("第" + (i + 1) + "个班");
            double sum = 0;
            for (int j = 0; j < 5; j++) {
                System.out.print("第" + (j + 1) + "个学生的成绩:");
                double grades = input.nextDouble();
                sum += grades;
            }
            summary += sum;
            System.out.print("第" + (i + 1) + "个班的平均分：");
            System.out.println(sum / 5);
        }
        System.out.print("总平均分：" + summary / 15);
    }
}
