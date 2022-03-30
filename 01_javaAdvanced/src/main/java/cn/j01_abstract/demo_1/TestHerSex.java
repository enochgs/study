package cn.j01_abstract.demo_1;

/**
 * 测试英雄性别类
 * final关键字：常量存储，解决创建很多对象，要修改大量共同的属性值的问题。通常常量名都大写。
 * 例如：public final String SEX_MAN="男";
 * public final String SEX_WOMAN="女";
 * 主题：使用final对象赋值
 *
 * @author GST
 * @ demo_1 创建类和对象
 */
public class TestHerSex {
    public static void main(String[] args) {
        HeroSex heroSex = new HeroSex();

        Hero hero = new Hero();
        System.out.println("第1个英雄的性别是" + hero.sex + "。");

        Hero hero2 = new Hero();
        hero2.sex = heroSex.SEX_WOMAN;
        System.out.println("第2个英雄的性别是" + hero2.sex + "。");

        Hero hero3 = new Hero();
        hero3.sex = heroSex.SEX_MAN;
        System.out.println("第3个英雄的性别是" + hero3.sex + "。");

    }
}
