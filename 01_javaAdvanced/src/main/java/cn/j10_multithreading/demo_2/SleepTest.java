package cn.j10_multithreading.demo_2;

import java.util.Date;

/**
 * 线程睡眠 sleep() 方法
 */
public class SleepTest {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println("当前时间：" + new Date());
            //调用sleep方法让当前主线程暂停1s
            Thread.sleep(1000);
        }
    }
}
