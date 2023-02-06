package java_study.Java_Object;

public class Java21_Object_ActionScope {
    public static void main(String[] args) {
        // TODO 面向对象 - 作用域
        User21 user21 = new User21();
        user21.test();

    }
}

class Person21 {
    public static String name = "zhangsan";
}

class User21 extends Person21 {
    public static String name = "lisi"; // 会覆盖父类

    public static void test() {
//        String name = "wangwu"; // 局部变量 如果属性和变量相同，如果访问的时候不加修饰，优先访问变量
        System.out.println(Person21.name); // 只能用这种方法访问到zhangsan
//        System.out.println(super.name); // 错误的写法，因为静态方法里面不能有操作对象
    }
}

