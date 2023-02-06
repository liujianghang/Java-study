package java_study.Java_Object;

public class Java14_Object_SigletonPattern {
    public static void main(String[] args) {
        // TODO 面向对象 - 单例模式
        //  构造方法也是可以加访问权限的 默认就是无参
        //  private 的构造方法不让外部直接构造
        //  1.类的创建过程复杂
        //  2.类的对象消耗资源 不希望外部总是去new
        User14 instance = User14.getInstance();
    }
}
class User14{
    // TODO 判断下面这个对象是否存在
    private static User14 user14 = null; // 加static是因为静态方法不能访问成员属性
    private User14(){

    }
    public static User14 getInstance(){
        if (user14 == null){   // 静态属性不再保存在对象(堆区)中，而是保存在类(方法区)中
            user14 = new User14();
        }
        return user14;
    }
}






