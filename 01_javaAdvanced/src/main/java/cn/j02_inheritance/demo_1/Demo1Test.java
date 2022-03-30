package cn.j02_inheritance.demo_1;

/**
 * 测试类，测试类的继承
 *
 * @author GST
 * @ demo_1 继承
 */
public class Demo1Test {
    public static void main(String[] args) {
        //1.创建人物对象person 并输出信息
        Person person = new Person("李东");
        person.print();

        //创建英雄对象 hero并输出信息
        Hero hero = new Hero("宋江", "法师");
        hero.print();

        //创建雇佣兵对象 Army并输出信息
        Army army = new Army("花荣", "弓箭手营地");
        army.print();

    }
}
