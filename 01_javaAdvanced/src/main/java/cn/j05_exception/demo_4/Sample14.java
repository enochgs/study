package cn.j05_exception.demo_4;

import org.apache.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 使用 log4j 记录日志
 *
 * @author GST
 */
public class Sample14 {

    private static Logger logger = Logger.getLogger(Sample14.class);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入被除数：");
        try {
            int num1 = in.nextInt();
            System.out.println("请输入除数：");
            int num2 = in.nextInt();
            System.out.println(num1 + "/" + num2 + "=" + num1 / num2);
            logger.debug("输出运算结婚结果：" + num1 + "/" + num2 + "=" + num1 / num2);
        } catch (InputMismatchException e) {
            logger.error("被除数或除数必须是整数");
        } catch (ArithmeticException e) {
            logger.error("除数不能是0");
        } catch (Exception e) {
            logger.error(e.getMessage());
        } finally {
            System.out.println("感谢使用本程序！");
        }
    }
}
