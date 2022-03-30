package cn.j04_Interface.demo_3;

/**
 * 实现Pcs接口，4G网络
 *
 * @author GST
 */
public class Generation4 implements Pcs {
    @Override
    public String getType() {
        return "4G网络";
    }
}
