package cn.j06_aggregate.demo_2;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试 HashMap 的多个方法
 *
 * @author GST
 */
public class Sample4Test {
    public static void main(String[] args) {
        //使用 HashMap 存储多组电视台英文简称和中文全称的“键-值对”
        Map map = new HashMap();
        map.put("CCTV", "中央电视台");
        map.put("HNTV", "河南电视台");
        map.put("TVB", "翡翠台");

        //显示CCTV 对应的中文全称
        String tvValue = (String) map.get("CCTV");
        System.out.println("CCTV是：" + tvValue);

        //显示集合中元素个数
        System.out.println("map集合中共有" + map.size() + "个元素");

        //判断是否有HNTV
        System.out.println("map中有HNTV的值吗？" + map.containsKey("HNTV"));

        //分别显示键集、值集和键值对集
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map);

        //清空 HashMap 并判断
        map.clear();
        if (map.isEmpty()) {
            System.out.println("已清空Map中的数据");
        }


    }
}
