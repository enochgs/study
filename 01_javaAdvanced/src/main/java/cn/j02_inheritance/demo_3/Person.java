package cn.j02_inheritance.demo_3;

/**
 * Student的父类
 * 人物类
 * <p>
 * 继承条件下构造方法的调用规则
 *
 * @author GST
 * @ demo_3 多级继承
 */
public class Person {
    private String name;  // 人名
    private int age;  // 年龄

    /**
     * 无参构造方法
     */
    public Person() {
        System.out.println("执行了无参构造方法：Person()");
    }

    /**
     * 有参构造方法
     *
     * @param age 年龄
     */
    public Person(int age) {
        this.age = age;
        System.out.println("执行了有参构造方法：Person(int age)");
    }

    /**
     * 有参构造方法
     *
     * @param name 姓名
     */
    public Person(String name) {
        this.name = name;
        System.out.println("执行了有参构造方法：Person(int name)");
    }

    /**
     * 有参构造方法
     *
     * @param name 姓名
     * @param age  年龄
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("执行了有参构造方法：Person(int name, int age)");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
