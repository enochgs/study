package cn.j06_aggregate.demo_4;

import cn.j01_abstract.demo_3.Hero;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 测试对 Map 应用泛型
 */
public class Sample9Test {
    public static void main(String[] args) {
        //创建4个英雄对象
        Hero heroGuo = new Hero("郭靖", "战士");
        Hero heroHuang = new Hero("黄蓉", "法师");
        Hero heroAna = new Hero("阿纳金", "剑士");
        Hero heroMu = new Hero("穆桂英", "元帅");
        //创建HashMap集合对象，并把4个英雄对象放入其中
        Map<String, Hero> map = new HashMap<String, Hero>();
        map.put(heroGuo.getName(), heroGuo);
        map.put(heroHuang.getName(), heroHuang);
        map.put(heroAna.getName(), heroAna);
        map.put(heroMu.getName(), heroMu);
        //通过迭代器依次输出所有英雄信息
        System.out.println("使用Iterator 遍历：" + "使用英雄的昵称和职业分别是：");
        Set keys = map.keySet();    //取出所有键
        /*Iterator it = keys.iterator();  //获取Iterator 对象
        while (it.hasNext()){
            String key = (String) it.next();    //取出key值
            Hero hero = map.get(key);   //根据key值 取出对象
            System.out.println(key+"\t"+hero.getOccupation());
        }
        */
        for (Object key : keys
        ) {
            Hero hero = map.get(key);
            System.out.println(key + "\t" + hero.getOccupation());
        }

    }
}
