package com.first.basics.day04;

import java.util.Scanner;

/**
 * 创建ScoreLevel 类，要求：接收用户输入的成绩score（double），并输出
 * 创建CommandBySwitch 类，要求：接收用户输入的命令command(int)，并输出
 *
 */
public class ScoreLevel {
    public static void main(String[] args) {
        System.out.println("请输入成绩");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        /*
         * A:成绩大于等于90           优秀
         * B:成绩大于等于80 小于90    良好
         * C:成绩大于等于60 小于80    中等
         * D:成绩小于60              不及格
         */
        //System.out.println("成绩是："+score);
        if(score>100 || score<0){
            System.out.println("成绩不合法");
        }else if (score >=90){
            System.out.println("优先");
        }else if (score >=80){
            System.out.println("良好");
        }else if (score >=60){
            System.out.println("中等");
        }else{
            System.out.println("不及格");
        }
    }
}
