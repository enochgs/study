package com.first.game.submarine.day07;

import javax.swing.*;

/**
 * 水雷潜艇
 * @author GST
 *
 * 改进：在6个派生类中重写getImage()获取对象的图片----重写getImage()获取图片
 */
public class MineSubmarine extends SeaObject {

    public MineSubmarine() {
        super(63,19);
    }
    /**
     * 重写move()移动
     */
    @Override
    public void move(){
        x += speed; //x+(向右)
    }

    @Override
    public ImageIcon getImage() {
        return Images.minesubm;
    }

}
