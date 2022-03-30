package cn.j06_aggregate.demo_1;

import cn.j01_abstract.demo_3.Hero;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试ArrayList 的 remove() 、contains() 方法
 *
 * @author GST
 */
public class Sample2Test {
    public static void main(String[] args) {
        //创建4个英雄对象
        Hero heroGuo = new Hero("郭靖", "战士");
        Hero heroHuang = new Hero("黄蓉", "法师");
        Hero heroAna = new Hero("阿纳金", "剑士");
        Hero heroMu = new Hero("穆桂英", "元帅");
        //创建ArrayList集合对象，并把4个英雄对象放入其中
        List heros = new ArrayList();
        heros.add(heroGuo);
        heros.add(heroHuang);
        heros.add(heroAna);
        heros.add(1, heroMu);    //添加到指定位置
        //输出删除前的数量
        System.out.println("--删除前共有" + heros.size() + "个英雄");
        //删除集合中第一个英雄和heroMu 的英雄
        heros.remove(0);
        heros.remove(heroMu);
        //输出删除后的数量
        System.out.println("--删除后共有" + heros.size() + "个英雄");
        System.out.println("分别是：");
        for (int i = 0; i < heros.size(); i++) {
            Hero hero = (Hero) heros.get(i);
            System.out.println(hero.getName() + "\t" + hero.getOccupation());
        }
        for (int i = 0; i < heros.size(); i++) {
            //判断集合中是否包含heroGuo 的信息
            if (heros.contains(heroGuo)) {
                System.out.println("\n 集合中包含郭靖的信息");
            } else {
                System.out.println("\n 集合中不包含郭靖的信息");
            }
        }
    }
}
