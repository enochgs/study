package com.first.game.submarine.day07;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * 海洋对象
 *
 * @author GST
 * 添加：
 * 在SeaObject中设计抽象方法getImage()获取图片，给move()设计为抽象方法
 * 在SeaObject中设计状态常量LIVE、DEAD，state变量表示当前状态后期的业务中还需要判断对象的状态
 * 在SeaObject中设计isLive()、isDead()判断对象的状态
 * 在SeaObject中设计paintImage()画图片
 * <p>
 * 关键词：abstract 修饰
 */
public abstract class SeaObject {
    public static final int LIVE = 0; //活着的
    public static final int DEAD = 1; //死了的
    protected int state = LIVE; //当前状态(默认为活着的)

    protected int width;  //宽
    protected int height; //高
    protected int x;  //x坐标
    protected int y;  //y坐标
    protected int speed;  //移动速度

    /**
     * 有参构造方法
     * 专门给侦察潜艇、鱼雷潜艇、水雷潜艇提供的
     */
    //因为三种潜艇的宽和高是不一样的，所以数据不能写死，需传参写活
    //因为三种潜艇的x/y/speed是一样的，所以数据可以写死，不需要传参
    SeaObject(int width, int height) {
        this.width = width;
        this.height = height;
        x = -width; //负的潜艇的宽
        Random rand = new Random(); //随机数对象
        y = rand.nextInt(World.HEIGHT - height - 150 + 1) + 150; //150到(窗口高-潜艇高)之间的随机数
        speed = rand.nextInt(3) + 1; //1到3之间的随机数
    }

    /**
     * 专门给战舰、水雷、深水炸弹提供的
     */
    //因为战舰/水雷/深水炸弹的宽/高/x/y/speed都是不一样的，所以数据不能写死，需传参写活
    public SeaObject(int width, int height, int x, int y, int speed) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    /**
     * 海洋对象移动
     */
    public abstract void move();

    /**
     * 获取对象的图片
     */
    public abstract ImageIcon getImage();

    /**
     * 判断对象是否是活着的
     */
    public boolean isLive() {
        return state == LIVE; //若当前状态为LIVE，则返回true表示活着的，否则返回false
    }

    /**
     * 判断对象是否是死了的
     */
    public boolean isDead() {
        return state == DEAD; //若当前状态为DEAD，则返回true表示死了的，否则返回false
    }

    /**
     * 画对象 g:画笔
     */
    public void paintImage(Graphics g) {
        if (this.isLive()) { //若活着的
            this.getImage().paintIcon(null, g, this.x, this.y);
        }
    }
}
