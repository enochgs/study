package com.first.basics.day03;

/**
 * 逻辑运算符：
 *  1) &&：短路与(并且)两边都为真则为真，见 false 则 false
 *                    ---- 当第1个条件为false时，则发生短路(后面的不执行了)
 *  2) ||：短路或(或者)，有真则为真，见true 则true
 *                    ---- 当第1个条件为true时，则发生短路(后面的不执行了)
 *  3) ！：逻辑非(取反)，非真则假，非假则真
 *
 *逻辑运算是与关系运算：
 * 逻辑运算是建立在关系运算基础之上的，
 * 逻辑运算的结果也是boolean型
 *
 * 优先级：
 *        逻辑运算 ! && ||      ----- 优先
 *        关系运算 <、>、>、== 、<=、>=      ----- 其次
 *        赋值运算 =        ----- 最后
 */
public class Demo03 {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 5;
        boolean b1 = b>=a && b<c;
        System.out.println(b1); //true && false = false
        System.out.println(b<=c && b>a); //false && true = false
        System.out.println(a==b && c>b); //false && false = false
        System.out.println();

    }
}
