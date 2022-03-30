package cn.j04_Interface.demo_3;

/**
 * 手机类 Phone
 * 调用接口中的方法，不需要管具体实现
 *
 * @author GST
 */
public class Phone {
    Service service;
    Pcs pcs;

    /**
     * 设置服务商
     */
    public void setService(Service service) {
        this.service = service;
    }

    /**
     * 设置手机卡的网络类型
     */
    public void setPcs(Pcs pcs) {
        this.pcs = pcs;
    }

    /**
     * 切换手机卡的服务商和手机卡的网络类型
     */
    public void print() {
        System.out.println("使用的服务商："
                + this.service.getProvider() + "---手机卡的网络类型是" + this.pcs.getType());
    }
}
