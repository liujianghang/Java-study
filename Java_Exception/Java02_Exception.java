package java_study.Java_Exception;

public class Java02_Exception {
    public static void main(String[] args) {
        // TODO - 异常
        //  捕捉多个异常的时候，先捕捉小的范围的异常，然后捕捉大的范围的异常
        /*
        异常处理语法：
        try{
            可能会异常的代码
            如果出现异常，JVM会将异常进行封装，形成一个具体的异常类，然后将这个异常抛出
            所有的异常对象都可以被抛出
        } catch(抛出的异常对象 对象引用){
            异常的解决方案
        } catch(){
            异常的解决方案
        } finally{
            最终执行的代码逻辑
        }
         */
        int i = 0;
        int j = 0;
        try {
            j = 10 / i;
        } catch (ArithmeticException e) {
//            e.getMessage(); // 错误的消息
//            e.getCause();// 错误的原因
//            i = 10;
//            j = 10 / i;
            e.printStackTrace();
        } finally {
            System.out.println("最终的执行代码");
        }

    }

}
