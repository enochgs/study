package cn.j04_Interface.demo_2;

/**
 * 定义Car 类，继承Vehicle 类并实现Lock接口
 *
 * @author GST
 */
public class Car extends Vehicle implements Lock, Video {
    @Override
    public void openLock() {
        System.out.println("插进钥匙，顺时针旋转，锁打了了，拔出钥匙");
    }

    @Override
    public void lockup() {
        System.out.println("插进钥匙，逆时针旋转，锁上了，拔出钥匙");
    }

    @Override
    public void run() {
        System.out.println("开完锁，发动引擎，快速行驶");
    }

    @Override
    public void stop() {
        System.out.println("发动机熄火，准备锁上轿车");
    }

    @Override
    public void record() {
        System.out.println("行车记录仪开始录像");
    }
}