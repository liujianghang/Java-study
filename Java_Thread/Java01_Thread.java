package java_study.Java_Thread;

public class Java01_Thread {
    public static void main(String[] args) {
        // TODO 线程
        //  获取当前线程的名称
        //  Java程序在运行时候默认有一个进程，这个进程会有一个主线程


        // TODO 创建线程
        MyThread t = new MyThread();

        // TODO 启动线程
        t.start();


        System.out.println(Thread.currentThread().getName()); //main

        // 结果(先后没有必然的确定关系)
        // main
        // MyThread : Thread-0
    }
}
// TODO 生命自定义线程类
class MyThread extends Thread{
    // TODO 重写运行指令

    @Override
    public void run() {
        System.out.println("MyThread : "+Thread.currentThread().getName());
    }
}