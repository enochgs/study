package com.first.game.submarine.day04;

/**
 * 水雷潜艇
 * @author GST
 * 优化：使用重写 针对前一天子类调用父类普通方法 move()不能准确实现子类功能的优化
 *      因子类都有共同父类，可通过引用类型数组向上造型，减少代码量
 *
 * 关键词：重写、向上造型
 */
public class MineSubmarine extends SeaObject {

    public MineSubmarine() {
        super(63,19);
    }
    /**
     * 重写move()移动
     */
    void move(){
        x += speed; //x+(向右)
    }

}
