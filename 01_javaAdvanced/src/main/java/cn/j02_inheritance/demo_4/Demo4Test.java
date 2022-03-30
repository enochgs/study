package cn.j02_inheritance.demo_4;

/**
 * 测试类
 *
 * @author GST
 * @ demo_4 抽象类
 */
public class Demo4Test {
    public static void main(String[] args) {
        //Person person = new Person("无名");  // 错误信息：抽象类不能被实例化
        //person.print();
        new Hero("吕布", "骑士").print();
    }
}
