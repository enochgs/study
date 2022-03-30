package cn.j03_polymorphism.demo_5;

import cn.j03_polymorphism.demo_1.Army;
import cn.j03_polymorphism.demo_1.Hero;
import cn.j03_polymorphism.demo_1.Person;

/**
 * 主公类
 * 使用父类作为方法返回值实现多态
 *
 * @author GST
 * @ demo_5 instanceof运算符 进行类型判断
 */
public class Master {
    private String name = "";  // 主公名字
    private int money = 0;  // 虚拟币

    /**
     * 总结：
     * (1) 使用instanceof运算符时，对象的类型必须和instanceof的第二个参数所指定的类或接口在继承树上有上下级关系，否则会出现编译错误
     * 例如，Person instanceof String 会出现编译错误。
     * (2) instanceof通常和强制类型转换结合使用。
     * 下面就采用多态的相关技能实现主公与人物交互的功能，代码如下所示。给主公添加work(Person person)方法，如果person代表Hero
     * 就内政；如果person代表Army,就巡逻。
     *
     * @param name
     * @param money
     */
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

    public void work(Person person) {
        //判断一个对象是否属于一个类或者判断是否实现了一个接口(后面讲接口)
        if (person instanceof Hero) {
            ((Hero) person).affairs();  //英雄内政
        } else if (person instanceof Army) {
            ((Army) person).patrol();   //雇佣兵巡逻
        }
    }

    public void feed(Person person) {
        //父类作为方法形参，父类引用指向子类对象，即可完成调用父类方法，实际调用子类重写的方法
        person.blood();
    }
}
