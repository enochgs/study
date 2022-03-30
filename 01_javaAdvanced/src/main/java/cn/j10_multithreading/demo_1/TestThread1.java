package cn.j10_multithreading.demo_1;

/**
 * 实现Runnable 接口创建线程
 */
public class TestThread1 {
    public static void main(String[] args) {
        Runner1 r1 = new Runner1();  //new一个线程类对象/若r1.run();这属于方法调用，不属于多线程
        //这里使用的是Thread(Runnable target)构造方法
        Thread t = new Thread(r1);   //声明线程实体对象：若要启动新的线程必须先new一个Thread 对象。

        t.start();  //启动新开辟线程，新线程执行的是run()方法,新线程和主线程会一起并行执行
        for (int i = 0; i < 10; i++) {
            System.out.println("maintheod: " + i);
        }
    }

    /*
    定义一个类实现 Runnable 接口，实现Runnable接口就表示这是一个线程类
     */
    static class Runner1 implements Runnable {
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Runner1: " + i);
            }
        }
    }
}
