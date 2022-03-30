package cn.j02_inheritance.demo_5;

/**
 * 测试类 修饰引用变量的常见错误
 * 关键字：final
 *
 * @author GST
 * @ demo_5 final修饰符
 */
public class HeroTest {
    public static void main(String[] args) {
        final Hero hero = new Hero("李云龙");
        hero.name = "诸葛亮";
        //hero =  new Hero("孙权");  // 错误：对于引用型变量，被final修饰后，变量不可以再指向其他对象
        /**
         * 对于引用型变量,要区分对象的引用值，和对象的属性值是两个概念。
         *结论：
         *  使用final修饰引用型变量，变量值是固定不变的，变量值所指向的对象的属性值是可变的。
         */
    }
    /** abstract 是否可以和 private、static、final连用？
     *  (1) private abstract void boold();
     *  错误: 抽象方法是让子类重写的,而子类无法继承private修饰的方法,自然无法重写
     *
     *  (2) abstract final void boold();
     *  错误: 抽象方法是让子类重写的,而final修饰的方法,不能被重写,相互矛盾。
     *       同理,抽象类要让子类继承才能实例化,而final修饰的类不允许被子类继承。
     *
     *  (3) static abstract void boold();
     *  错误：抽象方法只有声明没有实现,而static方法通过类名直接访问,但无法访问一个没有实现的方法。
     *
     *  (4) public abstract void boold();
     *  正确，public 和 abstract 不冲突
     */

}
