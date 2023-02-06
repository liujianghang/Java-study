package java_study.Java_Object1;

public class Java04_Object_String {
    public static void main(String[] args) throws Exception{
        // TODO 常见类和对象：字符串
        // java.lang.String
        // TODO jvm省略了new的过程
        //  以下都是一个对象 但是new的形式是多个全新的对象
        String name = "zhangsan";
        String name1 = "zhangsan";
        String name2 = "zhangsan";
        String name3 = "zhangsan";
        // TODO 各种字符串类的构造方法
        char[] cs = {'a', 'b', 'c'};
        byte[] bs = {-28, -72, -83, -27, -101, -67};
        String s = new String(cs);
        String s1 = new String(bs, "UTF-8");
        String s2 = "\""; // 转义字符 \' \\ \t \n
        System.out.println(s1);
        System.out.println(s2);
    }
}

