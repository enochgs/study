package com.first.object_oriented.day05;

/**
 * 访问控制修饰符：--------------------------保证数据的安全
 * - 类的访问权限只能是public或默认的
 * - 类中成员的访问权限如上4种都可以
 * - 访问权限由高到低依次为：public>protected>默认的>private
 * @author GST
 */
public class Aoo {
    public int a;   //任何类
    protected int b;    //本类、派生类、同包类
    int c;  //本类、同包类
    private int d;  //本类
    void show(){
        a = 1;
        b = 2;
        c = 3;
        d = 4;
    }
}
class Boo{
    void show(){
        Aoo o = new Aoo();
        o.a = 1;
        o.b = 2;
        o.c = 3;
        //o.d = 4;  //编译错误
    }
}
