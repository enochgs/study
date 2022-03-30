package com.level.day02;

public class Demo06 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(n % 3);	//1

        /**
         *  自增运算
         */
        int i = 8;
        ++i;
        System.out.println(i);
        i = 8;
        i++;
        System.out.println(i);
        /**
         * 表达式的值和变量的值
         */
        n = 6;
        int m = 8;
        System.out.println(n + m); //输出表达式(n+m)的值 14
        System.out.println(n);  //输出变量n的值 6
        System.out.println(m);  //输出变量m的值 8

        /**
         *  i++：称为后++
         *  假设 i 为 8
         *  - 先取i的值8作为表达式(i++)的值
         *  - 然后i增加1，i为9
         */
        i = 8;
        System.out.println(i++); //8 输出i++表达式的值
        System.out.println(i);  //9 输出变量i的值

        /**
         * ++i：先++ ，先将i增加1，然后再取i的值
         * 假设 i 为 8
         * - 先将i增加1
         * - 然后取当前i的值，作为表达式(++i)的值 9
         */
        i = 8;
        System.out.println(++i);
        System.out.println(i);

        i=0;
        System.out.println(i++ %3);
        System.out.println(i++ %3);
        System.out.println(i++ %3);
        System.out.println(i++ %3);
        System.out.println(i++ %3);
        System.out.println(i++ %3);
        System.out.println(i++ %3);
        System.out.println(i++ %3);




    }
}
