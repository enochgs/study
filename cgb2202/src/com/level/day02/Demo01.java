package com.level.day02;

public class Demo01 {
    public static void main(String[] args) {
        /*
         * 演示浮点数
         */
        double pi = 3.1415;
        int r = 8;
        System.out.println(pi);
        System.out.println(pi * r * r);
        /*
         * 小数点浮动现象
         * double 采用了科学计数法存储数据
         * 浮点数不能绝对精确存储数据！
         */
        double d1 = 928398929898293389292398923.0;
        System.out.println(d1);
        double d2 = 0.000000000000012221778347573847854;
        System.out.println(d2);
        /*
         * 测试一下 float 和 double 的精度
         */
        double x = 3.1415926535897932384626433832795028;
        float y = 3.1415926535897932384626433832795028f;
        System.out.println(x);
        System.out.println(y);

    }
}
