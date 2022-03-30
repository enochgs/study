package com.first.basics.day05;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        //声明浮点数组scores(成绩数组)，包含10个元素
        //每个元素为接收用户输入的数据
        //计算总分和平均分，并输出
        double[] scores = new double[10];   //声明浮点数组
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {//遍历所有成绩
            System.out.println("请输入第"+(i+1)+"个学生的成绩：");
            scores[i] = scanner.nextDouble();
        }

        //总分、平均分、最大值、最小值、总个数------统计学内容
        //统计学内容-----要求：一定是所有数据都填充完之后再进行，不要在上面正在输入数据未完成时进行统计总分、平均分等等。
        double total = 0.0; //总分
        for (int i = 0; i < scores.length; i++) {//遍历所有成绩
            total = total + scores[i];  //累加分数
        }
        double avg = total/ scores.length;   //平均分
        System.out.println("总分为："+total+", 平均分为："+avg);

    }
}
