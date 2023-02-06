package java_study.Java_Object;

public class Java15_Object_Final {
    public static void main(String[] args) {
        // TODO 面向对象 - final
        //  一种只要初始化就不会被修改的关键字
        //  final修饰的变量称作常量
        //  final修饰方法，则子类无法重写这个方法
        //  final修饰的类，没有子类
        //  final不可以修饰构造方法
        //  final可以修饰方法的参数，一旦修饰，就无法修改
        final String name = "张三";
//        name = "李四"; Cannot assign a value to final variable 'name'
        // TODO
        //  如果用final修饰属性 就必须要初始化

    }
}

class User15 {
    public final String name;  // 单独这句话会报错，必须要赋值

    public User15(String name) {
        this.name = name;
    }
    public final void test(){

    }
}

class Child15 extends User15{

    public Child15(String name) {
        super(name);
    }
//    public void test(){ 'test()' cannot override 'test()' in 'java_study.Java_object.User15'; overridden method is fina
//
//    }
}





