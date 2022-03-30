package com.first.basics.day05;

/**
 *for结构的演示
 */
public class Demo01 {
    public static void main(String[] args) {
        /*
            3.for结构
                1）语法：
                    for(要素1; 要素2; 要素3){
                        语句块/循环体
                    }
         */

        for (int num = 1; num <= 9; num++) {
            System.out.println(num +"+9="+num*9 );
        }
        System.out.println("-------------------------------");

        for (int num = 1; num < 9; num+=2) {
            System.out.println(num +"+9="+num*9 );
        }

        for (int times = 0; times < 5; times++) {
            System.out.println("行动是成功的阶梯");
        }
        System.out.println("继续执行、、、");
    }
}

