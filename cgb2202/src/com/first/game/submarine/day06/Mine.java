package com.first.game.submarine.day06;

import javax.swing.*;

/**
 *水雷
 * @author GST
 *
 * 改进：在6个派生类中重写getImage()获取对象的图片----重写getImage()获取图片
 */
public class Mine extends SeaObject {

    public Mine(int x,int y) {//每个水雷的x，y初始坐标不一样，跟水雷艇位置有关
        super(11,11,x,y,1);
    }
    /**
     * 重写move()移动
     */
    public void move(){
        y -= speed; //y-(向上)
    }

    @Override
    public ImageIcon getImage() {
        return Images.mine;
    }

}
