package cn.j04_Interface.demo_1;

/**
 * 测试接口的实现
 *
 * @author GST
 */
public class Demo1Test {
    public static void main(String[] args) {
        Usb um = new UsbMouse();
        Usb up = new UsbPrinter();
        um.run();
        up.run();
    }
}
