package cn.j03_polymorphism.demo_1;

/**
 * 主公类，使用人物类及子类的功能
 *
 * @author GST
 * @ demo_1 未使用多态优化
 */
public class Master {
    private String name = ""; // 主公名字
    private int money = 0; // 虚拟币

    public Master(String name, int money) {
        this.name = name;
        this.money = money;
    }

    // 主公给英雄恢复体力
    public void feed(Hero hero) {
        hero.blood();
    }

    // 主公给雇佣兵恢复体力
    public void feed(Army army) {
        army.blood();
    }
}
