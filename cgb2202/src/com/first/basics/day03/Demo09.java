package com.first.basics.day03;

/**
 *周三晚上补课
 */
public class Demo09 {
    public static void main(String[] args) {
        int a = 8, b = 5;
        int max = a>b ? a:b;
        System.out.println("max="+max);

        a = 8; b = 5;
        if (a>b){
            max = a;
        }else {
            max = b;
        }
        System.out.println("max="+max);

    }
}
