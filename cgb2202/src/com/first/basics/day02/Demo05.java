package com.first.basics.day02;

/**
 * double：浮点型，8个字节，很大很大很大
 * float：浮点型, 4个字节
 */
public class Demo05 {
    public static void main(String[] args) {
        double a = 3.14;  //3.14为浮点型直接量，默认double型
        float b = 3.14F; //3.14为float型直接量
        double c = 123400000000000000000.0;
        System.out.println(c);  //1.234E25,科学计数法表示，相当于1.234×(10的25次幂)

        double d = 3.0, e = 2.9;
        System.out.println(d-e);    //0.10000000000000009,有可能发生舍入误差

    }
}
