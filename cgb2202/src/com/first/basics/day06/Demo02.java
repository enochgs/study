package com.first.basics.day06;
import java.util.Random;
/**
 * 随机一个二维码
 * 5个
 */
public class Demo02 {
    static int nb=26;
    static int[] num = new int[nb];
    static Random random = new Random();
    public static void main(String[] args) {
        add();
        char[] arr = new char[nb];
        for (int i = 0; i < nb; i++) {
            arr[i] =(char)( num[i]+97);
            System.out.println(arr[i]);
        }
    }

    public static void add() {
        num[nb-1] = random.nextInt(26);
        for (int i = 0; i < nb; i++) {
            for (int j = nb-1; j > i; j--) {//第一次 0~24 遍历 -->
                if (num[i] == num[j]) {
                    num[i] = random.nextInt(26);
                    add();
                    //第二次
                }
            }
        }
    }

}



