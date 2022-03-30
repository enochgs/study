package cn.j06_aggregate.demo_4;

import cn.j01_abstract.demo_3.Hero;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试对 List 应用泛型
 */
public class Sample8Test {
    public static void main(String[] args) {
        //创建4个英雄对象
        Hero heroGuo = new Hero("郭靖", "战士");
        Hero heroHuang = new Hero("黄蓉", "法师");
        Hero heroAna = new Hero("阿纳金", "剑士");
        Hero heroMu = new Hero("穆桂英", "元帅");
        //创建ArrayList集合对象，并把4个英雄对象放入其中
        List<Hero> list = new ArrayList<Hero>();
        list.add(heroGuo);
        list.add(heroHuang);
        list.add(heroAna);
        list.add(1, heroMu);    //添加到指定位置
        //显示第一个元素信息
        Hero hero1 = list.get(0);
        System.out.println("第一个英雄的信息如下：");
        System.out.println(hero1.getName() + "\t" + hero1.getOccupation());
        //使用 foreach 语句遍历 list 对象
        System.out.println("所有英雄信息如下：");
        for (Hero hero : list
        ) {
            System.out.println(hero.getName() + "\t" + hero.getOccupation());

        }
    }
}
