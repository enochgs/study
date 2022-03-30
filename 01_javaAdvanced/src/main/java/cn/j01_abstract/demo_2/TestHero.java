package cn.j01_abstract.demo_2;

/**
 * 测试类
 * 主题：测试构造方法
 *
 * @author GST
 * @ demo_2 构造方法及其重载
 */
public class TestHero {
    public static void main(String[] args) {
        Hero hero = null;

        hero = new Hero();
        hero.print();

        hero = new Hero("郭靖", "男");
        hero.print();

        hero = new Hero("李师师", 80, 20, "女");
        hero.print();


    }
}
