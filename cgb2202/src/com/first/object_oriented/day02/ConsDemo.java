package com.first.object_oriented.day02;

/**
 * 构造方法的演示
 *
 * @author GST
 *
 * 关键词：构造方法进行初始化
 */
public class ConsDemo {
    public static void main(String[] args) {
        //Student student = new Student();//编译错误，学生类中没有无参构造方法
        Student zs = new Student("zhangsan", 25, "LF");
        Student ls = new Student("lisi",24, "JMS");
        zs.study();
        zs.sayHi();
        ls.sayHi();
    }
}
