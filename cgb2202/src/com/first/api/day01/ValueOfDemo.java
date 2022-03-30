package com.first.api.day01;

/**
 * static String valueOf(数据类型 a):
 * 将其他数据类型转换为String
 */
public class ValueOfDemo {
    public static void main(String[] args) {
        int a = 123;
        String s1 = String.valueOf(a);  //将int型变量a转为为String类型并赋值给s1
        System.out.println(s1); //123----字符串类型

        double d = 123.456;
        String s2 = String.valueOf(d);//将double型变量d转为为String类型并赋值给s2
        System.out.println(s2); //123..456----字符串类型

        String s3 = a +"www"; //任何内容和字符串连接的结果都是字符串，效率低下
        System.out.println(s3);
    }

}
