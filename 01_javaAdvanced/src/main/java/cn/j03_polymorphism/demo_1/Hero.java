package cn.j03_polymorphism.demo_1;

/**
 * 英雄类，继承Person类
 *
 * @author GST
 * @ demo_1 未使用多态优化
 */
public class Hero extends Person {
    private String occupation;   //职业

    /**
     * 有参构造方法
     *
     * @param name 昵称
     */
    public Hero(String name, String occupation) {
        super(name);
        this.occupation = occupation;
    }

    //重写父类blood()，实现英雄恢复体力的功能
    @Override
    public void blood() {
        super.health = super.health + 3;
        System.out.print("英雄：");
        super.print();
    }

    //重写父类print方法
    public void print() {
        super.print();
        System.out.println("职业:" + this.occupation + "。");
    }

    //子类特有的方法eat()
    public void eat() {
        System.out.println("子类Hero的特有方法。");
    }

    //子类特有的方法affairs()
    public void affairs() {
        System.out.println("英雄" + super.name + "正在内政");
    }


}
