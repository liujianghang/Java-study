package java_study.Java_Object1;

public class Java08_Object_String_4 {
    public static void main(String[] args) throws Exception {
        // TODO 常见类和对象：字符串的各种操作:  替换
        String s = "hello world world";

        // TODO replace() 替换所有的指定字符串为新字符串 hello java java
        System.out.println(s.replace("world", "java"));

        // TODO replaceAll() 按照指定的规则进行替换 java java java
        System.out.println(s.replaceAll("world|hello","java"));

        // TODO 字符串的大小写转换
        String s1 = "Hello World";
        System.out.println(s1.toLowerCase()); // hello world
        System.out.println(s1.toUpperCase()); // HELLO WORLD

        // TODO 字符串的查找
        char[] chars = s.toCharArray();
        byte[] bytes = s.getBytes("UTF-8");
        // TODO charAt() 传递索引定位指定位置的字符
        System.out.println(s.charAt(1)); // e
        // TODO indexOf() 获取指定字符串在字符串中第一次出现的位置
        System.out.println(s.indexOf("world")); //  6
        System.out.println(s.lastIndexOf("world")); // 12

        // TODO contains 判断当前字符串是否包含指定字符串 返回布尔
        System.out.println(s.contains("123"));

        // TODO startWith endsWith 判断是否以指定字符串开头结尾 返回布尔
        System.out.println(s.startsWith("hello"));
        System.out.println(s.endsWith("123"));

        // TODO isEmpty 是否为空 空格字符串不算空
        System.out.println(s.isEmpty());
        String s3 = " ";
        System.out.println(s3.isEmpty()); //false
    }
}

