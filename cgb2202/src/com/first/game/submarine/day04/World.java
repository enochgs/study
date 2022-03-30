package com.first.game.submarine.day04;
import javax.swing.JFrame;
import javax.swing.JPanel; //1.

/**
 * 整个游戏世界
 * @author GST
 * 优化：使用重写 针对前一天子类调用父类普通方法 move() 不能准确实现子类功能的优化
 *      因子类都有共同父类，可通过引用类型数组向上造型，减少代码量
 *
 * 关键词：重写、引用类型数组向上造型
 */
public class World extends JPanel { //2.
    public static void main(String[] args) {
        JFrame frame = new JFrame();	//3.
        World world = new World();
        world.setFocusable(true);
        frame.add(world);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(641+16,479+39);	//641 , 479 是图片宽高 （16，是win10两边有透明区域，39是上框边距）
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        SeaObject[] submarines = new SeaObject[6]; //潜艇数组
        submarines[0] = new ObserveSubmarine(); //向上造型
        submarines[1] = new ObserveSubmarine(); //向上造型
        submarines[2] = new TorpedoSubmarine();
        submarines[3] = new TorpedoSubmarine();
        submarines[4] = new MineSubmarine();
        submarines[5]= new Mine(100,200);
        for(int i=0;i<submarines.length;i++){ //遍历所有潜艇
            SeaObject s = submarines[i]; //获取每个潜艇
            System.out.println(s.x+","+s.y); //输出每个潜艇的x和y坐标
            s.move(); //每个潜艇移动一下
        }

        Mine[] mines = new Mine[3];
        mines[0] = new Mine(100,200);
        mines[1] = new Mine(200,300);
        mines[2] = new Mine(300,400);
        for(int i=0;i<mines.length;i++){
            Mine m = mines[i];
            System.out.println(m.x+","+m.y);
            m.move();
        }


    }
}
