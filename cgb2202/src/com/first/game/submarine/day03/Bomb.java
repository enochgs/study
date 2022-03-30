package com.first.game.submarine.day03;

/**
 * 深水炸弹
 * @author GST
 * 提取实体类公共部分作超类，被提取的类都是子类
 * 关键词：继承、超类、子类，引用类型数组
 */
public class Bomb extends SeaObject {

    public Bomb(int x, int y) { //每个深水炸弹的x，y是不同的，跟战舰位置有关
        super(9,12,x,y,3);
    }

}
