package cn.j06_aggregate.demo_3;

import cn.j01_abstract.demo_3.Hero;

import java.util.*;

/**
 * 测试通过Iterator 遍历 List
 *
 * @author GST
 */
public class Sample7Test {
    public static void main(String[] args) {
        //创建4个英雄对象
        Hero heroGuo = new Hero("郭靖", "战士");
        Hero heroHuang = new Hero("黄蓉", "法师");
        Hero heroAna = new Hero("阿纳金", "剑士");
        Hero heroMu = new Hero("穆桂英", "元帅");
        //创建HashMap 集合对象并把4个英雄对象放入其中
        List list = new ArrayList();
        list.add(heroGuo);
        list.add(heroHuang);
        list.add(heroAna);
        list.add(1, heroMu);
        //通过迭代器依次输出集合所有英雄信息
        System.out.println("使用 Iterator 遍历：" + "所有英雄的昵称和职业分别是：");
        Iterator it = list.iterator();  //获取Iterator对象
        while (it.hasNext()) {   //使用Iterator的hasNext方法
            Hero hero = (Hero) it.next();
            System.out.println(hero.getName() + "\t" + hero.getOccupation());
        }
    }
}
