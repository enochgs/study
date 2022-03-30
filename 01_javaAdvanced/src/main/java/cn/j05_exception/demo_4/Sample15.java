package cn.j05_exception.demo_4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 使用 slf4j 记录日志
 * slf4j是一个日志库的规范接口,不是具体的日志解决方
 *
 * @author GST
 */
public class Sample15 {
    private static final Logger logger = LoggerFactory.getLogger(Sample15.class);

    /**
     * 1. 让日志和项目之间解耦
     * 2. 节省内存
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入被除数：");
        try {
            int num1 = in.nextInt();
            System.out.println("请输入除数：");
            int num2 = in.nextInt();
            System.out.println(num1 + "/" + num2 + "=" + num1 / num2);
            logger.debug("输出运算结婚结果：{}/{}={}", num1, num2, num1 / num2);
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
