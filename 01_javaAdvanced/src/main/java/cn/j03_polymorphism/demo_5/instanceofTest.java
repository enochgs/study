package cn.j03_polymorphism.demo_5;

import cn.j03_polymorphism.demo_1.Army;
import cn.j03_polymorphism.demo_1.Hero;
import cn.j03_polymorphism.demo_1.Person;

/**
 * 测试类  强制转换
 * 关键字：instanceof的使用
 * 在进行引用类型转换时，先通过instanceof 运算符进行类型判断，再进行相应的强制类型转换，
 * 这样可以有效地避免出现类型转换异常。
 *
 * @author GST
 * @ demo_5 instanceof 运算符
 */
public class instanceofTest {
    /**
     * 在上面demo_4示例中进行向下转型时，如果没有转换为真实子类类型，就会出现类型转换异常。如何有效避免这种异常呢？Java提供了instanceof
     * 运算符来进行类型的判断。
     * 语法：
     * 对象 instanceof 类或接口
     * 该运算符用来判断一个对象是否属于一个类或者判断是否实现了一个接口，结果为true或false。在强制转换类型之前通过instanceof运算符
     * 检查对象的真实类型，再进行相应的强制类型转换，这样就可以避免类型转换异常，从而提高代码的健壮性。
     */
    public static void main(String[] args) {
        Person person = new Hero("虚竹", "战士");
        //Person person=new Army("蓉蓉","盗贼公社");
        person.blood();

        //判断一个对象是否属于一个类或者判断是否实现了一个接口(后面讲接口)
        if (person instanceof Hero) {
            ((Hero) person).eat();
        } else if (person instanceof Army) {
            ((Army) person).eat();
        }

    }
}
