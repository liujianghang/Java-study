package java_study.Java_Thread;

public class Java07_Thread_Blocking {
    public static void main(String[] args) throws Exception {
        // TODO 线程 - 阻塞
        //  wait & sleep
        //  1.名字
        //   wait:等待
        //   sleep:休眠
        //  2.从属关系
        //   wait:Object 成员方法
        //   sleep:Thread 静态方法
        //  3.使用方法
        //   wait:只能在同步代码块中
        //   sleep:可以在任意地方使用
        //  4.阻塞时间
        //   wait:超时时间（等的太长了，会发生错误）
        //   sleep:休眠时间 休完自己会醒
        //  5.同步处理
        //   wait:如果执行wait方法，其他线程有机会执行当前的同步操作
        //   sleep:其他线程无法执行当前的同步操作
    }
}
