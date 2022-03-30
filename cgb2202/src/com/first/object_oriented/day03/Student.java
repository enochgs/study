package com.first.object_oriented.day03;

/**
 * 引用类型数组
 * 学生类
 *
 * @author GST
 *
 * 超类，子类，继承，引用类型数组
 */
public class Student {
    //成员变量
    String name;
    int age;
    String addrrss;

    //构造方法
    Student(String name, int age, String addrrss) {
        this.name = name;
        this.age = age;
        this.addrrss = addrrss;
    }

    //方法
    void study() {
        System.out.println(name + "在学习...");
    }

    void sayHi() {
        System.out.println("大家好，我叫" + name + "，今年" + age + "岁了，家住" + addrrss);
    }
}
