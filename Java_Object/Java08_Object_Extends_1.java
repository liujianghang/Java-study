package java_study.Java_Object;

public class Java08_Object_Extends_1 {
    public static void main(String[] args) {
        // TODO 面向对象 - extends
        //  1. 如果父类和子类有相同的属性，可以用特殊的关键字区分


        Child1 child = new Child1();
        System.out.println(child.name); // 打印的是 “lisi”
        child.test();
    }
}
class Parent1{
    String name = "zhangsan";
    void test(){
        System.out.println("test...");
    }
}
class Child1 extends Parent1{
    String name = "lisi";
    void test(){
        System.out.println(this.name);
        System.out.println(super.name);
    }
}

