package java_study.Java_Object1;

public class Java05_Object_String_1 {
    public static void main(String[] args) throws Exception {
        // TODO 常见类和对象：字符串的各种操作:  拼接
        String s = "a" + "b"; // 与"ab"没有区别
        String s1 = "abc" + 1 + 2; // "abc12"
        String s2 = 1 + "abc" + 2; // "1abc2"
        String s3 = 1 + 2 + "abc"; // "3abc"
        System.out.println(s1);
        System.out.println(s3);
        // TODO concat()
        System.out.println(s1.concat("abc"));
    }
}

