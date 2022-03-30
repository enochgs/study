package com.first.game.submarine.day04;

import java.util.Random;

/**
 * 海洋对象
 * @author GST
 * 优化：使用重写 针对前一天子类调用父类普通方法 move()不能准确实现子类功能的优化
 *      因子类都有共同父类，可通过引用类型数组向上造型，减少代码量
 *
 * 关键词：重写、向上造型
 */
public class SeaObject {
    int width;  //宽
    int height; //高
    int x;  //x坐标
    int y;  //y坐标
    int speed;  //移动速度
    /**
     * 有参构造方法
     * 专门给侦察潜艇、鱼雷潜艇、水雷潜艇提供的
     */
    //因为三种潜艇的宽和高是不一样的，所以数据不能写死，需传参写活
    //因为三种潜艇的x/y/speed是一样的，所以数据可以写死，不需要传参
    SeaObject(int width,int height){
        this.width = width;
        this.height = height;
        x = -width; //负的潜艇的宽
        Random rand = new Random(); //随机数对象
        y = rand.nextInt(479-height-150+1)+150; //150到(窗口高-潜艇高)之间的随机数
        speed = rand.nextInt(3)+1; //1到3之间的随机数
    }

    /**
     * 有参构造方法
     * 专门给战舰、水雷、深水炸弹提供的
     * @param width     宽度
     * @param height    高度
     * @param x         x轴坐标
     * @param y         y轴坐标
     * @param speed     移动速度
     */
    //因为战舰/水雷/深水炸弹的宽/高/x/y/speed都是不一样的，所以数据不能写死，需传参写活
    public SeaObject(int width, int height, int x, int y, int speed) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.speed = speed;
    }
    void move(){    //移动方法
        System.out.println("海洋对象移动了");
    }
}
