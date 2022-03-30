package cn.j03_polymorphism.demo_2;

import cn.j03_polymorphism.demo_1.Person;

/**
 * 测试类
 * 验证 多态实现回血功能
 * 使用父类作为方法形参实现多态
 *
 * @author GST
 * @ demo_2 多态：子类到父类的转换(向上转型)
 */
public class MonsterTest {
    public static void main(String[] args) {
        Master master = new Master("小明", 100);
        Person person = new Monster("红龙", 900);
        master.feed(person);
        /**
         * 从以上结果可以看出，使用父类作为方法形参优势明显，或者说使用多态的优势明显: 可以减少代码量，
         * 提高代码的可扩展性和可维护性。即使增加怪物类其他类也无需添加或修改feed()方法
         */

    }
}
