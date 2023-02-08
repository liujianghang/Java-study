package java_study.Java_Thread;

public class Java03_Thread_Sleep {
    public static void main(String[] args) throws Exception{
        // TODO 线程 - 休眠
        //  主线程休息3s
        while (true){
            Thread.sleep(3000);
            System.out.println("main执行完毕");
        }
    }
}
