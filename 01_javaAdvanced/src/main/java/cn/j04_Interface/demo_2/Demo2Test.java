package cn.j04_Interface.demo_2;

/**
 * 测试类，实现防盗锁的开启与关闭，车子开动和停车等功能
 *
 * @author GST
 */
public class Demo2Test {
    public static void main(String[] args) {
        Car car = new Car();
        car.openLock();
        car.record();
        car.run();
        car.stop();
        car.lockup();
    }
}

