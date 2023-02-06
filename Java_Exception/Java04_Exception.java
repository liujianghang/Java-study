package java_study.Java_Exception;

public class Java04_Exception {
    public static void main(String[] args) {
        // TODO - 异常
        //  3.索引越界
        String[] names = new String[3];
        names[0] = "zhangsan";
        names[1] = "lisi";
        names[2] = "wangwu";
        if (names.length == 4) {
            names[3] = "zhaoliu";
        }
        // TODO 4. 字符串索引越界 StringIndexOutOfBoundsException
        String s = "abc";
        s.charAt(4);
        System.out.println(s.substring(3)); // 不会出错
        System.out.println(s.substring(4)); // 会出错
    }
}

