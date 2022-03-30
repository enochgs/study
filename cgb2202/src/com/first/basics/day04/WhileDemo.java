package com.first.basics.day04;

public class WhileDemo {
    public static void main(String[] args) {
        //输出5次 行动是成功的阶梯
        int times = 0; //1.循环变量的初始化
        while (times < 5) {    //2.循环的条件
            times++; //3.循环变量的改变
            System.out.println("行动是成功的阶梯");

        }
        System.out.println("继续执行");
        int num = 1; //1.初始化循环变量

            while (num <= 9) {   //2.while循环条件
                System.out.println(9 + "*" + num + "=" + num * 9);
                num++;  //3.循变量的改变

        }
    }
}
