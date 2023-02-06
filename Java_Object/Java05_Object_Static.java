
package java_study.Java_Object;


public class Java05_Object_Static {
    public static void main(String[] args) {
        // TODO 面向对象 - Static
        Test test = new Test();
        test.sex = "女";
        // TODO 先有类，再有对象
        //  1.成员方法可以访问静态属性和静态方法
        //  2.静态方法不可以访问成员属性和成员方法
        //  3.会自动调用静态代码块（有些属性的提前初始化）
        Test.test1(); //  4.会自动调用静态
    }
}

class Test {
    String name;
    static String sex;

    static {
        // 静态代码块
        System.out.println("静态代码块执行...");
    }

    void test() {
        test1();
        System.out.println("test...");
    }

    static void test1() {
        System.out.println("test1...");
    }
}
