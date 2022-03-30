package cn.j10_multithreading.demo_1;

/**
 * Runner2继承Thread类，实例化Runner2实例化对象就可以开辟一个新的线程
 */
public class Runner2 extends Thread {
    public void run() {  //重写run() 方法的实现
        for (int i = 0; i <= 10; i++) {
            System.out.println("Runner2 : " + i);
        }
    }
}
