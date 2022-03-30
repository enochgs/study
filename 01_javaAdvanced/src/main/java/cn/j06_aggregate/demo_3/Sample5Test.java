package cn.j06_aggregate.demo_3;

import cn.j01_abstract.demo_3.Hero;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 测试通过Iterator 遍历 HashMap
 *
 * @author GST
 */
public class Sample5Test {
    public static void main(String[] args) {
        //创建4个英雄对象
        Hero heroGuo = new Hero("郭靖", "战士");
        Hero heroHuang = new Hero("黄蓉", "法师");
        Hero heroAna = new Hero("阿纳金", "剑士");
        Hero heroMu = new Hero("穆桂英", "元帅");
        //创建HashMap 集合对象并把4个英雄对象放入其中
        Map map = new HashMap();
        map.put(heroGuo.getName(), heroGuo);
        map.put(heroHuang.getName(), heroHuang);
        map.put(heroAna.getName(), heroAna);
        map.put(heroMu.getName(), heroMu);
        //通过迭代器依次输出集合所有英雄信息
        System.out.println("使用 Iterator 遍历：" + "所有英雄的昵称和职业分别是：");
        Set keys = map.keySet();    //取出所有的键
        Iterator it = keys.iterator();  //获取Iterator对象
        while (it.hasNext()) {   //使用Iterator的hasNext方法
            String key = (String) it.next(); //使用Iterator的next方法取出key
            Hero hero = (Hero) map.get(key);    //根据key 取出对应的对象
            System.out.println(key + "\t" + hero.getOccupation());
        }
    }
}
