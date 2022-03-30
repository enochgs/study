package com.first.game.submarine.day02;

import java.util.Random;

/**
 * 水雷潜艇
 *
 * @author GST
 * 优化：构造方法初始化
 * 关键词：无参构造方法、有参构造方法 初始化
 */
public class MineSubmarine {
    int width;
    int height;
    int x;
    int y;
    int speed;

    public MineSubmarine() {
        width = 63;    //侦察潜艇图片像素宽
        height = 19;   //侦察潜艇图片像素高
        x = -width; //负的潜艇的宽
        Random random = new Random();//随机数对象
        y = random.nextInt(479 - height - 150 + 1) + 150; //150到(窗口高-潜艇高)之间
        speed = (random.nextInt(3) + 1);//1~3速度
    }

    void move() {
        System.out.println("水雷潜艇x向右移动");
    }

}
