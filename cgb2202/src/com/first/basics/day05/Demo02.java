package com.first.basics.day05;

public class Demo02 {
    public static void main(String[] args) {
        AA:for (int i = 0; i < 3; i++) {
            for (int num = 1; num <= 9; num++) {
                if (num==4){
                    break AA;
                }
                System.out.println(num+"*9="+num*9);
            }
            System.out.println("外循环");
        }
        /*
        执行过程：
            执行外层for循环
            i=0     i<3  符合条件 true  执行代码块
            代码块是内层for循环
            num=1   1*=9
            num=2   2*=9
            num=3   3*=9
            num=4   执行if循环 break AA    跳出最外层的AAfor循环体
         */

    }
}
