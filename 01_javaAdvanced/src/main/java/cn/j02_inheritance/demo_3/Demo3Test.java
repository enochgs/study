package cn.j02_inheritance.demo_3;

/**
 * 测试类
 * 测试 多级继承 构造方法的调用关系
 * <p>
 * 继承条件下构造方法的调用规则
 *
 * @author GST
 * @ demo_3 多级继承
 */
public class Demo3Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        System.out.println("------------------------------------");
        teacher = new Teacher("张三", "浙江大学", "英语老师");
    }
}
