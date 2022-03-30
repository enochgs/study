package com.first.api.day01;

/**
 * String substring(int start, int end):
 * 截取当前字符串中指定范围内的字符串(含头不含尾)
 *
 */
public class SubstringDemo {
    public static void main(String[] args) {
        String str = "www.tedu.cn";
        String name = str.substring(4,8); //截取下标4~7范围的字母
        System.out.println(name);   //tedu

        name = str.substring(4);//从下标4开始到最后
        System.out.println(name);
    }
}
