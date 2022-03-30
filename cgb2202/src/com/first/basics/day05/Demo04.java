package com.first.basics.day05;

/**
 * 数组的演示
 */
public class Demo04 {
    public static void main(String[] args) {
        //1 数组的定义
        int[] arr =new int[3];//初始化：0，0，0
        int[] arr2 = {2,5,8};   //初始化2，5，8
        int[] arr3 = new int[]{2,5,8};  //初始化0，0，0。改为2，5，8
        int[] arr4;
        //arr4 ={2,5,8}; //编译错误，此方式只能声明同时初始化
        arr4 = new int[]{2,5,8};    //正确

        //3 数组的访问：访问的是数组中的元素
        int[] arr5 = new int[3];
        System.out.println(arr5[0]);   //输出第一个元素
        arr5[0] = 100;  //给第1个元素赋值为100
        arr5[1] = 200;  //给第2个元素赋值200
        arr5[2] = 300;  //给第3个元素赋值为300
        //arr5[3] = 400;  //编译不报错，运行时发生 ArrayIndexOutOfBoundsException 数组下标越界异常
        System.out.println(arr5.length);    //输出arr的长度
        System.out.println(arr5[arr5.length-1]);    //输出最后一个元素的值

        //4数组的遍历：从头到尾挨个走一遍
        int[] arr6 = new int[10];
        for (int i = 0; i < arr6.length; i++) {
            arr6[i] = 100;
            System.out.println(arr6[i]);
        }

        //创建day06包 中创建maxOfArray的类，将数组的遍历代码重写一次

    }
}
