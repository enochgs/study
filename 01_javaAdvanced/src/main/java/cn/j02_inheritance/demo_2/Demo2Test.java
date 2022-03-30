package cn.j02_inheritance.demo_2;

import cn.j02_inheritance.demo_1.Person;

/**
 * 测试类，测试类的继承 重写
 *
 * @author GST
 * @ demo_2 继承 & 重写
 */
public class Demo2Test {
    public static void main(String[] args) {
        Person person = new Person(); //  注释这行代码，后面检验super关键字
        person.print();
        System.out.println("-----------------------------------");
        new Hero("李广", "骑士").print();
        new Army("关羽", "弓箭手营房").print();

    }
}
