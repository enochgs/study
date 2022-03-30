package com.first.api.day01;

/**
 * 常见面试题
 * String的演示
 */
public class StringDemo {
    public static void main(String[] args) {
        String s = new String("hello");
        /*
            常见面试题：
            String s = new String("hello");
            问：如上语句创建了几个对象？
            答：2个
                第一个：字面量"hello"
                    --java会创建一个String对象表示字面量"hello"，并将其存入常量池
                第二个：new String()
                    --new String()时会再创建一个字符串对象，并引用hell字符串的内容
         */
        String s1 = "hello";
        System.out.println("s: " +s);   //hello
        System.out.println("s1 " + s1); //hello
        System.out.println(s==s1);  //false,==比较的是地址值是否相同

        //字符串在实际开发中比较相等，一般都是比较字符串的内容
        //因此我们需要使用equals()方法来比较两个字符串的内容
        System.out.println(s.equals(s1));   //true，equals比较的是内容是否相同
    }
}
