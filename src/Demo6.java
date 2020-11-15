import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * 运算符
 */
public class Demo6 {
    public static void main(String[] args) {
        System.out.println(-10/3);
        //取余 a-a/b*b
        System.out.println(-10%3);
        System.out.println(2.3%-2);
        //自增自减运算符
        int a=4;
        int b=a++;
        System.out.println(a+b);
        System.out.println(a++);
        System.out.println(++a);
        //关系运算符 结果为boolean类型
        boolean flag=a!=b;
        System.out.println(flag);
        //逻辑运算符 短路与&& 逻辑与&  短路或|| 逻辑或|
        System.out.println(a!=b);
    }
}
