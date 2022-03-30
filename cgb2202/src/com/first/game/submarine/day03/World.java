package com.first.game.submarine.day03;

/**
 * 整个游戏世界
 * @author GST
 * 提取实体类公共部分作超类，被提取的类都是子类
 * 关键词：继承、超类、子类，引用类型数组
 */
public class World {
    public static void main(String[] args) {
        ObserveSubmarine[] oses = new ObserveSubmarine[3];
        oses[0] = new ObserveSubmarine();
        oses[1] = new ObserveSubmarine();
        oses[2] = new ObserveSubmarine();
        for (int i = 0; i < oses.length; i++) { //循环遍历所有侦察潜艇
            System.out.println(oses[i].x+","+oses[i].y);    //输出每个潜艇的x和y坐标
            oses[i].move(); //每个潜艇移动一下
        }
        TorpedoSubmarine[] tses = new TorpedoSubmarine[2];
        MineSubmarine[] mses = new MineSubmarine[3];
        Mine[] ms = new Mine[2];
        Bomb[] bs = new Bomb[3];
        bs[0] = new Bomb(100,200);
        bs[1] = new Bomb(200,300);
        bs[2] = new Bomb(100,234);
        for(int i=0;i<bs.length;i++){
            System.out.println(bs[i].x+","+bs[i].y);
            bs[i].move();
        }
    }
}
