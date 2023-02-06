package java_study.Java_Exception;

public class Java06_Exception {
    public static void main(String[] args) throws Exception {
        // TODO - 异常 - 异常转换
        User6 user6 = new User6();
        int i = 10;
        int j = 0;
        user6.test(i, j);
    }
}

class User6 {
    // TODO 如果方法中可能出现问题，需要声明告诉别人可能会出现问题
    //  此时需要使用throws
    //  如果想手动抛出异常对象，可以手动抛出，强制让调用者处理该异常
    public void test(int i, int j) throws Exception {
        try {
            System.out.println(i / j);
        } catch (ArithmeticException e) {
            throw new Exception(); // 转成了一个新的异常
        }

    }
}