package com.first.object_oriented.day03.workday04;

/**
 * @author GST
 *
 * 引用类型数组，继承
 */
public class Doctor extends Person {
    public String level;    //职称

    public Doctor(String name, int age, String address, String level) {
        super(name, age, address);  //调用父类有参构造方法
        this.level = level;
    }

    @Override
    void sayHi() {
        super.sayHi();
        System.out.println("职称："+this.level+"!\n");
    }
}
