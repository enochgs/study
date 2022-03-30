package cn.j06_aggregate.demo_1;

import cn.j01_abstract.demo_3.Hero;

import java.util.LinkedList;

/**
 * 测试LinkedList 的多个特殊方法
 *
 * @author GST
 */
public class Sample3Test {
    public static void main(String[] args) {
//创建4个英雄对象
        Hero heroGuo = new Hero("郭靖", "战士");
        Hero heroHuang = new Hero("黄蓉", "法师");
        Hero heroAna = new Hero("阿纳金", "剑士");
        Hero heroMu = new Hero("穆桂英", "元帅");
        //创建LinkedList集合对象，并把4个英雄对象放入其中
        LinkedList heros = new LinkedList();
        heros.add(heroGuo);
        heros.add(heroHuang);
        heros.addFirst(heroMu);
        heros.addLast(heroAna);
        //查看第一个英雄的昵称
        Hero first = (Hero) heros.getFirst();
        System.out.println("第一个英雄是：" + first.getName());
        //查看最后一个英雄的昵称
        Hero last = (Hero) heros.getLast();
        System.out.println("最后一个英雄是：" + last.getName());
        //删除第一个英雄和最后一个英雄
        heros.removeFirst();
        heros.removeLast();
        //显示删除部分英雄后集合中所有的英雄信息
        System.out.println("删除后共有" + heros.size() + "个英雄");
        System.out.println("分别是：");
        for (int i = 0; i < heros.size(); i++) {
            Hero hero = (Hero) heros.get(i);
            System.out.println(hero.getName() + "\t" + hero.getOccupation());
        }
    }

}
