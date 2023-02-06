package java_study.Java_Exception;

public class Java01_Exception {
    public static void main(String[] args) {
        // TODO - 错误
        //  1.类型转换错误 语法错误
//        String s = "123";
//        Integer i = (Integer) s;
        // TODO 2.栈溢出错误 Error 尽量避免
//        test();
        // TODO 3.空指针异常 Exception
//        User user = null;
//        System.out.println(user.toString());
        // TODO 异常
        //  1.可以通过代码恢复正常的异常，称为运行期异常 RuntimeException
        //  2.不可以通过代码恢复正常逻辑的异常，称为编译期异常 Exception
    }

    public static void test() {
        test();
    }
}

class User{

}