package com.first.object_oriented.day04;

/**
 * 引用类型数组向上造型的演示
 *
 * @author GST
 * 优化：对昨天Person的子类，单独放在各自的引用类型数组下的进一步集合
 */
public class Person {
    //成员变量
    public String name;
    public int age;
    public String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void sayHi() {
        System.out.print("我的名字叫" + this.name + "，今年" + this.age + "岁，现住" + this.address + ",");
    }
}
