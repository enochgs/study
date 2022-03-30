package com.level.day05;

/**
 * 创建一副扑克牌
 */
public class Demo02 {
    public static void main(String[] args) {
        //点数(rank) 数组
        String[] rank = {"3","4","5","6","7","8","9","10","J","Q","K"};

        //扑克牌数组 预留54个数组元素
        String[] cards = new String[54];

        for (int i = 0; i < rank.length; i++) {
            //代表每个点数值
            String value = rank[i];
            //创建了黑桃3 黑桃4 ... 黑桃2
            String card = "黑桃" + value;
            //检查创建结果
            //System.out.println(card);
            cards[i] = card;
        }

        //检查扑克牌的内容
        for (int i = 0; i < cards.length; i++) {
            String card = cards[i];
            System.out.println(card+" ");
        }
    }
}
