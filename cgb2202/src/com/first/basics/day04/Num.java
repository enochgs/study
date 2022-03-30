package com.first.basics.day04;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num =(int) (Math.random()* 1000+1);
        System.out.println("猜吧：");
        System.out.println(num);
        int guess = scanner.nextInt();
        int reveal=0;
        while (guess!=num){
            if (guess>num){
                reveal=guess;

                System.out.println("猜大了,再猜猜："+guess/2);
            }else {

                reveal = guess;

                System.out.println("猜小了,再猜猜："+guess*3/2);
            }
            guess = scanner.nextInt();
        }
        System.out.println("恭喜你猜对了！");
    }
}
