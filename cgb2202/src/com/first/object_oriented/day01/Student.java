package com.first.object_oriented.day01;

/**
 * 创建 Student实体类
 *
 * @author GST
 *
 * 关键词：实体类，对象，重载
 */
public class Student {
    //成员变量
    String name;
    int age;
    String address;

    //方法
    void study() {
        System.out.println(name + "正在学习...");
    }

    public void sayHi() {
        System.out.println("大家好，我叫" + name + ",今年" + age + "岁了，" + "现住" + address);
    }

}
