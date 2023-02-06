package java_study.Java_Exception;

import java.sql.SQLOutput;

public class Java03_Exception {
    public static void main(String[] args) {
        // TODO - 异常
        //  1.除数为0的算数异常
        //  运行期异常

        // TODO 2.空指针异常
        //  调用了一个空(null)对象的成员属性或成员方法时，就会发生异常（静态方法等不受影响）
        User3 user3 = null;
//        if (user3 != null) {
//            System.out.println(user3.toString());
//        }
        // 用try的方法才是正确的
        try {
            System.out.println(user3.toString());
        }catch (NullPointerException e){
            System.out.println("对象为空，需要分析数据为空的原因");
        }
    }
}

class User3 {

}
