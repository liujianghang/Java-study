package java_study.Java_Object;

public class Java08_Object_Extends {
    public static void main(String[] args) {
        // TODO 面向对象 - extends
        //  1. 子类可以直接获取到父类的成员属性和方法
        //  2. 类只能是单继承，只能有一个父类
        //  3. 一个父类可以有多个子类
        Child child = new Child();
        System.out.println(child.name);
        child.test();
    }
}
class Parent{
    String name = "zhangsan";
    void test(){
        System.out.println("test...");
    }
}
class Child extends Parent{

}

