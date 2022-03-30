package com.level.day02;

/**
 *  数据类型转换
 */
public class Demo04 {
    public static void main(String[] args) {
        byte b1 = 33;
        int i = b1;
        System.out.println(i);

        /**
         * 强制类型转换
         * （类型）强制类型转换运算符
         */
        //范围内的可以正常转换
        int n = 88;
        short s = (short) n;
        System.out.println(s);
        System.out.println("int强制转换short类型的最大最小值：");
        n = 32767;
        s = (short) n;
        System.out.println(s);
        n = -32768;
        s = (short) n;
        System.out.println(s);
        System.out.println("-------------------------------");

        System.out.println("溢出：");
        //超过范围就会出现溢出问题
        n = 40000;
        s = (short) n;
        System.out.println(s);
        n = 32768;
        s = (short) n;
        System.out.println(s);
        n = -32769;
        s = (short) n;
        System.out.println(s);
        System.out.println("-------------------------------");

        System.out.println("long强制转换int类型的最大最小值：");
        long m = 2147483647L;
        int t = (int) m;
        System.out.println(t);
        m = -2147483648L;
        t = (int) m;
        System.out.println(t);

        System.out.println("-------------------------------");
        System.out.println("溢出：");
        m = 2147483648L;
        t = (int) m;
        System.out.println(t);
        m = -2147483649L;
        t = (int) m;
        System.out.println(t);



    }
}
