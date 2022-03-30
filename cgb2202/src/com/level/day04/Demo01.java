package com.level.day04;

import java.util.Scanner;

/**
 * 双路分支流程控制
 * @author GST
 */
public class Demo01 {
    public static void main(String[] args) {
        /**
         *  if (分支条件){
         *      语句1
         *  }else {
         *      语句2
         *      }
         *流程：
         * - 执行分支条件，一定是boolean表达式，返回true\false
         * - 返回true的时候，执行语句块1
         * - 返回false的时候，执行语句块2
         */
        /*
         *业务场景：200元以下打95折，200元以上打9折
         * 代码：
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入价格：");
        double total = scanner.nextDouble();
        if(total >= 200){
            System.out.println("9折");
            total *= 0.9;
        }else {
            System.out.println("9.5折");
            total *= 0.95;
        }
        System.out.print("实付：" + total);
        System.out.println("实付：" + total);
        System.out.printf("实付：%.2f元%n完毕" , total);
        //%n 换行
        // %占位符开始
        // f 表示按照 浮点数输出
        // .2 表示保留2位小数
        // println() 输出数据的时候，在行尾有换行字符，数据独占一行
        // print() 输出数据的时候，没用换行字符，数据不换行
        // printf() 输出时，实现数据输出的格式化操作

    }
}
