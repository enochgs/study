package com.level.day03;

import java.util.Scanner;

/** 流程控制
 *
 * 单路分支流程控制
 *
 * 根据判断条件选择一路执行。
 * @author GST
 */
public class Demo09 {
    public static void main(String[] args) {
        /**
         * 语法：
         *      if (分支条件){
         *          语句块
         *      }
         *
         * boolean 表达式
         *
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入消费金额：");
        double total = scanner.nextDouble();
        if (total >= 200){
            total *= 0.9;
            System.out.println("打9折：");
        }
        System.out.println(total);
    }
}
