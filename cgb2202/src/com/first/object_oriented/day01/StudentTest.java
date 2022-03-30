package com.first.object_oriented.day01;

/**
 * 创建实体对象
 *
 * @author GST
 *
 * 关键词：实体类，对象，重载
 */
public class StudentTest {
    public static void main(String[] args) {
        //创建一个学生对象
        Student zs = new Student();
        //给成员变量赋值
        zs.name = "张三";    //名称赋值
        zs.age = 18;   //年龄
        zs.address = "杭州"; //地址
        //调用方法
        zs.study();    //调用学生类的study方法
        zs.sayHi();    //调用学生类的sayHi方法

        Student ls = new Student();
        ls.name = "李四";    //名称赋值
        ls.age = 18;   //年龄
        ls.address = "杭州"; //地址
        ls.study();    //调用学生类的study方法
        ls.sayHi();    //调用学生类的sayHi方法

        //1)创建一个学生对象
        //2)给成员变量赋默认值(引用类型为null，基本类型为0)
        Student ww = new Student();
        ww.study();
        ww.sayHi();
    }
}
