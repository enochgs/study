package com.first.game.submarine.day06;
/**
 * 第五天
 * 添加图片类和图片变量
 * 给父类成员变量添加权限修饰符
 */

import javax.swing.*;

public class Images {
  //公开的 静态的  图片数据类型 变量名
    public static ImageIcon battleship;//战舰图
    public static ImageIcon obsersubm; //侦察潜艇图
    public static ImageIcon torpesubm; //鱼雷潜艇图
    public static ImageIcon minesubm; //水雷潜艇图
    public static ImageIcon mine;     //水雷图
    public static ImageIcon bomb;   //深水炸弹图
    public static ImageIcon sea;    //海洋图
    public static ImageIcon gameover;   //游戏结束图

    static {//初始化静态图片
        battleship = new ImageIcon("cgb2202/img/imgship/battleship.png");
        obsersubm = new ImageIcon("cgb2202/img/imgship/obsersubm.png");
        torpesubm = new ImageIcon("cgb2202/img/imgship/torpesubm.png");
        minesubm = new ImageIcon("cgb2202/img/imgship/minesubm.png");
        mine = new ImageIcon("cgb2202/img/imgship/mine.png");
        bomb = new ImageIcon("cgb2202/img/imgship/bomb.png");
        sea = new ImageIcon("cgb2202/img/imgship/sea.png");
        gameover = new ImageIcon("cgb2202/img/imgship/gameover.png");
    }

    public static void main(String[] args) { //若返回8表示读取正确，否则表示读取失败
        System.out.println(battleship.getImageLoadStatus());
        System.out.println(obsersubm.getImageLoadStatus());
        System.out.println(torpesubm.getImageLoadStatus());
        System.out.println(minesubm.getImageLoadStatus());
        System.out.println(mine.getImageLoadStatus());
        System.out.println(bomb.getImageLoadStatus());
        System.out.println(sea.getImageLoadStatus());
        System.out.println(gameover.getImageLoadStatus());
    }


}
