package cn.j02_inheritance.demo_3;

/**
 * 子类 继承Student类
 * 老师类
 * <p>
 * 继承条件下构造方法的调用规则
 *
 * @author GST
 * @ demo_3 多级继承
 */
public class Teacher extends Student {
    private String type;  //老师类别 (英文，高数)

    public Teacher(String name, String universityName, String type) {
        super(name, universityName);
        this.type = type;
        System.out.println("执行了有参构造方法：Teacher(String name, String universityName, String type)");
    }

    public Teacher() {
        System.out.println("执行了无参构造方法：Teacher()");
    }
}
