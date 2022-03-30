package cn.j03_polymorphism.demo_2;

import cn.j03_polymorphism.demo_1.Army;
import cn.j03_polymorphism.demo_1.Hero;
import cn.j03_polymorphism.demo_1.Person;

/**
 * 测试类
 * 使用父类作为方法形参实现多态
 *
 * @author GST
 * @ demo_2 多态：子类到父类的转换(向上转型)
 */
public class MasterTest {
    public static void main(String[] args) {
        Master master = new Master("小明", 100);
        Hero hero = new Hero("郭靖", "战士"); //不涉及类型转换
        master.feed(hero);
        //父类引用Person 指向子类对象person
        Person person = new Army("华容", "弓箭手营房");  //子类到父类的转换
        master.feed(person);  // 主公给人物恢复血量
        //person.eat();  // 编译错误，如果子类特有eat()方法，父类的引用无法调用子类特有的方法。

        /**把实际参数赋给形参的过程：(涉及了父类和子类之间的类型转换)
         *  执行Person person = new Army("华容", "弓箭手营房")后，当调用feed(person)时，
         *  会执行person.blood(),调用的是person对象真实引用的对象Army类的实例重写的blood()方法。
         */
    }
}
