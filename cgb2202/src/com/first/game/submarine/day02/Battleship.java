package com.first.game.submarine.day02;

/**
 * 战舰
 *
 * @author GST
 * 优化：构造方法初始化
 * 关键词：无参构造方法、有参构造方法 初始化
 */
public class Battleship {
    //成员变量：width ，height，x，y，life，speed
    //move()
    int width;  //宽
    int height; //长
    int x;  //x坐标
    int y;  //y坐标
    int speed;  //移动速度
    int lif;    //生命条数

    public Battleship() {
        this.width = 66;    //战舰贴图的像素宽
        this.height = 26;   //贴图的像素高
        this.x = 270;   //初始坐标
        this.y = 124;
        this.speed = 2; //速度
        this.lif = 5;   //生命条数
    }

    void move() {    //移动方法
        System.out.println("战舰移动");
    }

}
