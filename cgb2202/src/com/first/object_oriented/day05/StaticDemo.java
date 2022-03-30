package com.first.object_oriented.day05;

/**
 * Static的演示
 * @author GST
 */
public class StaticDemo {
    public static void main(String[] args) {
        Loo o1 = new Loo();
        o1.show();
        Loo o2 = new Loo();
        o2.show();
        Loo o3 = new Loo();
        o3.show();
        System.out.println(Loo.b); //常常通过类名点来访问
        Moo.test();
        Poo o4 = new Poo();
        Poo o5 = new Poo();
    }
}


/**
 *  静态变量：
 *      由static修饰
 *      属于类，存储在方法区中，只有一份
 *      常常通过类名点来访问
 *      何时用：所有对象所共享的数据(图片、音频、视频等)
 */
//演示静态变量
class  Loo{
    int a;
    static int b;
    Loo(){
        a++;
        b++;
    }
    void show(){
        System.out.println("a="+a+", b="+b);
    }

}

/**
 *  静态方法：
 *      由static修饰
 *      属于类，存储在方法区中，只有一份
 *      常常通过类名点来访问
 *      静态方法中没有隐式this传递，不能直接访问实例成员
 *      何时用：方法的操作与对象无关
 */
//演示静态方法
class Moo{
    int a;//实际变量(对象点来访问)
    static int b;//静态变量(类名点来访问)

    void show(){//有隐式this
        System.out.println(this.a);
        System.out.println(Moo.b);
    }
    static void test(){//没有隐式this
        //静态方法中没有隐式this传递
        //没有this就意味着没有对象
        //而实例变量a必须通过对象点来访问
        //所以如下代码发生编译错误
        //System.out.println(a);//编译错误
        System.out.println(Moo.b);
    }

}
//演示静态方法在何时用
class Noo{
    int a; //对象的属性a
    //在show()中用到了对象的属性a，意味着show()方法与对象有关，所以不能设计为静态方法
    void show(){
        System.out.println(a);
    }
    //在plus()中没有用到对象的属性，意味着plus()方法与对象无关，所以可以设计为静态方法
    static int plus(int num1,int num2){
        int num = num1+num2;
        return num;
    }
}

/**
 * 由static修饰
 *      属于类，在类被加载期间自动执行，一个类只被加载一次，所以静态块只执行一次
 *      何时用：加载/初始化静态资源(图片、音频、视频等)
 */
//演示静态块
class Poo{
    static{
        System.out.println("静态块:只加载一次");
    }
    Poo(){
        System.out.println("构造方法");
    }
}


