package cn.j02_inheritance.demo_1;

/**
 * 英雄类,人物类的子类
 * 关键字：extends 、super
 *
 * @author GST
 * @ demo_1 继承
 */
public class Hero extends Person {
    private String occupation;  // 职业

    /**
     * 有参构造方法
     *
     * @param name       昵称
     * @param occupation 职业
     */
    public Hero(String name, String occupation) {
        super(name);  // 此处不能使用this.name = name;
        this.occupation = occupation;
        // super(name) 表示调用父类的有参构造方法，还可以使用super关键字调用父类方法：super.print()
    }

    public String getOccupation() {
        return occupation;
    }
}
