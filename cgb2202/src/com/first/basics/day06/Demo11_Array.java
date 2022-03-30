package com.first.basics.day06;

import java.util.Arrays;

/**
 * 数组的复制
 */
public class Demo11_Array {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        //a:源数组
        //b:目标数组
        //6:目标数组的长度(元素个数)
        //----若目标数组长度>源数组长度，则末尾补默认值
        //----若目标数组长度<源数组长度，则将末尾截掉
        int[] b = Arrays.copyOf(a, 6);//灵活性差
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        System.out.println("-----------------------");
        /*扩容:实际上不是在源a数组后面内存+1，而是定义一个新的更大的数组，
               把源数组的值放进去，源数组被gc机制回收，缩减数组同理。
        */
        a = Arrays.copyOf(a, a.length+1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
