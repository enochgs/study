package com.first.basics.day05;

/**
 * continue 关键字的演示
 */
public class Demo03 {
    public static void main(String[] args) {
        //continue 比较鸡肋
        for (int num = 1; num <= 9 ; num++) {
            if (num%3==0){
                continue;//跳过循环体中的剩余语句，继续执行下一次循环
            }
            System.out.println(num+"*9="+num*9);//使用continue 被3整除的数跳过去
        }
        for (int num = 1; num <= 9 ; num++) {
            if (num%3!=0){
                System.out.println(num+"*9="+num*9);//同上面使用continue一样 被3整除的数跳过去
            }
        }

    }
}
