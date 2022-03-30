package com.level.day03;
/**
 * 小于32位的整数运算   当int运算
 * byte、short、char这些同类型计算后自动转换为int型
 * 它们本质是一个32位数据，几乎等同int！占用内存空间，运算时间和int类型完全一样
 * @author GST
 */
public class Demo03 {
    public static void main(String[] args) {

        byte b1 = 5;
        byte b2 = 9;
        //根本原因：byte 是“假的”，本质是一个int数据！
        //byte b3 = b1 + b2;  //编译错误：int类型不能赋值给byte类型
        byte b3 = (byte) (b1 + b2);
        //byte b4 = (byte) b1 + (byte) b2;
        System.out.println(b3);
        short s1 = 2;
        short s2 = 3;
        //short s3 = s1 + s2;  //编译错误
        short s3 = (short) (s1 + s2);
        short s4 = (byte) (s1 + s2);
        System.out.println(s3);
        System.out.println(s4);

        byte b6 = 5;
        short b7 = 9;
        //short b8 = b6 + b7;  //编译错误
        byte b8 = (byte) (b6 + b7);
        System.out.println(b8);

        short b9 = (byte) (b6 + b7);
        System.out.println(b9);
        b9 = (short) (b6 + b7);
        System.out.println(b9);


    }
}
