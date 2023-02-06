package java_study.Java_Object1;

import java.util.UUID;

public class Java13_Object_Utils {
    public static void main(String[] args) throws Exception {
        // TODO 常见类和对象：字符串的各种操作:  工具类
        System.out.println(StringUtil.isNotEmpty("eqwe"));
        System.out.println(StringUtil.isNotEmpty(""));
        System.out.println(StringUtil.isNotEmpty(null));
        System.out.println(StringUtil.makeString());


    }
}

// TODO 字符串工具类
// TODO 1.工具类应该不应当创建对象才可以使用 意味着可以直接使用类中的属性和方法
//  2.对外的属性和方法应该都是公共的
//  3.为了使用者方便，应该提供丰富的属性和方法
class StringUtil {
    public static boolean isEmpty(String str) {
        // 如果为null 空格 空字符都是空
        if (str == null || "".equals(str.trim()))
            return true;
        return false;
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }
    public static String makeString(){
        return UUID.randomUUID().toString();
    }
}
