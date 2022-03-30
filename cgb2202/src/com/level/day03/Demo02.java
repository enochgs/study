package com.level.day03;

/**
 * 测试 复合赋值 运算
 */
public class Demo02 {
    public static void main(String[] args) {
        int n =8;
        n = n + 5;
        System.out.println(n);

        /**
         * 复合赋值运算中包含一个类型转换运算
         * n += 5.6 相当于 n = (int)(8 + 5.6)
         */
        n = 8;
        n += 5.6;
        //n = (int) (8 + 5.6);
        System.out.println(n);

    }
}
