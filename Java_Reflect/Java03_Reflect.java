package java_study.Java_Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Logger;

public class Java03_Reflect {
    public static void main(String[] args) throws Exception {
        // TODO 反射 - 练习
        //  构造方法对象
        Class<Emp> empClass = Emp.class;
        Constructor<Emp> declaredConstructor = empClass.getDeclaredConstructor();
        // 构建对象
        Emp emp = declaredConstructor.newInstance();
        // 获取对象的属性
        Field account = empClass.getField("account");
        Field password = empClass.getField("password");
        // 对象赋值
        account.set(emp,"admin");
        password.set(emp,"admin");
        // 获取登录方法
        Method method = empClass.getMethod("login");
        // 调用方法
        Object result = method.invoke(emp);
        System.out.println(result);

    }
}

// 员工
class Emp {
    public String account;
    public String password;

    public boolean login() {
        if ("admin".equals(account) && "admin".equals(password)) {
            return true;
        } else {
            return false;
        }
    }
}
