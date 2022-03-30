package com.first.object_oriented.day03.workday04;
/**
 * @author GST
 *
 * 引用类型数组，继承
 */
public class Student extends Person{
    public String stuId;    //学号

    public Student(String name, int age, String address,String stuId) {
        super(name, age, address);  //调用父类有参构造方法
        this.stuId = stuId;
    }
    public Student(){
        System.out.println("Student的无参构造方法");
    }

    @Override
    void sayHi() {
        super.sayHi();
        System.out.println("学号："+this.stuId+"!\n");
    }
}
