package cn.j01_abstract.demo_3;

/**
 * 英雄类
 * 就是将类的状态信息隐藏在类的内部，不允许外部程序直接访问，而通过该类提供的方法来实现对
 * 隐藏内部信息的操作和访问
 * 主题：封装，重载
 *
 * @author GST
 * @ demo_2 封装类
 */
public class Hero {
    private String name = "无名";   //昵称
    private int health = 100;   //生命值
    private int loyalth = 0;   //忠诚度
    private String occupation = "法师";   //职业

    public Hero() {
    }

    /**
     * 通过构造方法指定英雄的昵称、职业
     *
     * @param name       昵称
     * @param occupation 职业
     */
    public Hero(String name, String occupation) {
        this.name = name;
        this.occupation = occupation;
    }

    /**
     * 通过吃药增加英雄的生命值
     */
    public void blood() {
        if (health >= 100) {
            System.out.println("英雄生命值已满，可以工作");
        } else {
            health = health + 3;
            System.out.println("英雄生命值增加");
        }
    }

    /**
     * 通过工作增加与主公的忠诚度，减少生命值
     */
    public void work() {
        if (health < 50) {
            System.out.println("英雄生病了！不能工作");
        } else {
            System.out.println("英雄正在为主公工作。");
            health = health - 10;
            loyalth = loyalth + 5;
        }
    }

    /**
     * 封装的步骤：对属性可见性进行限制，为每个属性创建赋值的setter方法和取值的getter方法，
     * 用于对这些属性的存取；同时在赋值方法中，加入对属性的存取控制语句。
     *
     * 封装的好处：隐藏类内部的实现细节，让使用者只能通过程序规定的方法来访问数据；可以方便的
     * 加入存取控制语句，增加安全性和了扩展性，限制不合理操作。
     */

    /**
     * 读取英雄昵称
     *
     * @return 昵称
     */
    public String getName() {
        return name;
    }

    /**
     * 指定英雄昵称
     *
     * @param name 昵称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 读取英雄生命值
     *
     * @return 生命值
     */
    public int getHealth() {
        return health;
    }

    /**
     * 指定英雄生命值 对生命值范围进行判断
     *
     * @param health 生命值
     */
    public void setHealth(int health) {
        if (health > 100 || health < 0) {
            this.health = 50;
            System.out.println("生命值应该在0~100之间，默认值50");
        } else {
            this.health = health;
        }

    }

    /**
     * 读取英雄忠诚度
     *
     * @return 忠诚度
     */
    public int getLoyalth() {
        return loyalth;
    }

    /**
     * 指定英雄忠诚度
     *
     * @param loyalth 忠诚度
     */
    public void setLoyalth(int loyalth) {
        this.loyalth = loyalth;
    }

    /**
     * 读取英雄职业
     *
     * @return 职业
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * 指定英雄职业
     *
     * @param occupation 职业
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    /**
     * 输出英雄的信息
     */
    public void print() {
        System.out.println("英雄的自白：\n 我叫" + this.name + "，生命值:" + this.health + "，忠诚度:" +
                this.loyalth + "，我的职业：" + this.occupation);
    }
}
