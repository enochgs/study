package com.first.basics.day02;

/**
 * 类型转换
 * 1、自动类型转换(隐式转换)   --- 从小往大转
 * 2、强制类型转换     --- 从大往小转
 */
public class Demo02 {
    public static void main(String[] args) {
        //类型间的转换
        int a = 5;
        long b = a; //自动类型转换(隐式转换)
        int c = (int) b; //强制类型转换
    }
}
