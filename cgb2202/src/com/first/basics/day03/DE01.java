package com.first.basics.day03;

import com.sun.javafx.image.impl.IntArgb;

/**
 * 第三天标准作业
 *    1.运算符的练习：算术
 *        - 输出几个整数取模，验证结果
 *        - 声明两个整型变量，演示单独使用时的自增和自减
 *        - 声明几个整型变量，演示被使用时的自增和自减
 *
 */
public class DE01 {
    public static void main(String[] args) {
        //输出几个整数取模，验证结果
        System.out.println(4%2); //0 ,商2余0 ---整除
        System.out.println(5%2); //1 ,商2余1
        System.out.println(2%5); //2 ,商0余2
        System.out.println("--------------------------------");
        //单独用 ---- 自增
        int a =5, b = 5;
        a++;    //相当于 a = a+1;
        ++b;    //相当于 b = b+1;
        System.out.println(a);//6
        System.out.println(b);//6

        //单独用 ---- 自减
        a = 5; b = 5;
        a--;
        b--;
        System.out.println(a);//4
        System.out.println(b);//4

        //被使用----自增
        a = 5; b = 5;
        int c = a++;    //将a++的值5赋值给c 然后a自增1变为6
        int d = ++b;    //将++b的值6赋值给d 然后b自增1变为6
        System.out.println(a);  //6
        System.out.println(b);  //6
        System.out.println(c);  //5
        System.out.println(d);  //6

        //被使用----自减
        a = 5;
        b = 5;
        c = a--;
        d = --b;
        System.out.println(a);  //4
        System.out.println(b);  //4
        System.out.println(c);  //5
        System.out.println(d);  //4

    }
}
