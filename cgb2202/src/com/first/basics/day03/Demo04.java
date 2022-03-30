package com.first.basics.day03;

/**
 * 赋值运算符
 *  1.简单赋值运算符：=
 *  2.扩展赋值运算符：+=、-=、*=、/=、%=
 *      --- 扩展赋值自带强转功能
 */
public class Demo04 {
    public static void main(String[] args) {
        //常见面试题
        short s = 5;
        //s = s + 10; //编译错误，需要强转，改为：s = (short)(s + 10);
        s += 10; //相当于：s = (short)(s + 10);

        int a =5;
        a += 10;    //相当于 a = (int)(a + 10)
        System.out.println(a);  //15
        a *= 2; //相当于 a = (int) (a*2)
        System.out.println(a);  //30
        a /= 6; //相当于 a = (int) (a/6)
        System.out.println(a); //5

    }
}
