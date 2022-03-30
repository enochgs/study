package cn.j03_polymorphism.demo_2;

import cn.j03_polymorphism.demo_1.Person;

/**
 * 龙类，子类，继承人物类
 * <p>
 * *  不用在主公类创建
 * *   public void feed(Monster monster){
 * *       monster.blood();  // 主公给龙类人物恢复生命值
 * *   }即可实现回血功能。
 * <p>
 * 使用父类作为方法形参实现多态
 *
 * @author GST
 * @ demo_2 多态：子类到父类的转换(向上转型)
 */
public class Monster extends Person {
    private int attack;  // 生命值

    /**
     * 有参构造方法
     *
     * @param name 昵称
     */
    public Monster(String name, int attack) {
        super(name);
        this.attack = attack;
    }

    @Override
    public void blood() {
        this.attack += 8;
        System.out.println(super.name + "生命值增加到" + this.attack);
    }
}
