package com.first.basics.day05;

public class Demo06 {
    public static void main(String[] args) {
        //1~100的偶数和
        int add=0;

        for (int i = 1; i <=100 ; i++) {
            if(i%2==0){
                add += i;
            }
        }
        System.out.println(add);

        //阶乘
        int sum =1;
        for (int i = 2; i <=8 ; i++) {
            sum = sum * i;
        }
        System.out.println(sum);

        int row =6;
        for (int i = 0; i < row; i++) {

            for (int j = i; j < row-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2+1; j++) {
                System.out.print("*");
            }

            System.out.println();

            
        }

    }
}
