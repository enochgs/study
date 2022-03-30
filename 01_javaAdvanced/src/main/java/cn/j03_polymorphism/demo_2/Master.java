package cn.j03_polymorphism.demo_2;

import cn.j03_polymorphism.demo_1.Army;
import cn.j03_polymorphism.demo_1.Hero;
import cn.j03_polymorphism.demo_1.Person;

/**
 * 主公类
 * 使用父类作为方法形参实现多态
 *
 * @author GST
 * @ demo_2 多态：子类到父类的转换(向上转型)
 */
public class Master {
    private String name = "";  // 主公名字
    private int money = 0;  // 虚拟币

    public Master(String name, int money) {
        this.name = name;
        this.money = money;
    }
/**
 // 主公给英雄恢复生命值
 public void feed(Hero hero){
 hero.blood();
 }

 // 主公给雇佣兵恢复生命值
 public void feed(Army army){
 army.blood();
 }
 */
    /**
     * 从运行结果可知已经实现了主公给人物的恢复体力的功能。但是主公又购买更多类型的人物，该如何实现人物恢复体力呢？
     * 解答：可以在Master类中重载feed()方法，添加一个feed(类名形参)方法。但这样做存在以下缺点：每次购买人物都需要修改Master类
     *  的源码，增加feed()方法的重载方法，如果购买的人物过多，Master类中就会有很多重载的feed()方法。仔细观察可以发现Master类重
     *  载feed()方法的参数类型，有Hero、Army和新添加的类型，它们都有一个共同的父类Person。让Master类中只有一个feed()方法，可以
     *  实现人物的体力恢复，不管购买多少人物，均无需修改Master类源代码。通过多态可以实现。
     */

    /**
     * 多态：是对象多种表现形式的体现，多态是同一个行为具有不同表现形式或形态的能力。专业说法就是同一个实现接口，使用不同的
     * 实例而执行不同的操作。
     * <p>
     * 具体实现：使用父类作为方法形参实现多态 (java中实现多态的主要方式之一)
     *
     * @param person 生命值
     */
    //主公给人物恢复生命值
    public void feed(Person person) {
        //父类作为方法形参，父类引用指向子类对象，即可完成调用父类方法，实际调用子类重写的方法
        person.blood();
    }

    /**
     *1、在引用收据类型的子类和父类之间存在着类型转换问题，如下：
     *  Hero hero = new Hero("小明", "法师")	  //不涉及类型转换
     *  Person person = new Hero("小明", "法师")	  //子类到父类的转换
     *  person.blood();     //会调用Hero类重写的blood() 方法，而不是Person类的blood() 方法
     *  person.eat();        //编译错误，如果子类特有eat()方法，父类的引用无法调用子类特有的方法。
     *
     * 2、子类转换成父类时的规则：
     *  (1) 将一个父类的引用指向一个子类对象，称为向上转型(upcasting),自动进行类型转换。
     *  (2) 通过父类引用变量调用的方法，是子类覆盖或继承父类的方法，不是父类的方法。
     *  (3) 通过父类引用变量无法调用子类特有的方法。
     */
}
