package com.first.object_oriented.day03.workday04;

/**
 * @author GST
 *
 * 引用类型数组，继承
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

    /**
     * 当父类写有参构造后，无参构造不在默认提供，
     * 如果子类实例化无参构造时，需要在父类手动添加无参构造方法
     */
    public Person() {
        System.out.println("父类无参构造方法");
    }

    void sayHi() {
        System.out.print("我的名字叫" + this.name + "，今年" + this.age + "岁，现住" + this.address + ",");
    }
}
