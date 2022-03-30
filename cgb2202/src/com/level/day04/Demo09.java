package com.level.day04;

/**
 * 为数组元素赋值
 */
public class Demo09 {
    public static void main(String[] args) {
        //标准写法
        int[] score = new int[5];
        score[0] = 88;
        score[1] = 78;
        score[2] = 77;
        score[3] = 65;
        score[4] = 99;
        //score[5] = 56;  //出现运行异常
        for (int i = 0; i < 5; i++) {
            System.out.println(score[i]);
        }
        System.out.println("-------------------");
        //已知数组元素的情况，可以在创建数组时直接初始化元素
        int[] score2 = new int[]{12,54,86,35,87};

        for (int i = 0; i < score2.length; i++) {
            System.out.println(score2[i]);
        }
        System.out.println("-------------------");

        //简化版
        int[] score3 = {12,54,86,35,87};
        for (int i = 0; i < score3.length; i++) {
            System.out.println(score3[i]);
        }
        System.out.println("-------------------");
        //简化版
        double[] score4 = {14.6,5.4,8.5,3.5,8.7};
        for (int i = 0; i < score3.length; i++) {
            System.out.println(score4[i]);
        }
    }

}
