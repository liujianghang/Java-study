package java_study.Java_Collection;

import java.util.HashSet;
import java.util.concurrent.ArrayBlockingQueue;

public class Java09_Collection_Queue {
    public static void main(String[] args) throws Exception {
        // TODO - Queue
        //  Sort 排序
        //  hash：hash算法
        //  Array：数组 Blocking：阻塞
        //  需要初始化一个容量 满了就阻塞了
        ArrayBlockingQueue queue = new ArrayBlockingQueue<>(3);
        // TODO
        //  add 方法如果无法增加就直接报错
//        queue.add("zhangsan");
//        queue.add("lisi");
//        queue.add("wangwu");
//        queue.add("zhaoliu");   // IllegalStateException
//        System.out.println(queue);

//        queue.put("zhangsan");
//        System.out.println("第一个人报号");
//        queue.put("lisi");
//        System.out.println("第二个人报号");
//        queue.put("wangwu");
//        System.out.println("第三个人报号");
//        // TODO put 程序会卡在这无法执行下去（blocking）
//        queue.put("zhaoliu");


        // TODO offer 不报错 返回结果是true 或者 false
        System.out.println(queue.offer("zhangsan"));
        System.out.println(queue.offer("lisi"));
        System.out.println(queue.offer("wangwu"));
        System.out.println(queue.offer("zhaoliu"));

        // TODO 取数据 返回结果 如果取不到就是空
        System.out.println(queue.poll());
        // TODO 与offer相对的 take 会一直阻塞
        System.out.println(queue.take());
        System.out.println(queue.take());
        System.out.println(queue.take());

        System.out.println(queue.contains("zhangsan"));
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
    }
}
