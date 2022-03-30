package com.first.game.submarine.day03;

/**
 *水雷
 * @author GST
 * 提取实体类公共部分作超类，被提取的类都是子类
 * 关键词：继承、超类、子类，引用类型数组
 */
public class Mine extends SeaObject {

    public Mine(int x,int y) {//每个水雷的x，y初始坐标不一样，跟水雷艇位置有关
        super(11,11,x,y,1);
    }


}
