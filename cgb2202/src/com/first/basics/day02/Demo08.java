package com.first.basics.day02;

/**
 * 类型间的转换
 */
public class Demo08 {
    public static void main(String[] args) {
        int a = 5;
        long b = a; //自动类型换(隐式转换)
        int c = (int) b; //强制类型转换

        long d = 5; //自动类型转换
        double e = 5; //自动类型转换

        long f = 10000000000L;
        int g = (int) f;    //强制类型转换
        System.out.println(g);  //1410065408,强制有可能发生溢出
        double h = 25.987;
        int i = (int) h;    //强制类型转换
        System.out.println(i);  //25,强转有可能丢失精度

    }
}
