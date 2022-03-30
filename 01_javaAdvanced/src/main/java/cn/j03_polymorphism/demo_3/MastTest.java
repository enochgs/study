package cn.j03_polymorphism.demo_3;

import cn.j03_polymorphism.demo_1.Person;

import java.util.Scanner;

/**
 * 测试类
 * 使用父类作为方法返回值实现多态
 *
 * @author GST
 * @ demo_3 多态：子类到父类的转换(向上转型)
 */

public class MastTest {
    public static void main(String[] args) {
        Master master = new Master("小明", 100);
        Scanner input = new Scanner(System.in);
        System.out.println("欢迎·来到游戏王权");
        System.out.println("请选择要增加生命值的人物：(1、英雄   2、雇佣兵)");
        int typeId = input.nextInt();
        Person person = master.getPerson(typeId);
        if (person != null) {
            System.out.println("购买成功");
            master.feed(person);
        } else {
            System.out.println("对不起，没有此类人物，购买无效");
        }

        /**
         * 小结：通过以上示例对多态功能的详解，总结出实现多态的3个条件。
         * (1) 继承的存在（继承是多态的基础，没有继承就没有多态）。
         * (2) 子类重写父类的方法（多态下调用子类重写后的方法）。
         * (3) 父类引用变量指向子类对象（子类到父类的类型转换）。
         */

    }
}
