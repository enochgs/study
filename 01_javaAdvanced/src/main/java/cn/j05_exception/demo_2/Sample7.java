package cn.j05_exception.demo_2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 多重catch块
 * InputMismatchException 数必须是整数
 * ArithmeticException 除数不能为0
 *
 * @author GST
 */
public class Sample7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入被除数：");
        try {
            int num1 = in.nextInt();
            System.out.println("请输入除数：");
            int num2 = in.nextInt();
            System.out.println(num1 + "/" + num2 + "=" + num1 / num2);
        } catch (InputMismatchException e) {
            System.out.println("被除数和除数必须是整数。");
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0。");
        } catch (Exception e) {
            System.out.println("其他未知异常。");
        } finally {
            System.out.println("感谢使用本程序！");
        }
    }
}
