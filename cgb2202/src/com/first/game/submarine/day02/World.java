package com.first.game.submarine.day02;

/**
 * 构造方法初始化
 * 整个游戏世界
 *
 * @author GST
 * 优化：构造方法初始化
 * 关键词：无参构造方法、有参构造方法 初始化
 */
public class World {
    public static void main(String[] args) {
        Battleship ship = new Battleship();
        System.out.println(ship.width + "," + ship.height + "," + ship.x + "," + ship.y + "," + ship.speed + "," + ship.lif);
        ObserveSubmarine os1 = new ObserveSubmarine();
        ObserveSubmarine os2 = new ObserveSubmarine();
        ObserveSubmarine os3 = new ObserveSubmarine();
        ObserveSubmarine os4 = new ObserveSubmarine();
        System.out.println(os1.width + "," + os1.height + "," + os1.x + "," + os1.y + "," + os1.speed);
        System.out.println(os2.width + "," + os2.height + "," + os2.x + "," + os2.y + "," + os2.speed);
        System.out.println(os3.width + "," + os3.height + "," + os3.x + "," + os3.y + "," + os3.speed);
        System.out.println(os4.width + "," + os4.height + "," + os4.x + "," + os4.y + "," + os4.speed);
        TorpedoSubmarine ts1 = new TorpedoSubmarine();
        TorpedoSubmarine ts2 = new TorpedoSubmarine();
        Mine m1 = new Mine(123, 345);
        Mine m2 = new Mine(345, 234);
        System.out.println(m1.width + "," + m1.height + "," + m1.x + "," + m1.y + "," + m1.speed);
        System.out.println(m2.width + "," + m2.height + "," + m2.x + "," + m2.y + "," + m2.speed);
        Bomb b1 = new Bomb(200, 300);
        Bomb b2 = new Bomb(300, 400);
        System.out.println(m1.width + "," + b1.height + "," + b1.x + "," + b1.y + "," + b1.speed);
        System.out.println(b2.width + "," + b2.height + "," + b2.x + "," + b2.y + "," + b2.speed);


    }
}
