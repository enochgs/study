package com.first.object_oriented.day04;

/**
 * 引用类型数组向上造型的演示
 *
 * @author GST
 * 优化：对昨天Person的子类，单独放在各自的引用类型数组下的进一步集合
 */
public class Test {
    public static void main(String[] args) {
        Person[] ps = new Person[8];
        ps[0] = new Student("张三", 20, "北京", "0001");
        ps[1] = new Student("李四", 22, "上海", "0002");
        ps[2] = new Student("王五", 21, "北京", "0003");
        ps[3] = new Teacher("赵六", 20, "北京", 5000);
        ps[4] = new Teacher("孙七", 22, "上海", 4600);
        ps[5] = new Teacher("周八", 21, "北京", 4800);
        ps[6] = new Doctor("吴九", 20, "北京", "特级");
        ps[7] = new Doctor("郑十", 22, "上海", "高级");
        for (int i = 0; i < ps.length; i++) {
            System.out.println(ps[i].name);
            ps[i].sayHi();
        }
    }
}
