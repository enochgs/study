package com.first.object_oriented.day04;

/**
 * 重写的演示
 *
 * @author GST
 * 关键词：重写
 */
public class Restaurant {
    void doTheCooking() {
        System.out.print("做中餐");
    }
}

class Aoo extends Restaurant {
    //1.还是想做中餐-------------不需要重写
}

class Boo extends Restaurant {
    //2.我想改做西餐------------需要重写
    void doTheCooking() {
        System.out.println("\n做西餐");
    }
}

class Coo extends Restaurant {
    //3.我想在中餐之上加上西餐---------需要重写(先super中餐，再加入西餐)
    void doTheCooking() {
        super.doTheCooking();
        System.out.println("+做西餐");
    }
}

class Tes {
    public static void main(String[] args) {
        Aoo aoo = new Aoo();
        aoo.doTheCooking();

        Boo boo = new Boo();
        boo.doTheCooking();

        Coo coo = new Coo();
        coo.doTheCooking();
        Restaurant coo2 = new Coo();    //即使使用向上造型,也会重写，跟指向对象有关
        coo2.doTheCooking();

        Restaurant restaurant = new Restaurant();
        restaurant.doTheCooking();
    }
}



