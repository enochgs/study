package cn.j04_Interface.demo_1;

/**
 * 实现接口，打印机类
 *
 * @author GST
 */
public class UsbPrinter implements Usb {
    public void run() {
        System.out.println("接入usb，打印机开始工作");
    }
}
