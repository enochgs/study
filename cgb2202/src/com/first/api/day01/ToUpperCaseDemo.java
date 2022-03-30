package com.first.api.day01;

/**
 * 英文字母大小写转换
 * @author GST
 */
public class ToUpperCaseDemo {
    public static void main(String[] args) {
        String str = "我爱Java！";
        String upper = str.toUpperCase();   //将str中的英文部分转为全大写
        System.out.println(upper);  //我爱JAVA！

        String lower = str.toLowerCase();   //将str中的英文部分转换为全小写
        System.out.println(lower);  //我爱java！


    }
}
