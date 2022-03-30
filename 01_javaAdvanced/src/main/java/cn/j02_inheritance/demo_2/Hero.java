package cn.j02_inheritance.demo_2;

import cn.j02_inheritance.demo_1.Person;

/**
 * 英雄类,人物类的子类
 * 关键字：extends 、super
 *
 * @author GST
 * @ demo_2 继承 & 重写
 */
public class Hero extends Person {
    private String name;   //昵称
    private String occupation;   //职业

    /**
     * 有参构造方法
     *
     * @param name       昵称
     * @param occupation 职业
     */
    public Hero(String name, String occupation) {
        //super(name);    //调用父类的构造方法为昵称赋值
        this.name = name;
        this.occupation = occupation;
        super.setHealth(88);

    }

    public String getOccupation() {
        return occupation;
    }

    /**
     * 重写父类的 print() 的方法
     */
    public void print() {
        System.out.print("英雄的自白：\n 我叫" + this.name + "，生命值:" + this.getHealth());
        System.out.println("，职业是：" + this.occupation);
    }
}
