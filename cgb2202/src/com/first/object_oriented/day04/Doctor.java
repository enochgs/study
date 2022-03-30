package com.first.object_oriented.day04;
/**
 * 引用类型数组向上造型的演示
 *
 * @author GST
 * 优化：对昨天Person的子类，单独放在各自的引用类型数组下的进一步集合
 */
public class Doctor extends Person {
    public String level;    //职称

    public Doctor(String name, int age, String address, String level) {
        super(name, age, address);
        this.level = level;
    }

    @Override
    void sayHi() {
        super.sayHi();
        System.out.println("职称："+this.level+"!\n");
    }
}
