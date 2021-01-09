/**
 * 对象的内存分析
 */
public class Demo22 {
    private int age;

    public static void main(String[] args) {
        Demo22 demo22=new Demo22();
        int age=10000;
        Person person1=new Person(1,1,"a");
        Person person2=new Person(2,2,"b");
        demo22.change1(age);
        demo22.change2(person1);
        demo22.change3(person2);

        System.out.println(person2.id+"\t"+person2.age+"\t"+person2.school);
    }

    public void change1(int age){
        this.age=100;
        System.out.println(age);
    }
    public void change2(Person person2){
        person2=new Person(1,22,"xibei");
    }
    public void change3(Person p){
        p.setAge(23);
        int age=1;
    }
}

//学生类
class Person{
    int id;
    int age;
    String school;

    public Person(int id,int age,String school){
        this.id=id;
        this.age=age;
        this.school=school;
    }
    public void setAge(int age){
        this.age=age;
    }
}
