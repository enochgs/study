package com.first.api.day02;

public class IntegerDemo {
    public static void main(String[] args) {
        //触发了自动装箱特性
        Integer i1 = 5;
        //触发了自动拆箱
        int i2= i1;
        //1）可以通过包装类来得到基本类型的取值范围
        int max = Integer.MAX_VALUE;    //获取int的最大值
        int min = Integer.MIN_VALUE;    //获取int的最小值
        System.out.println("int的最大值为："+max);
        System.out.println("int的最小值为："+min);

        long lMax = Long.MAX_VALUE; //获取long的最大值
        long lMin = Long.MIN_VALUE; //获取long的最小值
        System.out.println("long的最大值为"+lMax);
        System.out.println("long的最小值为"+lMin);
    }
}
