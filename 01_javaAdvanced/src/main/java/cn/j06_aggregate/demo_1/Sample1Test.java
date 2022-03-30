package cn.j06_aggregate.demo_1;

import cn.j01_abstract.demo_3.Hero;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试ArrayList 的 add() 、get() 方法
 *
 * @author GST
 */
public class Sample1Test {
    public static void main(String[] args) {
        //创建4个英雄对象
        Hero heroGuo = new Hero("郭靖", "战士");
        Hero heroHuang = new Hero("黄蓉", "法师");
        Hero heroAna = new Hero("阿纳金", "剑士");
        Hero heroMu = new Hero("穆桂英", "元帅");
        Hero heroZf = new Hero("张飞", "坦克");
        //创建ArrayList集合对象，并把4个英雄对象放入其中
        List heros = new ArrayList();
        heros.add(heroGuo);
        heros.add(heroHuang);
        heros.add(heroAna);
        heros.add(1, heroMu);    //添加到指定位置
        ///heros.add(0,heroZf);

        //输出集合中英雄数量
        System.out.println("总共有" + heros.size() + "个英雄");
        //通过遍历集合显示各英雄信息
        for (int i = 0; i < heros.size(); i++) {
            Hero hero = (Hero) heros.get(i);   //取出的是Object类型，使用前需强制类型转换
            System.out.println(hero.getName() + "\t" + hero.getOccupation());
        }


    }
}
