package java_study.Java_Collection;

import java.util.LinkedList;

public class Java05_Collection {
    public static void main(String[] args) {
        // TODO - LinkedList - 泛型
        // 泛型语法
        // TODO 泛型和类型的区别
        MyContainer<User5> user5MyContainer = new MyContainer<>();
        System.out.println(user5MyContainer.data);

        // TODO
//        test(MyContainer); 这里用不了 因为类型存在多态的使用，而泛型没有多态
    }
    public static void test(MyContainer<Object> myContainer){
        System.out.println(myContainer);
    }
}

// TODO 容器类
class MyContainer<C>{
    public C data;
}
class User5{

}