package com.first.object_oriented.day03;

/**
 * 引用类型数组的演示
 *
 * @author GST
 *
 * 超类，子类，继承，引用类型数组
 */
public class RefArrayDemo {
    public static void main(String[] args) {
        Student[] stus = new Student[3];    //创建Student数组对象
        stus[0] = new Student("zhangsan", 25, "HZ");
        stus[1] = new Student("lisi", 24, "ZJ");
        stus[2] = new Student("wangwu", 26, "JMS");
        System.out.println(stus[0].name);   //输出第1个学生的名字
        stus[1].age = 28;    //修改第2个学生的年龄为28
        stus[2].sayHi();    //第3个学生跟大家问好
        System.out.println("--------------------------------------");
        for (int i = 0; i < stus.length; i++) {
            System.out.println(stus[i].name);    //输出每个学生的名字
            stus[i].sayHi();    //每个学生跟大家问好
        }


    }
}

