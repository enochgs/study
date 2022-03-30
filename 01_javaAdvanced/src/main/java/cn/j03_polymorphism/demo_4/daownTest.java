package cn.j03_polymorphism.demo_4;

import cn.j03_polymorphism.demo_1.Army;
import cn.j03_polymorphism.demo_1.Hero;
import cn.j03_polymorphism.demo_1.Person;

/**
 * 测试类  强制转换
 * 使用父类作为方法形参实现多态
 *
 * @author GST
 * @ demo_4 多态：父类到子类的强制转换(向下转型)
 */
public class daownTest {
    public static void main(String[] args) {
        Person person = new Hero("乔峰", "战士");  //向上类型转换（自动类型转换）
        person.blood();
        //person.eat();  //无法调用子类特有的方法

        /**
         * 向上转型，通过父类的引用变量调用的方法，是子类覆盖或继承的方法，不是父类方法，它无法调用子类特有的方法
         * 但是自动类型转换为父类的引用变量后，有时需要调用子类的特有的方法，就需要还原，也就是向下类型转换（强制类型转换）
         */
        Hero hero = (Hero) person;  //向下类型转换（强制类型转换）
        hero.eat();

        //强制转换必须是父类指向的真实子类类型Hero，不是随意转换，否则报ClassCastException异常。
        Army army = (Army) person;  //person不是真实子类类型，无法转换
        army.eat();


    }
}
