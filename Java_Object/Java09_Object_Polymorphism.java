package java_study.Java_Object;

public class Java09_Object_Polymorphism {
    public static void main(String[] args) {
        // TODO 面向对象 - 多态
        //  所谓多态就是一个对象在不同场景下表型出来的不同状态和形态
        //  多态就是对对象的使用使用场景用了约束
        //  一个对象可以使用的功能 取决于 引用对象 的功能，这才是他真正的类（但不是具体的对象）
        //  下面就是一个多状态的例子
        Parent3 p = new Parent3();
        p.testPerson();
        Parent3 p1 = new Boy();
        //        p1.testBoy(); 无法使用
        Parent3 P2 = new Girl();
        //        p1.testGirl(); 无法使用
    }
}

class Parent3 {
    String name = "zhangsan";

    void testPerson() {
        System.out.println("test...Person");
    }
}

class Boy extends Parent3 {
    void testBoy() {
        System.out.println("test...Boy");
    }
}


class Girl extends Parent3 {
    void testBoy() {
        System.out.println("test...Girl");
    }
}
