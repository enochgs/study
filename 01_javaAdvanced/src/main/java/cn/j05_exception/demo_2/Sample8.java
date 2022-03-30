package cn.j05_exception.demo_2;

import java.util.Scanner;

/**
 * 使用throws 声明异常
 * 提示调用者，调用此代码有风险,谁调用谁解决异常
 *
 * @author GST
 */
public class Sample8 {
    public static void main(String[] args) {
        try {
            divide();
        } catch (Exception e) {
            System.out.println("出现错误：被除数和除数必须是整数或除数不能为0。");
            e.printStackTrace();
        }
    }

    /**
     * 输入被除数和除数，计算并输出商
     * 使用throws 声明异常  谁调用此方法，谁小心，不一定发生异常
     *
     * @throws Exception
     */
    public static void divide() throws Exception {  //声明异常，提示调用者，调用此代码有风险
        Scanner in = new Scanner(System.in);
        System.out.println("请输入被除数：");
        int num1 = in.nextInt();
        System.out.println("请输入除数：");
        int num2 = in.nextInt();
        System.out.println(num1 + "/" + num2 + "=" + num1 / num2);
    }
}
