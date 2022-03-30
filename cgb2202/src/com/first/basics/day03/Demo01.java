package com.first.basics.day03;

/**
 *运算的演示
 */
public class Demo01 {
    public static void main(String[] args) {
    /* 自增自减使用
        a++相当于a=a+1
        ++b相当于b=b+1
        a--相当于a=a-1
        --b相当于b=b-1
         */
        int a = 5, b = 5;
        a++;
        ++b;
        System.out.println("a++的值："+a);
        System.out.println("++b的值："+b);

         /* 被使用，在前在后不一样
            a++ 的值为a
            ++a的值为a+1
         */
        a = 5; b = 5;
        //粗暴记法：a++ 的值为5,所以c就是5  b++ 保存的值是6，所以d是6
        int c = a++; //1：保存 a++ 的值5    2：a自增1变为6   3：将第一步保存的值5赋值给c ---底层运算
        //粗暴记法：++b 的值为6,所以c就是6
        int d = ++b; //1：保存 ++b 的值6    2：b自增1变为6   3：将第一步保存的值6赋值给d ---底层运算
        System.out.println("c=a++的值："+c); //5
        System.out.println("d=++b的值："+b); //6
        System.out.println("------------------------------");
        //同上
        a = 5; b = 5;
        a--;    //4
        --b;    //4
        System.out.println("a--的值："+a);
        System.out.println("--b的值："+b);
        a = 5; b = 5;

        int e = a--;
        int f = --b;
        System.out.println("e=a--的值："+e);
        System.out.println("f=--b的值："+f);




    }
}
