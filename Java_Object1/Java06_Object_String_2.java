package java_study.Java_Object1;

public class Java06_Object_String_2 {
    public static void main(String[] args) throws Exception {
        // TODO 常见类和对象：字符串的各种操作:  比较
        String s1 = "abc" + 1 + 2; // "abc12"
        String s2 = 1 + "abc" + 2; // "1abc2"

        // TODO equals()
        System.out.println(s1.equals(s2));
        // TODO equalsIgnoreCase 忽略大小写的比较
        System.out.println(s1.equalsIgnoreCase(s2));
        // TODO comparaTo()
        //  i为正数：a>b
        //  i为0：a=b
        //  i为负数：a<b
        System.out.println(s1.compareTo(s2));
    }
}

