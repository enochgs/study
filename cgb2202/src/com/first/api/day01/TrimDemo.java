package com.first.api.day01;

/**
 * String trim():
 * 去除当前字符串两边的空白字符
 */
public class TrimDemo {
    public static void main(String[] args) {
        String str = "    hello world";
        System.out.println(str);
        str = str.trim();   //去除当前字符串两边的空白字符串
        System.out.println(str);

    }
}
