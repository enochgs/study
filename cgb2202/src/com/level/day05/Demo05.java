package com.level.day05;

import java.util.Random;

public class Demo05 {
    public static void main(String[] args) {
        //点数
        String[] rank = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "k", "A", "2"};
        //牌位
        String[] cards = new String[54];
        //花色
        String[] colors = {"黑桃", "方块", "梅花", "红桃"};

        int[] reference = new int[54];
        for (int i = 0; i < rank.length; i++) {
            String number = rank[i];
            String card = "红桃" + number;
            cards[i] = card;
            card = "黑桃" + number;
            cards[i + 13] = card;
            card = "方块" + number;
            cards[i + 26] = card;
            card = "梅花" + number;
            cards[i + 39] = card;
        }
        cards[52] = "小王";
        cards[53] = "大王";
        //生成牌
        for (int i = 0; i < 13; i++) {
            reference[i] = i + 1;   //1~13
            reference[i + 13] = i + 1;  //14~25
            reference[i + 26] = i + 1;  //26~39
            reference[i + 39] = i + 1;  //40~52
        }
        reference[52] = 14;
        reference[53] = 15;

        //对照组
        Random random = new Random();
        for (int i = cards.length - 1; i > 0; i--) {
            int number = random.nextInt(i); //随机生成0~52
            String t = cards[i];
            cards[i] = cards[number];
            cards[number] = t;
            int u = reference[number];
            reference[number] = reference[i];
            reference[i] = u;
        }
        //玩家3人数组
        String[] wang = new String[17];
        String[] zhang = new String[17];
        String[] shi = new String[17];
        //标尺数组
        int[] shi1 = new int[17];
        int[] wang1 = new int[17];
        int[] zhang1 = new int[17];

        //生成个人手牌
        for (int i = 0; i < 17; i++) {
            wang[i] = cards[i * 3];
            wang1[i] = reference[i * 3];

            shi[i] = cards[i * 3 + 1];
            shi1[i] = reference[i * 3 + 1];

            zhang[i] = cards[i * 3 + 2];
            zhang1[i] = reference[i * 3 + 2];
        }

        //借助数字值的int数组来确定牌的顺序
        for (int i = 16; i >1; i--) {//数字牌的元素总个数
            for (int j = 0; j < i; j++) {
                if (wang1[j] <= wang1[j + 1]) {

                    int u = wang1[j];
                    wang1[j] = wang1[j + 1];
                    wang1[j+1] = u;

                    String e=wang[j];
                    wang[j]=wang[j+1];
                    wang[j+1]=e;
                }
            }
        }

        for (int i = 16; i >1; i--) {
            for (int j = 0; j < i; j++) {
                if (shi1[j] <= shi1[j + 1]) {
                    int u = shi1[j];
                    shi1[j] = shi1[j + 1];
                    shi1[j+1] = u;
                    String e=shi[j];
                    shi[j]=shi[j+1];
                    shi[j+1]=e;
                }
            }
        }
        for (int i = 16; i >1; i--) {
            for (int j = 0; j < i; j++) {
                if (zhang1[j] <= zhang1[j + 1]) {
                    int u = zhang1[j];
                    zhang1[j] = zhang1[j + 1];
                    zhang1[j+1] = u;
                    String e=zhang[j];
                    zhang[j]=zhang[j+1];
                    zhang[j+1]=e;
                }
            }
        }


        //对手牌排序
        System.out.println();
        System.out.println("王先生的手牌");
        for (int i = 0; i <17 ; i++) {
            System.out.print(wang[i]+" ");
        }
        System.out.println();
        System.out.println("史先生的手牌");
        for (int i = 0; i <17 ; i++) {
            System.out.print(shi[i]+" ");
        }
        System.out.println();
        System.out.println("张先生的手牌");
        for (int i = 0; i <17 ; i++) {
            System.out.print(zhang[i]+" ");
        }
        //输出

    }

}
