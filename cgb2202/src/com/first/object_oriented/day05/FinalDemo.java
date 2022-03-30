package com.first.object_oriented.day05;

/**
 * final的演示
 */
public class FinalDemo {
}

/** final的演示
 * final：最终的、不可改变的------------单独应用几率极低
 * 修饰变量：变量不能被改变
 * 修饰方法：方法不能被重写
 * 修饰类：类不能被继承
 */
//演示final修饰变量
class Eoo {
    final int a =5;
    void test(){
        //a = 55; //编译错误，final的变量不能被改变
    }
}

//演示final修饰方法
class Foo{
    final void show(){
    }
}
class Goo extends Foo{
    //void show(){}   //编译错误，final的方法不能被重写
}

//演示final修饰类
final class Hoo{}
//class Ioo extends Hoo{} //编译错误，final的类不能被继承
class Joo{}
final class Koo extends Joo{} //正确，不能当老爸，但能当儿子