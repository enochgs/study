package com.first.basics.day06;

/**
 * java语言基础第六天标准作业
 * - 定义say()无参无返回值方法，调用测试
 * - 定义sayHi()有一个参无返回值方法，调用测试
 * - 定义sayHello()有两个参无返回值的方法，调用测试
 * - 定义getNum()无参有返回值方法，演示return的用法，调用测试
 * - 定义plus()两个参有返回值方法，调用测试
 * - 定义getMinOfArray()用于返回指定数组的最小值，调用测试
 * @author GSL
 */
public class Exec {
    public static void main(String[] args) {
        say();//无参无返回值
        sayHi(20);//int age= 20，有一个参无返回值方法
        sayHello("张三","男");//有两个参无返回值的方法

        double num =getNum();   //无参有返回值
        System.out.println(num);

        int a=2,b=3;
        int c = plus(a,b);//有参有返回值
        System.out.println(a+"+"+b+"="+c);

        int[] arr = {77,88,5,26};
        int min = getMinOfArray(arr);
        System.out.println(min); //

    }

    //1.定义say()无参无返回值方法，调用测试
    public static void say(){
        System.out.println("say()是无参方法");
    }

    //2.定义sayHi()有一个参无返回值方法，调用测试
    public static void sayHi(int age){
        System.out.println("大家好，我今年"+age+"岁了");
    }

    //3.定义sayHello()有两个参无返回值的方法，调用测试
    public static void sayHello(String name,String sex){
        System.out.println("我叫："+name+",性别："+sex);
    }

    //4.定义getNum()无参有返回值方法，演示return的用法
    public static double getNum(){
        //return "abc"; //编译错误，返回值类型不匹配
        return 666.6; //1)结束方法的执行  2)返回结果给调用方
    }

    //5.定义plus()两个参有返回值方法，调用测试
    public static int plus(int num1,int num2){
        int add = num1+num2;
        return add; //返回的是num1+num2的和
    }

    //6.定义getMinOfArray()用于返回指定数组的最小值
    public static int getMinOfArray(int[] arr){
        int min = arr[0]; //假设第1个元素为最小值
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];   //min接收每次的最小值
            }
        }
        return min;
    }
}
