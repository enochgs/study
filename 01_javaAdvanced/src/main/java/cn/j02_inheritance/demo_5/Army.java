package cn.j02_inheritance.demo_5;

/**
 * 雇佣兵类，SubArmy类和的父类
 * 关键字：final
 *
 * @author GST
 * @ demo_5 final修饰符
 */
public class Army {
    /**
     * 注意：final 和 abstract 是功能相反的两个关键字，规则如下：
     * (1) abstract 可以用来修饰类和方法，不能用来修饰属性和构造方法。
     * (2) final 可以用来修饰类、方法和属性，不能修饰构造方法。
     * (3) java提供的很多的类都是final类，如String类、Math类，它们不再有子类。
     * Object类中的一些方法，如 getClass()、notify()、wait()都是final方法，只能被子类继承，不能重写，
     * 但是hashCode()、toString()、equals(Object obj)不是final方法，可以被重写。
     */

    //用final修饰的变量（包括成员变量和局部变量）将变成常量，只能赋值一次
    final String birth = "弓箭手营房";  // 出生地

    public void setBirth(String birth) {
        //this.birth=birth;  // 报错，birth不可以再被赋值
    }

    public final void print() {
        System.out.println("父类方法被final关键字修饰，子类不能再重写该方法");
    }

    public void print2() {
        System.out.println("父类普通方法，没被final关键字修饰，子类可重写该方法");
    }
}
