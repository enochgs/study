package cn.j02_inheritance.demo_4;

/**
 * 人物抽象类，英雄类和雇佣兵类的父类
 * 抽象类和抽象方法都需要用abstract修饰，abstract可修饰类和方法，不能修饰属性和构造方法
 * 关键字：abstract
 *
 * @author GST
 * @ demo_4 抽象类
 */
public abstract class Person {
    private String name = "无名";   //昵称
    private int health = 100; //生命值
    /**
     * 象类和抽象方法的规则：
     *  (1)抽象类和抽象方法都需要用abstract修饰。
     *  (2)抽象类不能被实例化，抽象类中可以没有、有一个或多个抽象方法。
     *  (3)抽象方法只有方法声明，没有方法实现。
     *  (4)只要类中有一个抽象方法，此类必须是抽象类。
     *  (5)子类继承了抽象类，必须重写该抽象类中的所有抽象方法，除非子类还是一个抽象类。
     *  (6)抽象类可以有构造方法，可被本类其他构造方法调用，若此构造方法不是被private修饰，
     *     也可被子类的构造方法调用。
     */

    /**
     * 有参构造方法
     *
     * @param name 昵称
     */
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * 抽象方法，输出英雄信息
     * 没有方法体，子类必须重写该方法
     */
    public abstract void print();  // 抽象方法

    public Person(String name, int health) {
        this.name = name;
        this.health = health;
    }
}
