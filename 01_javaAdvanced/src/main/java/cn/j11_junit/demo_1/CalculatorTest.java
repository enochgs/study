package cn.j11_junit.demo_1;

/**
 * 1.黑盒测试：不需要写代码，给输入值，看程序是否能够输出期望的值。
 *
 * @author GST
 */
public class CalculatorTest {
    public static void main(String[] args) {
        //创建对象
        Calculator c = new Calculator();
        //调用
        int result = c.add(1, 2);
        System.out.println(result);

   /*     int result = c.sub(2,2);
        System.out.println(result);*/

    }

}
