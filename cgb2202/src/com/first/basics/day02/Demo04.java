package com.first.basics.day02;

/**
 * long：长整型，8个字节，很大很大
 *
 */
public class Demo04 {
    public static void main(String[] args) {
        long a = 25L;    //25L为长整型直接量
        //long b = 10000000000;   //编译错误，100亿默认为int类型，但超出了int范围
        long c = 10000000000L;

        //运算时若有可能溢出，建议在第一个数字后加L
        long d = 1000000000 * 2 * 10L;  //1000000000 * 2 未溢出,结果正确,是200亿
        System.out.println(d);  //200亿
        long e = 1000000000 * 3* 10L;   //1000000000 * 3 溢出(int的直接量),结果不是300亿
        System.out.println(e);
        long f = 1000000000L * 3 * 10;  //1000000000L * 3未溢出(long的直接量) long的范围
        System.out.println(f);  //300亿
    }

}
