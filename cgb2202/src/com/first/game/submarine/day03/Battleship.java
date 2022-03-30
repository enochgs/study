package com.first.game.submarine.day03;

/**
 * 战舰
 * @author GST
 * 提取实体类公共部分作超类，被提取的类都是子类
 * 关键词：继承、超类、子类，引用类型数组
 */
public class Battleship extends SeaObject {
    //成员变量：width ，height，x，y，life，speed
    //move()
    int lif;    //生命条数

    /**构造方法*/
    public Battleship() {
        super(66,26,270,124,20);
        this.lif = 5;
    }

}
