/**
 * 代码块的执行顺序
 * 静态代码块 > 构造块 > 构造器块 > 普通块
 */
public class Demo23 {
    int a = 2;
    int b;

    static {
        System.out.println("静态代码块，只在类加载时执行一次");
    }

    {
        int a = 11;
        System.out.println(a + "构造块，用于在类中方法外写代码，与构造器的区别是不能传参数");
    }

    public void eat() {
        System.out.println(a + "普通块，被调用才执行，循环中的大括号就是普通块");
    }

    public Demo23() {
        System.out.println("空的构造器块，在构造块之后执行");
    }

    public static void main(String[] args) {
        Demo23 demo23 = new Demo23();
        demo23.eat();
        Demo23 demo233 = new Demo23();
        demo233.eat();
    }
}
