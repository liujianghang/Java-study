
package java_study.Java_Object;

public class Java07_Object_Instance {
    public static void main(String[] args) {
        // TODO 面向对象 - 构造对象
        // 其实这调用的是构造方法
        // TODO
        //  1. 构造方法也是方法，没有void
        //  2. 名字与类名相同
        //  3. JVM可以自动构造
        //  4. 也可以传参数
        User user = new User();
        //  代码块：在构造对象之前执行的
    }
}

class User {
    {
        System.out.println("代码块1");
    }
    User() {
        System.out.println("被构造...");
    }
    void test() {
        System.out.println("test...");
    }
    {
        System.out.println("代码块2");
    }
}