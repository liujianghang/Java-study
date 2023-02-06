package java_study.Java_Exception;

public class Java05_Exception {
    public static void main(String[] args) {
        // TODO - 异常
        //  5. 格式化异常 NumberFormatException
//        String s = "123a";
//        int i = Integer.parseInt(s);
//        System.out.println(i);

        // TODO 6.类型转换错误 ClassCastException
        //  语法上可以通过 但实际上对象是User5 与Emp5没有关系
        //  运行时会有错误
        Object obj = new User5();
        if (obj instanceof Emp5){ // 解决方法
            Emp5 emp = (Emp5) obj;
        }
    }
}

class User5 {

}

class Emp5 {

}
