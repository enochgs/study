package com.first.game.submarine.day02;

/**
 * 水雷
 *
 * @author GST
 * 优化：构造方法初始化
 * 关键词：无参构造方法、有参构造方法 初始化
 */
public class Mine {
    int width;
    int height;
    int x;
    int y;
    int speed;

    public Mine(int x, int y) {//每个水雷的x，y初始坐标不一样，跟水雷艇位置有关
        this.x = x;
        this.y = y;
        width = 11;
        height = 11;
        speed = 1;
    }

    void move() {
        System.out.println("水雷y向上移动");
    }

}
