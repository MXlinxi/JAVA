import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * 运算符
 * 优先级：小括号>自增/自减运算符/逻辑非>算术运算符>关系运算符>逻辑运算符>三元运算符>赋值运算符
 */
public class Demo6 {
    public static void main(String[] args) {
        System.out.println(-10 / 3);
        //取余 a-(int)a/b*b
        System.out.println(-10 % 3);
        System.out.println(2.3 % -2);
        //例题：保存秒数，打印时/分/秒
        int seconds = 2222222;
        int hour = seconds / 3600;
        int minute = seconds % 3600 / 60;
        int second = seconds % 60;
        System.out.println(hour + "时" + minute + "分" + second + "秒");

        //自增自减运算符  底层做了优化，自动强转
        int a = 4;
        int b = a++;
        System.out.println(a + b);
        System.out.println(a++);
        System.out.println(++a);
        //关系运算符 结果为boolean类型
        boolean flag = a != b;
        System.out.println(flag);
        //逻辑运算符 短路与&& 逻辑与&  短路或|| 逻辑或|
        System.out.println(a != b);
        //复合赋值运算符  底层做了优化，自动强转
        int m = 4;
        m *= 1.5;
        System.out.println(m);

        //三元表达式
        int t = m == 3 ? 5 : 6;
        System.out.println(t);
        //案例：判断三个数的最大值
        int q = 10, w = 3, r = 5;
        int max = (q > w ? q : w) > r ? (q > w ? q : w) : r;
        System.out.println(max);
    }
}
