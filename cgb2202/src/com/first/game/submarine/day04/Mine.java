package com.first.game.submarine.day04;

/**
 *水雷
 * @author GST
 * 优化：使用重写 针对前一天子类调用父类普通方法 move() 不能准确实现子类功能的优化
 *      因子类都有共同父类，可通过引用类型数组向上造型，减少代码量
 *
 * 关键词：重写、向上造型
 */
public class Mine extends SeaObject {

    public Mine(int x,int y) {//每个水雷的x，y初始坐标不一样，跟水雷艇位置有关
        super(11,11,x,y,1);
    }
    /**
     * 重写move()移动
     */
    void move(){
        y -= speed; //y-(向上)
    }

}
