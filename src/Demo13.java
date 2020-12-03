import java.util.Scanner;

/**
 * while循环
 * 题型二 不知道循环次数
 */
public class Demo13 {
    public static void main(String[] args) {
        //不断输入姓名，直到输入”q“为止
        Scanner input = new Scanner(System.in);
/*        while (true) {
            System.out.print("请输入姓名：");
            String name=input.next();
            if(name.equals("q"))
                return;
        }*/
        String name = "";
        while (!name.equals("q")) {
            System.out.print("请输入姓名:");
            name = input.next();
        }
        //不断输入月份，直到输入错误为止
        int month = 1;
        while (month > 0 && month < 11) {
            System.out.print("请输入月份：");
            month = input.nextInt();
        }
    }
}
