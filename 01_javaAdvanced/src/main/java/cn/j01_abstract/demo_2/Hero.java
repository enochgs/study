package cn.j01_abstract.demo_2;

/**
 * 英雄类
 * Java可以通过无参或带参数的构造方法(Congstructor)完成初始化工作。
 * 主题：无参构造方法，有参构造方法，重载
 *
 * @author GST
 * @ demo_2 构造方法及其重载
 */
public class Hero {
    public String name = "无名";  //昵称
    public int health = 100;  //生命值
    public int loyalty = 0;  //忠诚度
    public String sex = "男";  //性别

    /**
     * 添加无参构造方法，在创建对象的时候就完成赋值操作
     */
    public Hero() {
        name = "蓉蓉";
        loyalty = 20;
        sex = "女";
        System.out.println("无参构造方法执行了！");
    }

    /**
     *  虽然通过无参构造方法可以赋值，但是属性值已经在构造方法中固定了，我们可以
     *  以重载的方式可添加多个有参构造方法，在创建对象时完成动态属性赋值
     */

    /**
     * 两个参数的构造方法
     *
     * @param name
     * @param sex
     */
    public Hero(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    /**
     * 四个参数的构造方法
     *
     * @param name
     * @param health
     * @param loyalty
     * @param sex
     */
    public Hero(String name, int health, int loyalty, String sex) {
        this.name = name;
        this.health = health;
        this.loyalty = loyalty;
        this.sex = sex;
    }

    /**
     * 输出英雄信息
     */
    public void print() {    //方法
        System.out.println("英雄的信息：\n 我叫" + this.name + "，生命值：" + this.health + "，忠诚度：" + this.loyalty +
                "，性别：" + this.sex);
    }
}
