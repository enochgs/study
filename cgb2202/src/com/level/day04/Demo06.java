package com.level.day04;

/**
 * for循环
 * @author GST
 *
 */
public class Demo06 {
    public static void main(String[] args) {
        //      开始  结束  递增
        for (int i=0; i<0; i++){
            System.out.println("循环了" + i + "次");
        }
        //循环：-20 ~ 50
        for (int i = -20; i < 50; i++) {
            System.out.println(i);
        }
        //循环：100 到 1，递减
        for (int i = 100; i > 0; i--) {
            System.out.println(i);
        }

    }
}
