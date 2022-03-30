package com.first.game.submarine.day05;

/**
 * 战舰
 *
 * @author GST
 * 优化：使用重写 针对前一天子类调用父类普通方法 move() 不能准确实现子类功能的优化
 *      因子类都有共同父类，可通过引用类型数组向上造型，减少代码量
 * <p>
 * 关键词：重写、向上造型
 */
public class Battleship extends SeaObject {
    //成员变量：width ，height，x，y，life，speed
    //move()
    int lif;    //生命条数

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
    void move() {
        //具体实现暂时搁置
    }

}
