package com.first.game.submarine.day06;

import javax.swing.*;

/**
 * 深水炸弹
 *
 * @author GST
 * 改进：在6个派生类中重写getImage()获取对象的图片----重写getImage()获取图片
 */
public class Bomb extends SeaObject {

    public Bomb(int x, int y) { //每个深水炸弹的x，y是不同的，跟战舰位置有关
        super(9, 12, x, y, 3);
    }

    /**
     * 重写move()移动
     */
    public void move() {
        y += speed; //y + (向下)
    }

    @Override
    public ImageIcon getImage() {
        return Images.bomb;
    }

}
