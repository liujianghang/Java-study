package java_study.Java_Object;

public class Java16_Object_Abstract {
    public static void main(String[] args) {
        // TODO 面向对象 - Abstract - 无法准确定义的时候
        //  抽象类 : 不完整的类 无法直接构建对象
        //  如果一个类中有抽象方法，则是抽象类；反过来不一定
        //  抽象方法
        //  分析问题：对象(具体) - 类(抽象)
        //  编写代码：类(抽象) - 对象(具体)
        Chinese16 chinese16 = new Chinese16();
        chinese16.eat();
        // TODO
        //  抽象类可以通过子类构造对象
        //  子类继承抽象类时，需要重写抽象方法，补充完整
        //  abstract不能和final同时使用
    }
}
abstract class Person16{
    public abstract void eat(); // 无法被准确定义
    public void test(){

    }
}
class Chinese16 extends Person16{

    @Override
    public void eat() {
        System.out.println("中国人使用筷子吃饭");
    }
}


