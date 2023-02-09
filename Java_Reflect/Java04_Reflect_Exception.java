package java_study.Java_Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Java04_Reflect_Exception {
    public static void main(String[] args) throws Exception {
        // TODO 反射 - 练习
        //  构造方法对象
        Class<Emp> empClass = Emp.class;
        // 另一种获取类对象的方法 ClassNotFoundException
        Class<?> aClass = Class.forName("java_study.Java_Reflect.Emp");

        // NoSuchMethodException
        Constructor<Emp> declaredConstructor = empClass.getDeclaredConstructor();
        // 构建对象 IllegalArgumentException
        Emp emp = declaredConstructor.newInstance();
        // 获取对象的属性 NoSuchFieldException
        Field account = empClass.getField("account");
        Field password = empClass.getField("password");
        // 对象赋值 IllegalArgumentException
        account.set(emp, "admin");
        password.set(emp, "admin");
        // 获取登录方法
        Method method = empClass.getMethod("login");
        // 调用方法 IllegalAccessException
        Object result = method.invoke(emp);
        System.out.println(result);
    }
}

