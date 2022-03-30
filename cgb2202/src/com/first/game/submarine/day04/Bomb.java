package com.first.game.submarine.day04;

/**
 * 深水炸弹
 *
 * @author GST
 * 优化：使用重写 针对前一天子类调用父类普通方法 move() 不能准确实现子类功能的优化
 *      因子类都有共同父类，可通过引用类型数组向上造型，减少代码量
 * <p>
 * 关键词：重写、向上造型
 */
public class Bomb extends SeaObject {

    public Bomb(int x, int y) { //每个深水炸弹的x，y是不同的，跟战舰位置有关
        super(9, 12, x, y, 3);
    }

    /**
     * 重写move()移动
     */
    void move() {
        y += speed; //y + (向下)
    }

}
