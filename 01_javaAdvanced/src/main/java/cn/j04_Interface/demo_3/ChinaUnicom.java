package cn.j04_Interface.demo_3;

/**
 * 实现Service接口，中国联通
 *
 * @author GST
 */
public class ChinaUnicom implements Service {

    @Override
    public String getProvider() {
        return "中国联通";
    }
}
