package java_study.Java_Object1;

public class Java14_Object_Compa {
    public static void main(String[] args) throws Exception {
        // TODO 常见类和对象：字符串的各种操作:  比较
        //  基本数据类型：直接双等号比较
        int i = 10;
        int j = 10;
        double d = 10.0;
        System.out.println(i == j);
        System.out.println(i == d);
        // TODO
        //  引用数据类型，比较的是内存地址
        //  字符串常量池
        String s = "123";
        String s123 = "123";
        System.out.println(s == s123); // true
        String s1 = new String("123");
        System.out.println(s == s1); // false
        System.out.println(s.equals(s1)); // true

        User14 user1 = new User14();
        User14 user2 = new User14();
        System.out.println(user2.equals(user1)); // 如果没有重写 默认就是 == false
        System.out.println(user1 == user2);// false

        // TODO 包装类型
        //  int => Integer JVM为了操作方便 简化了很多操作
        //  Integer 缓存 -128~127 只有在这个范围才是相等 否则就是new了一个新对象
        //  所以包装类型也用equals
        Integer i1 = 128;
        Integer i2 = 128;
        System.out.println(i1 == i2); // false
        System.out.println(i1.equals(i2)); // true
    }
}

class User14 {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        return true;
    }
}