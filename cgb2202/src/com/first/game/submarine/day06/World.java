package com.first.game.submarine.day06;

import javax.swing.JFrame;
import javax.swing.JPanel; //1.
import java.awt.*;
/**
 * 整个游戏世界
 * @author GST
 *
 * 改进：设计窗口的宽和高为常量，适当地方做修改
 *      画海洋图潜艇，鱼雷，深海炸弹
 */
public class World extends JPanel { //2.
    public static final int WIDTH = 641;  //窗口的宽
    public static final int HEIGHT = 479; //窗口的高
    private Battleship ship = new Battleship(); //战舰
    private SeaObject[] submarines = {
            new ObserveSubmarine(),
            new TorpedoSubmarine(),
            new MineSubmarine()
    };
    private Mine[] mines = {
            new Mine(260,200)
    };
    private Bomb[] bombs = {
            new Bomb(200,120)
    };
    /** 重写paint()画 g:画笔-----------不要求掌握 */
    public void paint(Graphics g){
        Images.sea.paintIcon(null,g,0,0); //画海洋图
        ship.paintImage(g); //画战舰
        for(int i=0;i<submarines.length;i++){ //遍历所有潜艇
            submarines[i].paintImage(g); //画潜艇
        }
        for(int i=0;i<mines.length;i++){ //遍历所有水雷
            mines[i].paintImage(g); //画水雷
        }
        for(int i=0;i<bombs.length;i++){ //遍历所有深水炸弹
            bombs[i].paintImage(g); //画深水炸弹
        }
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame();	//3.
        World world = new World();
        world.setFocusable(true);
        frame.add(world);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH+16,HEIGHT+39);	//641 , 479 是图片宽高 （16，是win10两边有透明区域，39是上框边距）
        frame.setLocationRelativeTo(null);
        frame.setVisible(true); //1)设置窗口可见  2)尽快调用paint()方法

    }
}
