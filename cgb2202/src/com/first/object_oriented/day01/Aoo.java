package com.first.object_oriented.day01;

/**
 * 重载的演示
 *
 * @author GST
 *
 * 关键词：实体类，对象，重载
 */
public class Aoo {
    /*
     重载只与参数列表类型和顺序有关
     */
    void show() {
    }

    void show(String name) {
    }

    void show(int age) {
    }

    void show(String name, int age) {
    }

    void show(int age, String name) {
    }
    //int show(){return 1;}   //编译错误，重载与返回值类型无关
    //void show(String address){} //编译错误，重载与参数名称无关
}
