package java_study.Java_Object1;

public class Java01_Object {
    public static void main(String[] args) {
        // TODO 常见类和对象
        //  java.lang.Object:对象
        Object obj = new Person();  // 当前场合下只能使用Object中的方法

        // TODO：将对象转为字符串:默认打印内存地址。为了能够更直观理解对象的内容，可以重写这个方法
        //  java_study.Java_Object1.Person@27d6c5e0
        System.out.println(obj.toString());

        // TODO：获取对象的内存地址
        //  495053715 这个值就是上面那个值的十进制
        System.out.println(obj.hashCode());

        // TODO：判断两个对象是否相等
        //  默认比较的是  内存地址
        //  false
        System.out.println(obj.equals(new Person()));

        // TODO: 获取对象的类型信息
        Class<?> aClass = obj.getClass();
        System.out.println(aClass.getSimpleName());
        System.out.println(aClass.getPackageName());
    }
}

class Person {
    // alt + insert
    // 重写一些方法
    public String name = "zhangsan";

    @Override
    public String toString() {
        return "Person{" + name + "}";
    }
}

class User extends Person {

}