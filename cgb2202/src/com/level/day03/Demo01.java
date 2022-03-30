package com.level.day03;

/**
 *赋值运算
 */
public class Demo01 {
    /**
     * 赋值表达式的值
     */
    public static void main(String[] args) {
        double pi = 3.14;
        int r =8;
        double area = pi * r * r;
        System.out.println(area);
        //赋值运算的顺序
        int n = 5;
        n = n + 5;
        System.out.println(n);
        n-=-2;
        System.out.println(n);

        int k =10;
        System.out.println(k = k * 2);
        System.out.println(k);


    }
}
