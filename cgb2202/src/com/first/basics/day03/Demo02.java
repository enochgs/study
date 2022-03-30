package com.first.basics.day03;

/**
 * 关系运算符
 * 1) > (大于)、< (小于)
 *    >=(大于等于)、<=(小于等于)
 *    ==(等于)、!=(不等于)
 * 2) 关系运算的结果为boolean 型，关系成立则为true，关系不成立则为false
 */
public class Demo02 {
    public static void main(String[] args) {
        int a =5,b=10,c=5;
        boolean b1 = a>b;
        System.out.println(b1); //false
        System.out.println(c<b); //true
        System.out.println(a>=c); //true
        System.out.println(a<=b); //true
        System.out.println(a==c); //true
        System.out.println(a!=c); //false
        System.out.println(a==b); //false
        System.out.println(a!=b); //true
        System.out.println("---------------------------------");
        System.out.println(a+c>b);  //false
        System.out.println(a%2==0); //false
        //System.out.println(c++);
        System.out.println(c++ > 5);  //false --- 然后c自增1变为6
        //System.out.println(c);
        System.out.println(c++>5);  //true --- 然后c自增1变为7
        System.out.println();

    }
}
