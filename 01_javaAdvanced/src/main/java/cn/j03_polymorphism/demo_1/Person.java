package cn.j03_polymorphism.demo_1;

/**
 * 人物类，Hero及Army的父类
 *
 * @author GST
 * @ demo_1 未使用多态优化
 */
public abstract class Person {
    protected String name;
    protected int health = 100; //生命值

    /**
     * 有参构造方法
     *
     * @param name 昵称
     */
    public Person(String name) {
        this.name = name;
    }

    public abstract void blood();

    public void print() {
        System.out.println(this.name + "的生命值增加到" + this.health + "。");
    }

}
