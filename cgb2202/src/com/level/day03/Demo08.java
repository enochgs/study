package com.level.day03;

import java.util.Scanner;

/**
 * 判断是否闰年
 */
public class Demo08 {
    public static void main(String[] args) {
        /**
         * 地球年：365天多了差一点1/4天
         * 根据当前年份数判断是否为闰年
         *  - 每4年一个闰年，年份数被4整除的时候为闰年！
         *  - 每个100年不闰年！
         *  - 每个400年再闰年！
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = scanner.nextInt();
        boolean leapYear = ((year % 4 ==0) && !(year % 100 ==0)) || (year % 400 == 0);
        if (leapYear){
        System.out.println("是闰年");
        }else {
            System.out.println("不是闰年");
        }

    }
}
