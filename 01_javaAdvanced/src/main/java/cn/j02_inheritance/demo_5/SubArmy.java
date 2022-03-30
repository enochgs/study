package cn.j02_inheritance.demo_5;

/**
 * SubArmy类，继承雇佣兵类
 * 关键字：final
 *
 * @author GST
 * @ demo_5 final修饰符
 */
public class SubArmy extends Army {
    @Override
    public void print2() {
        //super.print2();
        System.out.println("子类重写父类的方法");
    }
/**  // 报错，print()不能被子类重写。
 public void print() {
 //super.print2();
 System.out.println("子类重写父类的方法");
 }
 */
}
