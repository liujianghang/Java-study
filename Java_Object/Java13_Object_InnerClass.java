package java_study.Java_Object;

public class Java13_Object_InnerClass {
    public static void main(String[] args) {
        // TODO 面向对象 - 外部类
        //  就是在源码中直接声明的类，只能用public和default
        // TODO 内部类
        //  就是在类中生命的类
        //  内部类就当做外部类的属性使用即可
        //  因为内部类可以当做外部类的属性，所以需要构建外部类才可以使用
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

    }
}
class OuterClass{
    public class InnerClass{

    }
}






