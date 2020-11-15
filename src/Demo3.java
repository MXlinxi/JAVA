/**
 * 数据类型
 * 1.整型 byte short int long 默认为int
 * 2.浮点型 float double 默认为double
 * 3.布尔型 boolean
 * 4.字符型 char  ASCII码 A-65 a-97 0-48  Unicode2个字节(utf-8可变长度 字母1字节 汉字三字节）
 * 5.大容量转小容量编译不通过
 */
public class Demo3 {
    public static void main(String[] args) {
        char a = 100;
        System.out.println(a);
        //unicode编码方式
        char b = '\u0019';
        System.out.println(b);
    }
}
