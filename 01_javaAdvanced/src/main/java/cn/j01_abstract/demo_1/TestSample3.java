package cn.j01_abstract.demo_1;

import java.util.Scanner;

/**
 * 测试类
 * 功能：购买英雄或雇佣兵
 * 主题：实例化对象
 *
 * @author GST
 * @ demo_1 创建类和对象
 */
public class TestSample3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("欢迎来到本网游！");

        //1.输入人物昵称
        System.out.println("请输入要购买的人物昵称：）");
        String name = input.next();

        //2.输入人物类型
        System.out.println("请选择你要购买的人物类型：（1、英雄  2、雇佣兵）");
        int flag = input.nextInt();
        switch (flag) {
            case 1:
                //如果是英雄，选择英雄的职业
                System.out.println("请选择英雄的职业：（1、骑士  2、法师）");
                int occFlag = input.nextInt();
                String occupation = null;
                if (occFlag == 1) {
                    occupation = "骑士";
                } else {
                    occupation = "法师";
                }
                Hero hero = new Hero();
                hero.occupation = occupation;
                hero.name = name;
                hero.print();
                hero.loyalty = 90;
                hero.health = 92;
                break;
            default:
                //如果是雇佣兵，选择雇佣兵的出生地
                System.out.println("请选择雇佣兵的出生地：（1、盗贼公社  2、弓箭手营房）");
                int birthFlag = input.nextInt();
                String birthPlace = null;
                if (birthFlag == 1) {
                    birthPlace = "盗贼公社";
                } else {
                    birthPlace = "弓箭手营房";
                }
                Army army = new Army();
                army.name = name;
                army.birthPlace = birthPlace;
                army.print();
                break;
        }
    }
}
