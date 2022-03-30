package com.first.game.submarine.day07;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 整个游戏世界
 * @author GST
 *
 * 改进：
 */
public class World extends JPanel { //2.
    public static final int WIDTH = 641;  //窗口的宽
    public static final int HEIGHT = 479; //窗口的高

    //如下这一堆就是窗口中所显示的对象
    private Battleship ship = new Battleship(); //战舰
    private SeaObject[] submarines = {};//潜艇(侦察潜艇、鱼雷潜艇、水雷潜艇)数组
    private Mine[] mines = {};  //水雷数组
    private Bomb[] bombs = {};  //深水炸弹数组

    /** 生成潜艇(侦察潜艇、鱼雷潜艇、水雷潜艇)对象 */
    public SeaObject nextSubmarine(){
        Random rand = new Random(); //随机数对象
        int type = rand.nextInt(20); //0到19之间的随机数
        if(type<10){ //0到9时，返回侦察潜艇对象
            return new ObserveSubmarine();
        }else if(type<15){ //10到14时，返回鱼雷潜艇对象
            return new TorpedoSubmarine();
        }else{ //15到19时，返回水雷潜艇对象
            return new MineSubmarine();
        }
    }
    private int subEnterIndex = 0; //潜艇入场计数
    /** 潜艇(侦察潜艇、鱼雷潜艇、水雷潜艇)入场 */
    public void submarineEnterAction(){ //每10毫秒走一次
        subEnterIndex++; //每10毫秒增1
        if(subEnterIndex%40==0){ //每400(40*10)毫秒走一次
            SeaObject obj = nextSubmarine(); //获取潜艇对象
            submarines = Arrays.copyOf(submarines,submarines.length+1); //扩容
            submarines[submarines.length-1] = obj; //将obj添加到submarines的最后一个元素上
        }
    }

    private int mineEnterIndex = 0; //水雷入场计数
    /** 水雷入场 */
    public void mineEnterAction(){ //每10毫秒走一次
        mineEnterIndex++; //每10毫秒增1
        if(mineEnterIndex%100==0){ //每1000(100*10)毫秒走一次
            //代码暂时搁置------周五讲
        }
    }

    /** 海洋对象移动 */
    public void moveAction(){ //每10毫秒走一次
        for(int i=0;i<submarines.length;i++){ //遍历所有潜艇
            submarines[i].move(); //潜艇移动
        }
        for(int i=0;i<mines.length;i++){ //遍历所有水雷
            mines[i].move(); //水雷移动
        }
        for(int i=0;i<bombs.length;i++){ //遍历所有深水炸弹
            bombs[i].move(); //深水炸弹动
        }
    }

    /** 启动程序的执行 */
    public void action(){
        Timer timer = new Timer();//定时器对象
        int interval = 10; //定时间隔(以毫秒为单位)
        timer.schedule(new TimerTask() {
            public void run() { //定时干的事(每10毫秒自动执行)
                submarineEnterAction(); //潜艇(侦察潜艇、鱼雷潜艇、水雷潜艇)入场
                mineEnterAction();      //水雷入场
                moveAction();           //海洋对象移动
                repaint(); //重画(重新调用paint()方法)-----不要求掌握
            }
        }, interval, interval); //定时计划表
    }

    /** 重写超类JPanel中的paint()画 g:画笔-----------不要求掌握 */
    public void paint(Graphics g){  //每10毫秒走一次,写画的业务
        Images.sea.paintIcon(null,g,0,0); //画海洋图（在下面对象之上画）

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
        JFrame frame = new JFrame();	//3. 新建一个窗口
        World world = new World();
        world.setFocusable(true);
        frame.add(world);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH+16,HEIGHT+39);	//641 , 479 是图片宽高 （16，是win10两边有透明区域，39是上框边距）
        frame.setLocationRelativeTo(null);
        frame.setVisible(true); //1)设置窗口可见  2)尽快调用paint()方法

        world.action(); //启动程序的执行

    }
}
