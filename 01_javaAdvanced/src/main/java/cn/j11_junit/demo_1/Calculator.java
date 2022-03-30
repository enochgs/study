package cn.j11_junit.demo_1;

/**
 * 计算器
 * 测试分类
 * 1.黑盒测试：不需要写代码，给输入值，看程序是否能够输出期望的值。
 * 2.白盒测试：需要写代码，关注程序的具体执行流程。
 *
 * @author GST
 */
public class Calculator {
    /**
     * 加法
     *
     * @param a
     * @param b
     * @return
     */
    public int add(int a, int b) {
        // int i =3/0;
        return a + b;
    }

    /**
     * 减法
     *
     * @param a
     * @param b
     * @return
     */
    public int sub(int a, int b) {
        return a - b;
    }

}
