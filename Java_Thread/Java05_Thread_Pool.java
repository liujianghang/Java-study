package java_study.Java_Thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class Java05_Thread_Pool {
    public static void main(String[] args) throws Exception {
        // TODO 线程 - 运行
        //  所谓的线程池，就是线程对象的容器
        //  可以根据需要，创建一个或者多个线程对象
        //  Java中有4中常见线程池
        //  1. 创建固定数量的线程对象
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        //  2. 根据需求动态创建线程(也可以重复使用)
        ExecutorService executorService1 = Executors.newCachedThreadPool();
        //  3. 单一线程(工作有先后顺序)
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
        //  4. 定时调度线程(线程啥时候执行可以定义)
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);

        for (int i = 0; i < 5; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }

        System.out.println("main线程执行");
    }
}

