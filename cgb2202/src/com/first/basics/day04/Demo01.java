package com.first.basics.day04;

import java.util.Scanner;   //1.导入一个扫描仪

/**
 * Scanner 的演示
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //2.新建一个扫描仪叫scanner
        System.out.println("请输入年龄：");
        int age = scanner.nextInt();    //3.扫描一个整数给age
        System.out.println("请输入商品的价格：");
        double price = scanner.nextDouble();    //3.扫描一个小数给price
        System.out.println("年龄为："+age+",商品价格为："+price);




    }
}
