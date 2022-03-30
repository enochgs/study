package com.first.game.submarine.day06;

import javax.swing.*;

/**
 * 战舰:是海洋对象
 *
 * @author GST
 *
 * 改进：在6个派生类中重写getImage()获取对象的图片----重写getImage()获取图片
 */
public class Battleship extends SeaObject {
    //成员变量：width ，height，x，y，life，speed
    //move()
    private int lif;    //生命条数

    /**
     * 构造方法
     */
    public Battleship() {
        super(66, 26, 270, 124, 20);
        this.lif = 5;
    }

    /**
     * 重写move()移动
     */
    public void move() {
        //具体实现暂时搁置
    }

    /** 重写getImage()获取图片 */
    @Override
    public ImageIcon getImage() {
        return Images.battleship;   //返回战舰图片
    }

}
