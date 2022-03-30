package cn.j02_inheritance.demo_1;

/**
 * 雇佣兵类,人物类的子类
 * 关键字：extends 、super
 *
 * @author GST
 * @ demo_1 继承
 */
public class Army extends Person {
    private String birth;   //建造单位（出生地）

    /**
     * 有参构造方法
     *
     * @param name  名字
     * @param birth 出生地
     */
    public Army(String name, String birth) {
        super(name);
        this.birth = birth;
    }

    public String getBirth() {
        return birth;
    }
}
