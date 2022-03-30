package com.level.day04;

/**
 * 数组
 */
public class Demo08 {
    public static void main(String[] args) {
        /**
         * 声明数组：
         * 数据类型[] 变量名 = 数据类型[长度]
         * int[] score = new int [5]
         * double[] price = new double[10]
         */
        int [] score = new int[5];
        double[] price = new double[10];
        boolean[] used = new boolean[100];
        char[] chs = new char[10];
        String[] name = new String[5];
        /*
         *利用下标（序号）改写数组中的数据
         * 下标序号 从0开始，如果有5个元素，则：0，1，2，3，4
         */
        System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println("历史中的失误无意义："+score);
        price[0]=2147483647;
        price[0]+=1111111111;
        System.out.println(price[0]);
        System.out.println(used[0]);
        System.out.println(chs[0]);
        System.out.println(name[0]);
        System.out.println("-------------------");
        //输出数组中的全部元素
        System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score[2]);
        System.out.println(score[3]);
        System.out.println(score[4]);
        System.out.println("-------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println(score[i]);
        }


    }
}
