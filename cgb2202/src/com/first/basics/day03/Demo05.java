package com.first.basics.day03;

/**
 * 字符串连接运算符：+
 * 1.若两边都是数字，则做加法运算
 * 2.若两边出现了字符串，则做字符串连接
 * 3.任何类型与字符串相连，结果都会变为字符串类型 --- 同化作用
 *
 */
public class Demo05 {
    public static void main(String[] args) {
        int age = 38;
        System.out.println("age="); //输出：age=
        System.out.println(age);    //输出 38
        System.out.println("我的年龄是"+age);    //我的年龄是38
        System.out.println("我今年"+age+"岁了");//我今年38岁了

        String name = "WKJ";
        System.out.println("name="+name);   //name=WKJ
        System.out.println("大家好，我叫WKJ");//大家好，我叫WKJ
        System.out.println("大家好，我叫"+name+",今年"+age +"岁了");//大家好，我叫WKJ,今年38岁了
    }
}
