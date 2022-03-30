package com.first.api.day01;

/**
 * boolean startsWidth(String str)
 * 判断当前字符串是否是以给定的字符串开始的
 * boolean endsWith(String str)
 * 判断当前字符串是否是以给定的字符串结束的
 */
public class StartsWithDemo {
    public static void main(String[] args) {
        String str ="thinking in java";
        boolean starts = str.startsWith("think"); //判断str是否是以think开头的
        System.out.println(starts); //true

        boolean ends = str.endsWith(".png");//判断str是否是以.png结尾的
        System.out.println(ends);   //false

    }
}
