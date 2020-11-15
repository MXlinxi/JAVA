import java.util.Scanner;

/**
 * 键盘输入语句
 * lang包自动导入
 */
public class Demo7 {
    public static void main(String[] args) {
        //1.导包  2.创建对象
        Scanner input = new Scanner(System.in);
        //3.接收
        System.out.println("请输入姓名：");
        String name = input.next();
        System.out.println("年龄：");
        int age = input.nextInt();
        System.out.println("成绩：");
        double grade = input.nextDouble();
        System.out.println(name + "\t" + age + "\t" + grade);
        //char类型比较特殊
        char c = input.next().charAt(0);
        System.out.println(c);
    }
}
