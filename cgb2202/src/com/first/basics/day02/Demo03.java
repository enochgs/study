package com.first.basics.day02;

/**
 * int:整型，4个字节，-21个多亿到21个多亿
 */
public class Demo03 {
    public static void main(String[] args) {

        int a =25;  //25为整数直接量，默认为int型
        //int b = 10000000000; //编译错误，100亿默认为int类型，但超出了范围
        //int c = 22.55; //编译错误，整型变量中不能装小数
        System.out.println(5/2);    //2 （整型间运算结果仍是整型）
        System.out.println(2/5);    //0
        System.out.println(5/2.5);  //2.0   （整型与浮点型运算结果是浮点型）
        int d = 2147483647; //int的最大值
        d = d +1;
        System.out.println(d);  //-2147483648(int的最小值)，发生了溢出
    }
}
