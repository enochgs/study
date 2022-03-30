package cn.j01_abstract.demo_1;

/**
 * 英雄类
 * this关键字：通常指当前对象的引用，即调用当前对象的成员。
 * 例如：this.name;	 //调用当前对象的属性
 * this.print();  //调用当前对象的方法
 * 英雄类型：骑士、法师
 * 主题：创建类
 *
 * @author GST
 * @ demo_1 创建类和对象
 */
public class Hero {
    public String name = "萧大侠";  //昵称，默认值是“萧大侠”
    public String sex = "男";  //性别，默认值是“男”
    public String birthplace;  //出生地
    public String occupation = "骑士";  //职业，默认值是“骑士”
    public int health = 100;  //生命值，默认值是100
    public int loyalty = 0;  //忠诚度，默认值是0

    /**
     * 输出英雄的信息
     */
    public void print() {    //方法
        System.out.println("英雄的信息：\n 我叫" + this.name + ",职业是" + this.occupation +
                ",性别" + this.sex + ",生命值" + this.health);
    }

}
