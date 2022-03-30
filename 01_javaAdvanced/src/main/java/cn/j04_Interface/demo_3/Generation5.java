package cn.j04_Interface.demo_3;

/**
 * 实现Pcs接口，5G网络
 *
 * @author GST
 */
public class Generation5 implements Pcs {

    @Override
    public String getType() {
        return "5G网络";
    }
}
