package com.first.object_oriented.day01;

/**
 * 重载演示  (Overload)
 *
 * @author GST
 *
 * 关键词：实体类，对象，重载
 */
public class OverloadDemo {
    public static void main(String[] args) {
        Aoo o = new Aoo();
        o.show();
        o.show(25);
        o.show("zhangsan");
        o.show("zhangsan", 25);
        o.show(25, "zhangan");
    }
}
