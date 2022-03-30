package com.first.object_oriented.day03.workday04;
/**
 * @author GST
 *
 * 引用类型数组，继承
 */
public class Teacher extends Person{
    public double salary;   //工资

    public Teacher(String name, int age, String address, double salary) {
        super(name, age, address);  //调用父类有参构造方法
        this.salary = salary;
    }

    @Override
    void sayHi() {
        super.sayHi();
        System.out.println("月薪："+this.salary+"!\n");
    }

}
