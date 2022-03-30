package cn.j04_Interface.demo_1;

/**
 * 实现接口，鼠标类
 *
 * @author GST
 */
public class UsbMouse implements Usb {
    public void run() {
        System.out.println("接入usb，鼠标开始工作");
    }
}