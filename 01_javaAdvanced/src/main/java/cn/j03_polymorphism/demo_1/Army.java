package cn.j03_polymorphism.demo_1;

/**
 * 雇佣兵类，继承Person类
 *
 * @author GST
 * @ demo_1 未使用多态优化
 */
public class Army extends Person {
    private String birth;

    /**
     * 有参构造方法
     *
     * @param name 昵称
     */
    public Army(String name, String birth) {
        super(name);
        this.birth = birth;
    }

    //重写父类抽象方法blood()，实现英雄恢复体力的功能
    @Override
    public void blood() {
        super.health = super.health + 5;
        System.out.print("雇佣兵：");
        super.print();
    }

    //重写父类print方法
    public void print() {
        super.print();
        System.out.println("出生地：" + this.birth + "。");
    }

    //子类特有的方法eat()
    public void eat() {
        System.out.println("子类Army的特有方法。");
    }

    //子类特有的方法patrol()
    public void patrol() {
        System.out.println("雇佣兵" + super.name + "正在巡逻");
    }
}
