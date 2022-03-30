package com.level.day04;

import java.util.Scanner;

/**
 * 多路分支语句
 */
public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入金额：");
        double pric = scanner.nextDouble();
        if (pric <200){
            System.out.println("95折");
            pric *= 0.95;
        }else if (pric <500){
            System.out.println("9折");
            pric *= 0.9;
        }else if (pric <1000){
            System.out.println("8折");
            pric *= 0.8;
        }else {
            System.out.println("7折");
            pric *= 0.7;
        }
        System.out.println("实付："+pric);
    }
}
