package com.first.object_oriented.day06;

/**
 * static final常量
 * 封装共有的属性和行为---------------代码复用
 * 为所有派生类提供统一的类型------向上造型
 * 可以包含抽象方法，为所有派生类提供统一的入口(能点出来)，
 * 派生类的行为不同，但入口是一致的，同时相当于定义了一个标准(强制重写)
 */
public class StaticFinalDemo {
    public static void main(String[] args) {
        System.out.println(Aoo.PI); //通过类名点来访问
//        Aoo.PI = 3.1415; //编译错误，常量不能被改变
        /*
            1.加载Boo.class到方法区中
            2.静态变量num一并存储到方法区中
            3.到方法区中获取num的值并输出
         */
        System.out.println(Boo.num);

        //编译器在编译时会将常量直接替换为具体的值，效率高
        //相当于System.out.println(5);
        System.out.println(Boo.COUNT);

    }
}
