package com.level.day03;

import java.util.Scanner;

/**
 * 非运算：判断一个数不能被100整除
 */
public class Demo06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入数字：\n");
        int n = input.nextInt();
        //int n =6564;
        //	!(6564%100 == 0)
        //	!(64 == 0)
        //	!false
        //	true
        boolean pass = !(n % 100 ==0);
        System.out.println("不能被100整除吗？\n"+pass);


    }
}
