package com.level.day04;

public class Demo07 {
    public static void main(String[] args) {
        /**
         * 计算1 + 2 + ... + 100 = ?
         */
        System.out.println((1 + 100)*100/2);

        int sum = 0;
        for (int i = 1; i <=100 ; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
