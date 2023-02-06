package java_study.Java_Object;

public class Java08_Object_Extends_2 {
    public static void main(String[] args) {
        // TODO 面向对象 - extends
        //  1.创建子类前会创造父类的对象，这里创建了三个父类，三个子类
        //  2.默认情况下，子类创建的时候，会自动调用父类的构造方法，JVM自动完成，即super()
        //  3.如果父类提供了构造方法，JVM不会用默认的，那么得用super()传入参数
        Child2 child1 = new Child2();
        // TODO 这里一个new只会构建一个对象 其实内存中只有子类对象，父类对象并没有实际被构建
        //  只是存储了父类过来的成员属性和方法
        Child2 child2 = new Child2();
        Child2 child3 = new Child2();
        // parent..
        // child...
        // parent..
        // child...
        // parent..
        // child...
    }
}
class Parent2{
    String username;
    Parent2(String name){
        username = name;
        System.out.println("parent..");
    }
}
class Child2 extends Parent2{
    Child2(){
        super("张三"); // 调用了父类的构造方法
        System.out.println("child...");
    }
}

