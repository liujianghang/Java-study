package java_study.Java_Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Java02_Reflect_ClassLoader {
    public static void main(String[] args) throws Exception {
        // TODO 反射 - 类加载器
        //  加载类
        //  Java中的类的种类
        //  1.Java核心类 String Object
        //  2.JVM 软件平台开发商
        //  3.自己写的类
        //  类加载器也有三种
        //  1.BootClassLoader： 启动类加载器：核心类(加载类采用操作系统的平台语言实现，获取的时候是null)
        //  2.PlatformClassLoader ： 加载的是平台开发商的类
        //  3.AppClassLoader： 类加载器

        // TODO 获取类的信息
        Class<Student> studentClass = Student.class;
        //  TODO 获取类的加载器对象
        ClassLoader classLoader = studentClass.getClassLoader();
        System.out.println(classLoader); // jdk.internal.loader.ClassLoaders$AppClassLoader@78308db1
        System.out.println(classLoader.getParent()); // jdk.internal.loader.ClassLoaders$PlatformClassLoader@4f3f5b24
        System.out.println(classLoader.getParent().getParent()); // null
        // TODO 顺序 加载java核心类——平台类——自己的类
    }
}
class Student{

}