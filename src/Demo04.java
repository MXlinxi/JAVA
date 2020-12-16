/**
 * 基本数据类型转换
 * 1.自动类型转换 小➡大   byte➡short➡int➡long➡float➡double      char➡int➡float➡double
 * 2.强制类型转换 大➡小
 * 3.表达式的结果默认为最大类型，强转符号只对最近的操作数有效，用小括号提升优先级
 * 4.注意：byte\short\boolean\char底层都是int,byte\short只要参与运算当作int处理，char可以正常参与运算
 */
public class Demo04 {
    public static void main(String[] args) {
        int a= (int) 3.2;
        System.out.println(a);

        short b=5;
        //b=b+3;    int类型
        byte c=3;
        //b=b+c;    int类型
        char d=100;
        int e=100;
        //char f=e; 可以直接赋值，但不能间接
    }
}
