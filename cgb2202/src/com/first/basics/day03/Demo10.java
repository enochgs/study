package com.first.basics.day03;

import java.util.Scanner;

/**
 * 闰年的判断公式：
 *  1.能被4整除，并且，不能被100整除
 *      或者
 *  2.能被400整除
 *
 */
public class Demo10 {
    public static void main(String[] args) {
        System.out.println("请输入年份：");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if ((year%4==0 && year%100!=0)|| year%400==0){
            System.out.println(year+"年是闰年");
        }else {
            System.out.println(year+"年是平年");
        }
    }
}
