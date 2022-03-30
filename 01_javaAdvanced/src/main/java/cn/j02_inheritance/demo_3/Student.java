package cn.j02_inheritance.demo_3;

/**
 * 子类 继承Person类
 * 学生类
 * Student的父类
 * <p>
 * 继承条件下构造方法的调用规则
 *
 * @author GST
 * @ demo_3 多级继承
 */
public class Student extends Person {
    private String universityName;  // 学校名称
    private String address = "杭州市";  // 地址
    private String name;

    public Student(String name) {
        super(name);
        //this.name = name;
        System.out.println("执行了有参构造方法：Student(String name)");
        /**
         * 1、在构造方法中，如果有this语句或者super语句出现，只能是第一条语句。
         * 2、在一个构造方法中，不允许同时使用this和super语句调用构造方法(不能有两条第一条语句)。
         * 3、在类方法中不允许出现 this或者super 关键字。
         * 4、在实例方法中this和super语句不要求是第一条语句，可以共存。
         */
    }

    public Student(String name, String universityName) {
        //super(name);
        //this();
        this(name);
        this.universityName = universityName;
        System.out.println("执行了有参构造方法：Student(String name, String universityName)");
    }

    public Student() {
        System.out.println("执行了无参构造方法：Student()");
    }
}
