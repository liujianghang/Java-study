package java_study.Java_Object1;

public class Java09_Object_String_5 {
    public static void main(String[] args) throws Exception {
        // TODO 常见类和对象：字符串的各种操作:  StringBuilder
        String s = "";
        // TODO 本身没有问题，但是 "+" 会频繁创造字符串对象
//        for (int i = 0; i < 100; i++) {
//            s = s + 1;
//        }
//        System.out.println(s);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            // TODO 高效的拼接
            stringBuilder.append(i);
            stringBuilder.append("123");
        }
        System.out.println(stringBuilder.toString());
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder.insert(1,"d"));
    }
}
