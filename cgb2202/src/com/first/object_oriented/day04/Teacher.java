package com.first.object_oriented.day04;
/**
 * 引用类型数组向上造型的演示
 *
 * @author GST
 * 优化：对昨天Person的子类，单独放在各自的引用类型数组下的进一步集合
 */
public class Teacher extends Person {
    public double salary;   //工资

    public Teacher(String name, int age, String address, double salary) {
        super(name, age, address);
        this.salary = salary;
    }

    @Override
    void sayHi() {
        super.sayHi();
        System.out.println("月薪："+this.salary+"!\n");
    }

}
