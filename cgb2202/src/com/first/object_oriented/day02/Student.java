package com.first.object_oriented.day02;

/**
 * 学生类
 *
 * @author GST
 *
 * 关键词：构造方法进行初始化
 */
public class Student {
    //成员变量
    String name;
    int age;
    String address;
    String sex;

    //构造方法：构造函数、构造器、构建器---------复用给成员变量赋初值代码
    public Student(String name, int age, String address) {
        this.name = name;   //this：指代当前对象，哪个对象调用方法它指的就是哪个对象
        this.age = age;
        this.address = address;
    }


    //方法
    void study() {
        System.out.println(name + "正在学习");
    }

    void sayHi() {
        System.out.println("大家好，我叫" + name + ",今年" + age + "岁了，" + "现住" + address);
    }

}
