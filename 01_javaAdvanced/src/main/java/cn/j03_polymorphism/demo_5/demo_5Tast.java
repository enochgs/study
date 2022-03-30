package cn.j03_polymorphism.demo_5;

import cn.j03_polymorphism.demo_1.Person;

import java.util.Scanner;

public class demo_5Tast {
    public static void main(String[] args) {
        Master master = new Master("小明", 2100);
        Scanner input = new Scanner(System.in);
        System.out.println("欢迎来到游戏王权！");
        System.out.println("请选择你要购买的人物类型：（1、英雄  2、雇佣兵）");
        int typeId = input.nextInt();
        Person person = master.getPerson(typeId);   //通过输入数字，让Master判断选择创建person对象
        if (person != null) {
            System.out.println("购买成功！");
            master.feed(person);
            master.work(person);
        } else {
            System.out.println("对不起，没有购买成功，购买失败");
        }
    }
}
