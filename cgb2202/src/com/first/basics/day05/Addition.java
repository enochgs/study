package com.first.basics.day05;

import com.first.basics.day04.Num2;

import java.util.Random;
import java.util.Scanner;

/**
 * 随机加法运算器
 * 随机出10题
 * 100以内加法运算  每题10分
 */
public class Addition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score =0;
        for (int i = 0; i < 10; i++) {
            int num1 = random.nextInt(100);
            int num2 = random.nextInt(100);
            //1.出题
            System.out.print("请输入第"+(i+1)+"题答案\n"+num1+"+"+ num2+"=");
            //2.答题  //3.判题
            if (scanner.nextInt()==num1+num2){
                score+=10;  //计分
                System.out.println("答案正确！+10分\n");
            }else {
                System.out.println("答案错误！\n");
            }
        }
        System.out.println("最终得分："+score);

    }
}
