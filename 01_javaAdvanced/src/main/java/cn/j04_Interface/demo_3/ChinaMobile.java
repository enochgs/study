package cn.j04_Interface.demo_3;

/**
 * 实现Service接口，中国移动
 *
 * @author GST
 */
public class ChinaMobile implements Service {
    @Override
    public String getProvider() {
        return "中国移动";
    }
}