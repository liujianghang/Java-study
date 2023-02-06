package java_study.Java_Object1;

public class Java07_Object_String_3 {
    public static void main(String[] args) throws Exception {
        // TODO 常见类和对象：字符串的各种操作:  截断
        String s = "hello world";

        // TODO substring(a,b)，第一个表示起始位置(包含)第二个表示结束位置(不包含)
        System.out.println(s.substring(0, 3));// hel
        System.out.println(s.substring(0, "hello".length()));// hello

        // TODO substring(a) 只一个参数，则直接从该位置到最后
        System.out.println(s.substring(3));//lo world

        // TODO split(" ") 分解字符串，获得一个数组
        String[] s1 = s.split(" ");
        // s1.for
        for (String s2 : s1) {
            System.out.println(s2);
        }

        // TODO trim() 去掉首尾空格
        String s2 = "hello world  ！ ";
        System.out.println(s.trim());
    }
}

