package com.first.basics.day03;

/**
 * if结构：1条路
 * 1.语法：
 * if(boolean){
 * 语句块 ----- 有条件执行的语句
 * }
 * 2.执行过程：
 * 判断boolean的值：
 * 若为true，则执行语句语句块(if整个结束)
 * 若为false,则if直接结束
 */
public class Demo07 {
    public static void main(String[] args) {
        //1.偶数的判断：
        int num = 5; //带上数（6，5）
        System.out.println(num + "是偶数");  //如果是5则明显错误

        //所以我们要基于条件执行
        if (num % 2 == 0) {
            System.out.println(num + "是偶数");
        }
        System.out.println("继续执行...");

        //2.满500打8折
        double price = 400.0;   //消费金额  带上数（600.0、400.0）
        if (price >= 500) {
            price *= 0.8; //打8折
        }
        System.out.println("最终结算金额为：" + price);
    }
}
