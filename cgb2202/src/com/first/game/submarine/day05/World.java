package com.first.game.submarine.day05;

import javax.swing.*;

/**
 * 整个游戏世界
 * @author GST
 * 优化：使用重写 针对前一天子类调用父类普通方法 move() 不能准确实现子类功能的优化
 *      因子类都有共同父类，可通过引用类型数组向上造型，减少代码量
 *
 * 关键词：重写、引用类型数组向上造型
 */
public class World extends JPanel { //2.
    public static void main(String[] args) {
        JFrame frame = new JFrame();	//3.
        World world = new World();
        world.setFocusable(true);
        frame.add(world);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(641+16,479+39);	//641 , 479 是图片宽高 （16，是win10两边有透明区域，39是上框边距）
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
