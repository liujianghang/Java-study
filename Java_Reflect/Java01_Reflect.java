package java_study.Java_Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Java01_Reflect {
    public static void main(String[] args) throws Exception {
        // TODO 多态
        User user = new Child();
        user.test1();
//        user.test2(); // 如何知道自己是什么类型？

        // TODO 类对象 - 编译后的字节码文件作为一个对象
        //  可以通过它获取到字节码文件的信息
        Class<? extends User> aClass = user.getClass();

        // TODO 获取类的名称
        System.out.println(aClass.getName());  // 获取完整名称
        System.out.println(aClass.getSimpleName()); // 获取类的名称
        System.out.println(aClass.getPackageName());  // 获取类的包的名称
        // TODO 获取类的父类
        Class<?> superclass = aClass.getSuperclass();
        System.out.println(superclass.getSimpleName());

        // TODO 获取类的接口
        Class<?>[] interfaces = aClass.getInterfaces();
        System.out.println(interfaces.length);

        // TODO 获取类的属性
        Field f = aClass.getField("xxx"); // public
        Field f1 = aClass.getDeclaredField("xxx") ; // 所有的属性
        Field[] fields = aClass.getFields();
        Field[] declaredFields = aClass.getDeclaredFields();
        // TODO 获取类的方法
        Method method = aClass.getMethod("test2");  // pubulic
        Method declaredMethod = aClass.getDeclaredMethod("test2"); // 所有权限的方法
        Method[] methods = aClass.getMethods();
        Method[] declaredMethods = aClass.getDeclaredMethods();
        // TODO 获取构造方法
        Constructor<? extends User> constructor = aClass.getConstructor();
        Constructor<?>[] constructors = aClass.getConstructors();
        // TODO 获取权限(修饰符) 采用的是数字 融合了多种修饰符
        int modifiers = aClass.getModifiers();
        boolean anAbstract = Modifier.isAbstract(modifiers);

    }
}

class User {
    public void test1() {
        System.out.println("test1...");
    }
}

class Child extends User {
    public void test2() {
        System.out.println("test2...");
    }
}
