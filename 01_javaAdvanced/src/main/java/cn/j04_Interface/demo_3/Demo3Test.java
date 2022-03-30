package cn.j04_Interface.demo_3;

/**
 * 测试类，让手机实现快速切换服务商和手机卡的类型功能
 *
 * @author GST
 */
public class Demo3Test {
    public static void main(String[] args) {
        //定义手机
        Phone phone = new Phone();
        Service service = null;
        Pcs pcs = null;
        //使用中国移动4G网络
        service = new ChinaMobile();
        pcs = new Generation4();
        phone.setService(service);
        phone.setPcs(pcs);
        phone.print();

        //使用中国移动5G网络
        service = new ChinaMobile();
        pcs = new Generation5();
        phone.setService(service);
        phone.setPcs(pcs);
        phone.print();

        //使用中国联通4G网络
        service = new ChinaUnicom();
        pcs = new Generation4();
        phone.setService(service);
        phone.setPcs(pcs);
        phone.print();

        //使用中国联通5G网络
        service = new ChinaUnicom();
        pcs = new Generation5();
        phone.setService(service);
        phone.setPcs(pcs);
        phone.print();
    }
}

