package cn.j05_exception.demo_1;

import java.util.Scanner;

/**
 * 用if-else语句解决异常问题
 *
 * @author GST
 */
public class Sample2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入被除数：");
        int num1 = 0;
        if (in.hasNextInt()) {//in.hasNextInt()判断输入的是否为整数
            num1 = in.nextInt();
        } else {
            System.out.println("输入的被除数不是整数，程序立刻退出。");
        }
        System.out.println("请输入除数：");
        int num2 = 0;
        if (in.hasNextInt()) {   //如果输入的是整数
            num2 = in.nextInt();
            if (0 == num2) {   //如果输入的除数是0
                System.out.println("输入的除数是0，程序退出。");
            }
        } else {
            System.out.println("输入的除数不是整数，程序退出。");
        }
        System.out.println(num1 + "/" + num2 + "=" + num1 / num2);
        System.out.println("感谢使用本程序！");
    }
}
