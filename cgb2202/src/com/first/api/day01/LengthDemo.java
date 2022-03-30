package com.first.api.day01;

/**
 * int length():
 * 获取字符串的长度（字符个数）
 */
public class LengthDemo {
    public static void main(String[] args) {
        String str = "我爱java！";
        int len = str.length(); //获取str都长度
        System.out.println(len);    //7个字符长度，占14个字节
    }
}
