package com.first.game.submarine.day02;

/**
 * 深水炸弹
 *
 * @author GST
 * 优化：构造方法初始化
 * 关键词：无参构造方法、有参构造方法 初始化
 */
public class Bomb {
    int width;
    int height;
    int x;
    int y;
    int speed;

    public Bomb(int x, int y) { //每个深水炸弹的x，y是不同的，跟战舰位置有关
        this.x = x;
        this.y = y;
        //深水炸弹贴图宽高
        width = 9;
        height = 12;
        speed = 3;  //移速
    }

    void move() {
        System.out.println("深水炸弹y向下移动");
    }
}
