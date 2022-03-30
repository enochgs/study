package cn.j01_abstract.demo_1;

/**
 * 雇佣兵类
 * this关键字：通常指当前对象的引用，即调用当前对象的成员。
 * 例如：this.name;	 //调用当前对象的属性
 * this.print();  //调用当前对象的方法
 * 雇佣兵出生地：盗贼公社、弓箭手营房
 * 主题：创建类
 *
 * @author GST
 * @ demo_1 创建类和对象
 */
public class Army {
    public String name = "蓉蓉";  //昵称
    public int health = 98;  //生命值
    public String birthPlace;  //出生地

    /**
     * 输出雇佣兵的信息
     */
    public void print() {    //方法
        System.out.println("雇佣兵的介绍：\n 我叫" + this.name + ",生命值" + this.health +
                ",出生地" + this.birthPlace);
    }
}
