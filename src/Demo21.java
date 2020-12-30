import java.util.Scanner;

/**
 * 数组案例
 */
public class Demo21 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //案例：求一个班级十名同学的平均分
/*        boolean flag=true;
        int i=0;
        double sum=0;
        do{
            System.out.println("输入分数：");
            double grade=input.nextDouble();
            sum+=grade;
            i++;
            if (i == 10) {
                flag=false;
            }
        }while (flag);
        System.out.println("平均分："+sum/10);*/
        double[] grades=new double[10];
        double sum=0;
        for(int i=0;i<10;i++){
            System.out.println("输入分数：");
            grades[i]=input.nextDouble();
            sum+=grades[i];
        }
        System.out.println("平均分"+sum/10);

    }
}
