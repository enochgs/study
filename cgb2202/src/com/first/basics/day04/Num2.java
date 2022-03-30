package com.first.basics.day04;

import java.util.Scanner;

public class Num2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num =(int) (Math.random()* 1000+1);
        System.out.println(num);
        int guess;
        do {
            System.out.println("猜吧：");
            guess = scanner.nextInt();
            if (guess>num){
                System.out.print("猜大了，");
            }else if (guess<num) {
                System.out.print("猜小了，");
            }else {
                System.out.println("恭喜你猜对了！");
                //break;
            }
        }while (guess!=num);
    }
}
