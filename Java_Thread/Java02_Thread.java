package java_study.Java_Thread;

public class Java02_Thread {
    public static void main(String[] args) throws Exception{
        // TODO 线程
        //  串行执行：多个线程连接成串，按照先后顺序额执行

        // TODO 创建线程
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        // TODO 启动线程
        t1.start();
        t2.start();

        // TODO 将线程连接成串,在前面加入
        t1.join();
        t2.join();
        // TODO 最后顺序是 t2 - t1 - main
        System.out.println("main线程执行完毕");

    }
}
class MyThread1 extends Thread{
    // TODO 重写运行指令

    @Override
    public void run() {
        System.out.println("MyThread1 : "+Thread.currentThread().getName());
    }
}
class MyThread2 extends Thread{
    // TODO 重写运行指令

    @Override
    public void run() {
        System.out.println("MyThread2 : "+Thread.currentThread().getName());
    }
}