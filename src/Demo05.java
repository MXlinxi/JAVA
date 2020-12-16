/**
 * String类型与基本数据类型之间的转换
 */
public class Demo05 {
    public static void main(String[] args) {
        //基本数据类型转String类型
        int a = 23;
        String b = a + "";
        System.out.println(b.length());

        //String类型转int
        String s = "1";
        int c = Integer.parseInt(s);
        //String类型转double
        double d = Double.parseDouble(s);
        //String类型转byte
        byte e = Byte.parseByte(s);
        //String类型转short
        short f = Short.parseShort(s);
        //String类型转long
        long g = Long.parseLong(s);
        //String类型转float
        float h = Float.parseFloat(s);
        //String类型转boolean,非true字符串都转为false
        boolean i = Boolean.parseBoolean(s);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);

        //String类型转char类型
        String str = "hello";
        char ss = str.charAt(0);
        System.out.println(ss);
        //char类型参与运算
        System.out.println('a' + 1 + "hello");
    }
}
