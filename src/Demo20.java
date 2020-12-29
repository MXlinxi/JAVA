/**
 * 数组
 * 1.数组的声明
 * 2.数组的应用
 */
public class Demo20 {
    public static void main(String[] args) {
        //数组声明,数组是一种引用类型
        int[] array;
        //开辟空间，必须声明数组长度
        array = new int[5];
        //通过下标手动赋值，有默认值
        array[0] = 6;
        //通过下标访问，注意数组越界异常（属于运行时异常）
        System.out.println(array[0]);
        //使用循环来给数组赋值/查看数组元素;length是数组的一个属性，数组下标范围[0，array.length-1]
        for(int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*100)+1;
            System.out.println(array[i]);
        }
    }
}
