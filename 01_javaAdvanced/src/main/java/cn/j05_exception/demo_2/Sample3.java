package cn.j05_exception.demo_2;

import java.util.Scanner;

/**
 * try-catch 异常处理
 *
 * @author GST
 */
public class Sample3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入被除数：");
        try {
            int num1 = in.nextInt();
            System.out.println("请输入除数：");
            int num2 = in.nextInt();
            System.out.println(num1 + "/" + num2 + "=" + num1 / num2);
            System.out.println("感谢使用本程序！");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("出现错误：被除数和除数必须是整数或除数不能为0。");
        }
    }
}
