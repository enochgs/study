package com.first.basics.day02;

/**
 * 数据类型的演示
 */
public class Demo01 {
    public static void main(String[] args) {
        byte b1 =5; //byte的范围为-128 到 127
        byte b2 = 6;
        byte b3 = (byte) (b1+b2);

        System.out.println(2 + 2);    //4
        System.out.println(2 + '2');    //52, 2加上'2'的码50
        System.out.println('2' + '2');  //100, '2'的码50，加上'2'的码50

    }
}
