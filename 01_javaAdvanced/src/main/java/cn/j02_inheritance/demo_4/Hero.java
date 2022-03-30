package cn.j02_inheritance.demo_4;

/**
 * 子类,英雄类，继承人物类
 *
 * @author GST
 * @ demo_4 抽象类
 */
public class Hero extends Person {
    private String occupation;   //职业

    /**
     * 有参构造方法
     *
     * @param name       昵称
     * @param occupation 职业
     */
    public Hero(String name, String occupation) {
        super(name);  // 此处不能使用this.name = name;
        this.occupation = occupation;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    /**
     * 重写抽象方法
     */
    @Override
    public void print() {
        System.out.println("我叫" + this.getName() + "职业是：" + this.occupation);

    }
}
