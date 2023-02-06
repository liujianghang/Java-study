package java_study.Java_Object;

public class Java19_Object_Anonymous {
    public static void main(String[] args) {
        // TODO 面向对象 - Anonymous- 匿名类
        //  在模型场合下，类的名字不重要，我们指向使用类中的方法或功能，那么我们可以采用特殊的语法：匿名类
        //  所谓的匿名类：就是没有名字的类
        Me me = new Me();
        me.sayHello(new Person19() {
            @Override
            public String name() {
                return "王五";
            }
        });

        new Bird().fly();
        new Fly(){  // 只关心动作 不关心操作动作的人是谁
            public void fly(){
                System.out.println("使用飞行器飞翔");
            }
        };
    }
}

interface Fly {
    public void fly();
}

class Bird implements Fly {
    public void fly() {
        System.out.println("使用翅膀飞翔");
    }
}

abstract class Person19 {
    public abstract String name();
}

class Me {
    public void sayHello(Person19 person19) {
        System.out.println("hello" + person19.name());
    }
}
