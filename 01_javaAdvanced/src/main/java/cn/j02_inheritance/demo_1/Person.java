package cn.j02_inheritance.demo_1;

/**
 * 人物类，英雄类和雇佣兵类的父类
 *
 * @author GST
 * @ demo_1 继承
 */
public class Person {
    private String name = "无名";   //昵称
    private int health = 100; //生命值

    /**
     * 无参构造方法
     */
    public Person() {
        this.health = 95;
        System.out.println("执行人物的无参构造方法");
    }

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
     * 输出英雄的信息
     */
    public void print() {
        System.out.println("英雄的自白：\n 我叫" + this.name + "，生命值:" + this.health);
    }

}
