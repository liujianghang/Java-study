package java_study.Java_Object;

public class test {
    public static void main(String[] args) {
        Test123.a = 1;
        Test123 test123 = new Test123();
        test123.a = 3;
        System.out.println(Test123.a); // a = 3
    }
}

class Test123 {
    static int a = 0;
}
