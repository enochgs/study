package cn.j10_multithreading.demo_1;

/**
 * 线程创建与启动的第二种方法：定义Thread 的子类并实现run()方法
 */
public class TestThread2 {
    public static void main(String[] args) {
        Runner2 r2 = new Runner2();  //创建线程
        r2.start(); //调用start()方法启动新开辟的线程
        //r2.join();    //优先执行
        for (int i = 0; i <= 10; i++) {
            System.out.println("mainMethod: " + i);
        }
    }
}
