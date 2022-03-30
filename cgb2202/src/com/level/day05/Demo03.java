package com.level.day05;

import java.util.Random;

public class Demo03 {
    public static void main(String[] args) {

        //点数(rank) 数组
        String[] rank = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        int[] rank2 = {3,4,5,6,7,8,9,10,11,12,13,14,15};
        //颜色
        String[] colors = {"黑桃","红桃","梅花","方块"};
        //扑克牌数组 预留54个数组元素
        String[] cards = new String[54];
        int[] cards2 = new int[54];
        int q = 0;

        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                cards[q] = colors[i] + rank[j];
                cards2[q] =rank2[j];
                q++;
            }
        }

        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < rank2.length; j++) {

            }

        }
        cards[52] = "小王";
        cards[53] = "大王";
        cards2[52] = 16;
        cards2[53] = 17;

        System.out.print("\n\n扑克牌共有"+ cards.length+"张：");
        for (int i = 0; i < cards.length; i++) {
            if (i%13==0){
                System.out.println("\n");
            }
            System.out.print(cards[i] +"\t");
        }

        System.out.print("\n\n\n\n扑克牌共有");
        for (int i = 0; i < cards.length; i++) {
            if (i%13==0){
                System.out.println("\n");
            }
            System.out.print(cards2[i] +"\t");
        }

        /**
         * 抽牌
         */
        Random random = new Random();
        int anInt = random.nextInt(54);
        System.out.println("\n随机抽到了 "+ cards[anInt]);

        /**
         * 洗牌
         */
        for (int i = cards.length-1; i >=1; i--) {
            //从cards.length-1数量中随机抽出1张
            int an = random.nextInt(i);
            String t = cards[i];
            cards[i]=cards[an];
            cards[an]=t;

            int t2 = cards2[i];
            cards2[i]=cards2[an];
            cards2[an]=t2;
        }
        System.out.print("\n\n\n\n洗牌后：");
        for (int i = 0; i < cards.length; i++) {
            if (i%13==0){
                System.out.println("\n");
            }
            System.out.print(cards[i] +"\t");
        }
        System.out.print("\n\n\n\n洗牌：");
        for (int i = 0; i < cards2.length; i++) {
            if (i%13==0){
                System.out.println("\n");
            }
            System.out.print(cards2[i] +"\t");
        }

        System.out.println("\n\n\n\n发牌：");
        String[] wang = new String[17];
        String[] lee = new String[17];
        String[] zhang = new String[17];

        int[] wang2 = new int[17];
        int[] lee2 = new int[17];
        int[] zhang2 = new int[17];

        for (int i = 0; i < 17; i++) {
            wang[i] = cards[i*3];
            lee[i] = cards[i*3+1];
            zhang[i] = cards[i*3+2];
        }

        for (int i = 0; i < 17; i++) {
            wang2[i] = cards2[i*3];
            lee2[i] = cards2[i*3+1];
            zhang2[i] = cards2[i*3+2];
        }

        System.out.println("\n\n\n\n发牌：");
        System.out.print("wang  ：");
        for (int i = 0; i < 17; i++) {
            System.out.print(wang[i]+"\t");

        }
        System.out.print("\nlee  ：");
        for (int i = 0; i < 17; i++) {
            System.out.print(lee[i]+"\t");
        }
        System.out.print("\nzhang  ：");
        for (int i = 0; i < 17; i++) {

            System.out.print(zhang[i]+"\t");
        }

        System.out.print("\nwang2  ：");
        for (int i = 0; i < 17; i++) {
            System.out.print(wang2[i]+"\t");
        }

        System.out.print("\nlee2  ：");
        for (int i = 0; i < 17; i++) {
            System.out.print(lee2[i]+"\t");
        }
        System.out.print("\nzhang2  ：");
        for (int i = 0; i < 17; i++) {

            System.out.print(zhang2[i]+"\t");
        }

        for (int i = 0; i < wang2.length-1; i++) {
            for (int j = 0; j < wang2.length-i-1; j++) {
                if (wang2[j]>wang2[j+1]){
                    int num = wang2[j];
                    wang2[j] =  wang2[j+1];
                    wang2[j+1] = num;
                }
            }
        }
        System.out.print("\nwang2  ：");
        for (int i = 0; i < 17; i++) {
            System.out.print(wang2[i]+"\t");
        }

    }

}
