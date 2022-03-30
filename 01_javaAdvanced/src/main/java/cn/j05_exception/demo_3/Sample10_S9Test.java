package cn.j05_exception.demo_3;

/**
 * 捕获throw抛出的异常
 *
 * @author GST
 */
public class Sample10_S9Test {
    public static void main(String[] args) {
        Sample9 sample9 = new Sample9();
        try {
            sample9.setSex("man0");
            sample9.setAge(19);
            sample9.print();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
