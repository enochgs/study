package com.first.basics.day03;

/**
 * 条件运算符 (也叫三目运算符)
 *  语法：
 *      boolean ? 数1:数2
 *      执行过程：
 *          整个表达式是有值的，它的值要么是?后的数1，要么是：后的数2
 *
 */
public class Demo06 {
    public static void main(String[] args) {
        int num = -5;
        int flag = num > 0 ? 1 : -1;
        System.out.println(flag);

        int a = 8, b = 55;
        int max = a > b ? a : b;
        System.out.println("max = " +max);
    }
}
