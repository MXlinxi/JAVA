import java.util.Scanner;

/**
 * for循环
 * 1.语法：for(初始化表达式；循环条件；循环变量更新){
 *     循环操作；
 * }
 * 2.简化while循环
 * 3.都是先判断再循环，执行效率相同(do-while执行效率最高)
 */
public class Demo15 {
    public static void main(String[] args) {

        //案例：打印1-100
        for(int i=1;i<101;i++)
        {
            System.out.println(i);
        }

        //for循环可以初始化多个变量，用逗号隔开；多个条件用逻辑运算符隔开
        Scanner input=new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int n=input.nextInt();
        for(int i=0,j=n;i<n+1;i++,j--){
                System.out.println(i+"+"+j+"="+n);
        }

        //输出所有的水仙花数，比如 153=1*1*1+5*5*5+3*3*3
        System.out.println("水仙花数");
        for(int i=100;i<1000;i++){
            //百位
            int a=i/100;
            //十位
            int b=i%100/10;
            //个位
            int c=i%10;
            if (Math.pow(a,3)+ Math.pow(b,3) + Math.pow(c,3) == i) {
                System.out.println(i);
            }
        }
    }
}
