package com.first.basics.day06;

public class Demo10 {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        int[] b = new int[6];   //0,0,0,0,0,0
        //a:源数组
        //1:原数组的起始下标
        //b:目标数组的起始下标
        //0:目标数组的起始下标
        //4:要复制的元素个数
        System.arraycopy(a,1,b,0,4);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
