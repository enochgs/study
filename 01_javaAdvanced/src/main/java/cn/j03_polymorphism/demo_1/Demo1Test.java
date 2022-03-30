package cn.j03_polymorphism.demo_1;

/**
 * 测试类
 *
 * @author GST
 * @ demo_1 未使用多态优化
 */
public class Demo1Test {
    public static void main(String[] args) {
        Hero hero = new Hero("关羽", "战士");
        Army army = new Army("华容", "弓箭手营房");
        Master master = new Master("小明", 100);
        master.feed(hero);
        master.feed(army);
    }
}