package java_study.Java_Thread;

public class Java04_Thread_Run {
    public static void main(String[] args) throws Exception {
        // TODO 线程 - 运行

//        MyThread5 t5 = new MyThread5("t5");
//        t5.start();
//        MyThread5 t55 = new MyThread5("t55");
//        t55.start();
        // TODO 构建线程对象时候可以只传逻辑
        //  传递逻辑需要有规则
//        Thread thread = new Thread(()->{
//            System.out.println("线程执行");
//        });
//        thread.start();

        // TODO 只要实现了Runnable类就行
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名类线程执行");
            }
        }).start();
        System.out.println("main线程执行");
    }
}

class MyThread4 extends Thread {
    @Override
    public void run() {
        System.out.println("t3 线程执行");
    }
}

class MyThread5 extends Thread {
    private String threadName;
    MyThread5(String name){
        threadName = name ;
    }
    @Override
    public void run() {
        System.out.println(threadName + "线程执行");
    }
}
