package com.first.object_oriented.day03.workday04;

/**
 * 引用类型数组和继承的演示
 *
 * @author GST
 */
public class Test {
    public static void main(String[] args) {
        Student student =new Student();
        Student[] stus = new Student[3];
        stus[0] = new Student("张三", 20, "北京", "0001");
        stus[1] = new Student("李四", 22, "上海", "0002");
        stus[2] = new Student("王五", 21, "北京", "0003");
        for (int i = 0; i < stus.length; i++) {
            System.out.println(stus[i].name);
            stus[i].sayHi();
        }
        System.out.println("------------------------------------------------");
        Teacher[] teas = new Teacher[3];
        teas[0] = new Teacher("赵六", 20, "北京", 5000);
        teas[1] = new Teacher("孙七", 22, "上海", 4600);
        teas[2] = new Teacher("周八", 21, "北京", 4800);
        for (int i = 0; i < teas.length; i++) {
            System.out.println(teas[i].name);
            teas[i].sayHi();
        }
        System.out.println("------------------------------------------------");
        Doctor[] docs = new Doctor[2];
        docs[0] = new Doctor("吴九", 20, "北京", "特级");
        docs[1] = new Doctor("郑十", 22, "上海", "高级");

        for (int i = 0; i < docs.length; i++) {
            System.out.println(docs[i].name);
            docs[i].sayHi();
        }
    }
}
