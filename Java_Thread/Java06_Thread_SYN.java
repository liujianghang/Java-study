package java_study.Java_Thread;

import java.lang.invoke.VarHandle;
import java.util.Hashtable;

public class Java06_Thread_SYN {
    public static void main(String[] args) throws Exception {
        // TODO 线程 - 同步
        //  synchronized 同步关键字
        //  当有多个线程执行同步方法的时候，需要一个一个执行
//        new Hashtable<>();
        // TODO synchronized 还可以修饰代码块，称为同步代码块
        Num num = new Num();
        User user = new User(num);
        user.start();
        Bank bank = new Bank(num);
        bank.start();
    }
}

class Num {

}

class Bank extends Thread {
    private Num num;

    public Bank(Num num) {
        this.num = num;
    }

    public void run() {
        synchronized (num) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("9:00 开门，开始叫号");
            num.notifyAll();
        }
    }
}

class User extends Thread {
    //    public synchronized void test(){
//
//    }
    private Num num;

    public User(Num num) {
        this.num = num;
    }

    public void run() {
        synchronized (num) {
            System.out.println("我是号码1，银行还没开门，我要等一会");
            try {
                num.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("到我的号了，该我办业务了");
        }
    }
}
