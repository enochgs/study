package com.first.object_oriented.day09;

public class Test {
    public static void main(String[] args) {
        Aoo o = new Boo();  //向上造型 大到小
        //Boo o1 = o; //编译期错误，还未把Boo对象加载进内存
        Boo o1 = (Boo) o; //引用o指向的对象就是Boo，符合条件1
        Inter o2 = (Inter) o;   //引用o指向的对象是Boo类型，不是inter类型，但指向的对象Boo实现了Inter接口，所以可以强转
        //Coo o3 = (Coo) o;   //引用o指向的对象是Boo类型，不是Coo类型，而Coo不是Boo继承的类，也不是Boo实现的接口。 运行时发生ClassCastException类型转换异常
        if (o instanceof Coo){  //false
            Coo o4 = (Coo) o;
        }else {
            System.out.println("o不是Coo类型");
        }

        /**
         * 引用所指向的对象，就是该类型
         * 引用所指向的对象，实现了该接口或继承了该类
         *强转时若不符合如上条件，则发生类型转换异常，建议在强转之前先通过instanceof判断引用的对象是否是该类型
         */
    }
}
