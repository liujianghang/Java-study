package java_study.Java_Thread;

public class Java08_Thread_Safe {
    public static void main(String[] args) throws Exception {
        // TODO 线程 - 线程安全
        //  java会给每一个线程分配一个栈内存
        //  但是堆内存是共享的
        //  就是在并发过程中，共享了对象的属性，导致数据冲突
        User8 user8 = new User8();
        Thread t1 = new Thread(() -> {
            user8.name = "zhangsan";
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(user8.name);
        });
        Thread t2 = new Thread(() -> {
            user8.name = "lisi";
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(user8.name);
        });
        // t1，t2访问的是同一个对象
        t1.start();
        t2.start();
    }
}
class User8{
    public String name;
}
