package cn.j01_abstract.demo_3;

/**
 * 测试封装类
 * 就是将类的状态信息隐藏在类的内部，不允许外部程序直接访问，而通过该类提供的方法来实现对
 * 隐藏内部信息的操作和访问
 * 主题：封装，重载
 *
 * @author GST
 * @ demo_2 封装类
 */
public class TestHero {
    public static void main(String[] args) {
        Hero hero = null;
        hero = new Hero();
        //hero.name="郭靖"; //错误信息：The field Hero.name is not visible 字段Hero.name不可访问
        hero.setName("郭靖");
        hero.setOccupation("战士");
        hero.setHealth(300);
        hero.print();
        System.out.println("------------------------------------------------");
        hero = new Hero("乔峰", "战士");
        hero.work();
        System.out.println("生命值是：" + hero.getHealth());
        hero.blood();
        hero.print();
    }
}
