import sun.print.SunMinMaxPage;

/**
 * while循环
 * 1.四要素：循环变量初始化
 * 循环条件
 * 循环操作
 * 循环变量更新
 */
public class Demo12 {
    public static void main(String[] args) {
        //案例：打印1-100这些数字
       /* int number = 1;
        //循环条件执行101次
        while (number < 101) {
            //循环体执行100次
            System.out.println(number);
            number++;
        }

        //打印100-200之间的所有偶数
        //第一种方式：设置循环条件
        int num=100;
        while(num%2==0&&num<201)
        {
            System.out.println(num);
            num=num+2;
        }
        //第二种方式：设置输出方式
        while(num<201)
        {
            if(num%2==0)
            System.out.println(num);
            num++;
        }*/

        //案例：打印1-100的和
        int i=1;
        int sum=0;
        while(i<101){
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }
}
