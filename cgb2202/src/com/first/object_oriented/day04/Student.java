package com.first.object_oriented.day04;
/**
 * 引用类型数组向上造型的演示
 *
 * @author GST
 * 优化：对昨天Person的子类，单独放在各自的引用类型数组下的进一步集合
 */
public class Student extends Person {
    public String stuId;    //学号

    public Student(String name, int age, String address,String stuId) {
        super(name, age, address);
        this.stuId = stuId;
    }

    @Override
    void sayHi() {
        super.sayHi();
        System.out.println("学号："+this.stuId+"!\n");
    }
}
