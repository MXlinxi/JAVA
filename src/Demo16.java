import java.util.Scanner;

/**
 * 嵌套循环案例
 */
public class Demo16 {
    public static void main(String[] args) {

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
