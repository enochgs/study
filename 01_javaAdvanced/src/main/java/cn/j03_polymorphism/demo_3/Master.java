package cn.j03_polymorphism.demo_3;

import cn.j03_polymorphism.demo_1.Army;
import cn.j03_polymorphism.demo_1.Hero;
import cn.j03_polymorphism.demo_1.Person;

/**
 * 主公类
 * 使使用父类作为方法返回值实现多态
 *
 * @author GST
 * @ demo_3 多态：子类到父类的转换(向上转型)
 */
public class Master {
    private String name = "";  // 主公名字
    private int money = 0;  // 虚拟币

    public Master(String name, int money) {
        this.name = name;
        this.money = money;
    }

    //使用父类作为方法返回值实现多态
    public Person getPerson(int typeId) {
        Person person = null;
        if (typeId == 1) {
            person = new Hero("萧峰", "战士");
        } else if (typeId == 2) {
            person = new Army("蓉蓉", "盗贼公社");
        }
        return person;
    }

    public void feed(Person person) {
        //父类作为方法形参，父类引用指向子类对象，即可完成调用父类方法，实际调用子类重写的方法
        person.blood();
    }

}
