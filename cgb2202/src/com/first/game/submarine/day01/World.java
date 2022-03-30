package com.first.game.submarine.day01;

/**
 * 整个游戏世界
 * 实例化对象 赋值
 * @author GST
 * 关键词：创建类、创建对象并赋值
 */
public class World {
    public static void main(String[] args) {
        Battleship bs = new Battleship();   //创建战舰对象
        bs.width = 20;  //宽
        bs.height = 40; //长
        bs.x = 100; //x坐标
        bs.y = 200; //y坐标
        bs.speed = 20; //移动速度
        bs.lif = 5;  //生命
        System.out.println(bs.width+","+ bs.height+","+ bs.x+","+ bs.y+","+ bs.speed);
        bs.move();

        ObserveSubmarine os1 = new ObserveSubmarine();  //创建侦察潜艇对象1
        os1.width = 18;  //宽
        os1.height = 30; //长
        os1.x = 200; //x坐标
        os1.y = 250; //y坐标
        os1.speed = 3; //移动速度
        System.out.println(os1.width+","+ os1.height+","+ os1.x+","+ os1.y+","+ os1.speed);
        os1.move();

        ObserveSubmarine os2 = new ObserveSubmarine();  //创建侦察潜艇对象2
        os2.width = 18;  //宽
        os2.height = 30; //长
        os2.x = 300; //x坐标
        os2.y = 245; //y坐标
        os2.speed = 1; //移动速度
        System.out.println(os2.width+","+ os2.height+","+ os2.x+","+ os2.y+","+ os2.speed);
        os2.move();

        TorpedoSubmarine ts1 = new TorpedoSubmarine();  //创建鱼雷潜艇对象1
        ts1.width = 20;  //宽
        ts1.height = 40; //长
        ts1.x = 100; //x坐标
        ts1.y = 200; //y坐标
        ts1.speed = 20; //移动速度
        System.out.println(ts1.width+","+ ts1.height+","+ ts1.x+","+ ts1.y+","+ ts1.speed);
        ts1.move();

        TorpedoSubmarine ts2 = new TorpedoSubmarine();  //创建鱼雷潜艇对象2
        ts2.width = 20;  //宽
        ts2.height = 40; //长
        ts2.x = 100; //x坐标
        ts2.y = 200; //y坐标
        ts2.speed = 20; //移动速度
        System.out.println(ts2.width+","+ ts2.height+","+ ts2.x+","+ ts2.y+","+ ts2.speed);
        ts2.move();

        MineSubmarine ms1 = new MineSubmarine();  //创建水雷潜艇对象1
        ms1.width = 20;  //宽
        ms1.height = 40; //长
        ms1.x = 100; //x坐标
        ms1.y = 200; //y坐标
        ms1.speed = 20; //移动速度
        System.out.println(ms1.width+","+ms1.height+","+ms1.x+","+ms1.y+","+ ms1.speed);
        ms1.move();

        MineSubmarine ms2 = new MineSubmarine();  //创建水雷潜艇对象2
        ms2.width = 20;  //宽
        ms2.height = 40; //长
        ms2.x = 100; //x坐标
        ms2.y = 200; //y坐标
        ms2.speed = 20; //移动速度
        System.out.println(ms2.width+","+ ms2.height+","+ ms2.x+","+ ms2.y+","+ ms2.speed);
        ms2.move();

        Mine m1 = new Mine();   //创建水雷对象1
        m1.width = 20;  //宽
        m1.height = 40; //长
        m1.x = 100; //x坐标
        m1.y = 200; //y坐标
        m1.speed = 20; //移动速度
        System.out.println(m1.width+","+ m1.height+","+ m1.x+","+ m1.y+","+ m1.speed);
        m1.move();

        Mine m2 = new Mine();   //创建水雷对象2
        m2.width = 20;  //宽
        m2.height = 40; //长
        m2.x = 100; //x坐标
        m2.y = 200; //y坐标
        m2.speed = 20; //移动速度
        System.out.println(m2.width+","+ m2.height+","+ m2.x+","+ m2.y+","+ m2.speed);
        m2.move();

        Bomb b1 = new Bomb();     //创建深水炸弹对象1
        b1.width = 20;  //宽
        b1.height = 40; //长
        b1.x = 100; //x坐标
        b1.y = 200; //y坐标
        b1.speed = 20; //移动速度
        System.out.println(b1.width+","+ b1.height+","+ b1.x+","+ b1.y+","+ b1.speed);
        b1.move();

        Bomb b2 = new Bomb();     //创建深水炸弹对象2
        b2.width = 20;  //宽
        b2.height = 40; //长
        b2.x = 100; //x坐标
        b2.y = 200; //y坐标
        b2.speed = 20; //移动速度
        System.out.println(b2.width+","+ b2.height+","+ b2.x+","+ b2.y+","+ b2.speed);
        b2.move();

    }
}
