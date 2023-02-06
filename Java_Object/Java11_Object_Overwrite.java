package java_study.Java_Object;
public class Java11_Object_Overwrite {
    public static void main(String[] args) {
        // TODO 面向对象 - 重写
        //  父类的方法在特殊的场合下使用，被称为重写
        //  并不意味着父类方法被覆盖掉，依旧可以用，可以用super.方法
        //  重写的要求 : 名字一样 参数类型一样 返回值也要一样
        Child11 child11 = new Child11();
        child11.test();
    }
}


class Parent11 {
    void test(){
        System.out.println("Parent11...");
    }
}
class Child11 extends Parent11{
    String name = "lisi";
    void test(){
        super.test();
        System.out.println("Child11...");
    }
}


