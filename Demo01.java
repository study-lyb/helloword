package demo;

//主类
public class Demo01 {
    public static void main(String[] args) {
        Student.speech();
        //值传递，不能用形参为实参赋值
        int a = 10;
        new Demo01().change(a);
        System.out.println(a);//输出实参
        System.out.println(new Demo01().change(10));//输出方法调用实参后的返回值
        //引用传递，可以为具体的对象的属性赋值
        Person per = new Person();
        System.out.println(per.name);
        Demo01.changes(per);
        System.out.println(per.name);
    }
    public int change(int i){
        i = 7;
        return i;
    }
    public static void changes(Person per){//参数为Person类的对象per
        per.name = "lyb";//为其属性name赋值
    }
}
//定义Person类
class Person{
    String name = "李永博";
}