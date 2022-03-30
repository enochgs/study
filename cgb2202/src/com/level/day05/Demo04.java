package com.level.day05;

import java.util.Random;

/**
 * 扑克牌  (3人斗地主)
 * 升序排列  (黑、红、梅、方)
 * 洗牌随机排列
 * 依次分发手牌
 * 整理手牌  (从大到小排列)
 */
public class Demo04 {
    public static void main(String[] args) {
        /**
         * 交换两个变量：3个变量首尾相接兜圈赋值
         */
        int a = 5;
        int b = 8;
        int t = a;
        a = b;
        b = t;
        System.out.println(a+"\n"+b);

        /*
         * 对于前三个需求的思路
         * 定义：
         *      点数数组串 ranks = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"}
         *      花色数组串 colors =  {"♠","♥","♣","♦"}
         *      扑克牌数组串 cards = new String[54]
         *
         * 使用双重for循环为card数组依次赋值花色及点数
         * 使用随机数和扑克牌乱序经典算法进行洗牌
         *
         * String[] wang = new String[17];
         * String[] lee = new String[17];
         * String[] zhang = new String[17];
         * 对扑克牌数组串 cards 依次取值且同时依次存取到手牌数组串中
         *
         */
        //点数数组串
        String[] ranks = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        int[] ranks2 = {3,4,5,6,7,8,9,10,11,12,13,14,15};//影子
        //花色数组串
        String[] colors = {"黑桃","红桃","梅花","方块"};
        //扑克牌数组串
        String[] cards = new String[54];
        int[] cards2 = new int[54];//影子
        //依次赋值花色及点数
        int k = 0;
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                cards[k] = colors[i] + ranks[j];
                cards2[k] = ranks2[j];//影子
                k++;
            }
        }
        cards[52] = "小王";
        cards[53] = "大王";
        cards2[52] = 16;
        cards2[53] = 17;

        //升序排列    遍历输出 扑克牌数组串 cards的全部牌
        for (int i = 0; i < cards.length; i++) {
            if (i%13 ==0)
                System.out.println();
            System.out.print(cards[i]+"\t");
        }
        for (int i = 0; i < cards.length; i++) {
            if (i%13 ==0)
                System.out.println();
            System.out.print(cards2[i]+"\t");
        }
        //洗牌随机排列    随机数结合洗牌算法
        Random random = new Random();

        for (int i = cards.length-1; i >0 ; i--) {
            //数字随机一个，max=52，min=0
            int rest = random.nextInt(i);
            String str = cards[i];
            cards[i] = cards[rest];
            cards[rest] = str;

            int str2 = cards2[i];
            cards2[i] = cards2[rest];
            cards2[rest] = str2;
        }
        System.out.print("\n\n洗牌后：");
        for (int i = 0; i < cards.length; i++) {
            if (i%13==0){
                System.out.print("\n");
            }
            System.out.print(cards[i] +"\t");
        }

        String [] wang = new String[17];
        String [] lee = new String[17];
        String [] zhang = new String[17];

        int [] wang2 = new int[17];
        int [] lee2 = new int[17];
        int [] zhang2 = new int[17];

        for (int i = 0; i < 17; i++) {
            wang[i] = cards[i*3];
            lee[i] = cards[i*3+1];
            zhang[i] = cards[i*3+2];

            wang2[i] = cards2[i*3];
            lee2[i] = cards2[i*3+1];
            zhang2[i] = cards2[i*3+2];
        }

        System.out.println("\n\n发牌：");

        System.out.print("wang  ：");
        for (int i = 0; i < 17; i++) {
            System.out.print(wang[i]+"  ");
        }
        System.out.print("\nlee  ：");
        for (int i = 0; i < 17; i++) {
            System.out.print(lee[i]+"  ");
        }
        System.out.print("\nzhang  ：");
        for (int i = 0; i < 17; i++) {
            System.out.print(zhang[i]+"  ");
        }
        System.out.print("\nwang2  ：");
        for (int i = 0; i < 17; i++) {
            System.out.print(wang2[i]+"  ");
        }

        for (int i = 0; i < wang2.length-1; i++) {
            for (int j = 0; j < wang2.length-i-1; j++) {
                if (wang2[j] < wang2[j+1]){

                    int num2 = wang2[j];
                    wang2[j] =  wang2[j+1];
                    wang2[j+1] = num2;

                    String num = wang[j];
                    wang[j] =  wang[j+1];
                    wang[j+1] = num;
                }
            }
        }
        for (int i = 0; i < lee2.length-1; i++) {
            for (int j = 0; j < lee2.length-i-1; j++) {
                if (lee2[j] < lee2[j+1]){

                    int num2 = lee2[j];
                    lee2[j] =  lee2[j+1];
                    lee2[j+1] = num2;

                    String num = lee[j];
                    lee[j] =  lee[j+1];
                    lee[j+1] = num;
                }
            }
        }
        for (int i = 0; i < zhang2.length-1; i++) {
            for (int j = 0; j < zhang2.length-i-1; j++) {
                if (zhang2[j] < zhang2[j+1]){

                    int num2 = zhang2[j];
                    zhang2[j] =  zhang2[j+1];
                    zhang2[j+1] = num2;

                    String num = zhang[j];
                    zhang[j] =  zhang[j+1];
                    zhang[j+1] = num;
                }
            }
        }


        System.out.print("\n\n整理手牌：\nwang:");
        for (int i = 0; i < 17; i++) {
            System.out.print(wang[i]+"\t");
        }

        System.out.print("\n lee:");
        for (int i = 0; i < 17; i++) {
            System.out.print(lee[i]+"\t");
        }
        System.out.print("\nzhang:");
        for (int i = 0; i < 17; i++) {
            System.out.print(zhang[i]+"\t");
        }



    }
}
