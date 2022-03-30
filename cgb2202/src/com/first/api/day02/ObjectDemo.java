package com.first.api.day02;

/**
 * Object:对象/东西
 *  -是所有类的鼻祖，所有类都直接或间接继承了Object，万物皆对象，为了多态
 *  -里面有几个经常被派生类重写的方法：toString() 和equals()
 *      -调用toString()时默认返回：类的全程@地址，没有参考意义，所以常常重写toString()返回具体数据
 *      -调用equals()时默认比较的还是==(即比较地址)，没有参考意义，所以常常重写equals()来比较具体的属性值
 *      -派生类重写equals()的基本规则：
 *      1)两个对象必须是同一个类型，若类型不同则返回false
 *      2)若参数对象为null，则返回false
 *      3)原则上两个对象要比较对象的属性是否相同
 */
public class ObjectDemo {
    public static void main(String[] args) {
        Point p1= new Point(1, 2);
        Point p2= new Point(1, 2);
        //输出引用对象时(p)默认调用Object中的toString()，返回的地址
        /**
         * Point类若不重写object类中的toString()方法，则使用Object中定义的toString()方法
         * 方法的返回字符串格式为：类的全称@地址
         * 但通常这个返回结果对我们的开发没有帮助，因此需要重写toString()方法
         */
        System.out.println(p1);  //输出地址数据,没有意义
        System.out.println(p1.getX()+" " + p1.getY());

        System.out.println(p1 == p2);   //false, ==比较地址

        /**
         * Object 中的equals() 内部还是使用==来比较
         * 因此派生类在使用时若想比较内容，常常需要重写equals()方法
         * 若派生类中重写了equals()，则调用重写之后的eq方法，比较的是变量值
         */
        System.out.println(p1.equals(p2));  //不重写：fals，自定义的类重写toString：true
        //说明：java的类都重写equals()了，如String、StringBuilder默认重写，比较内容
        //我们自定义的类必须自己重写equals()
    }
}

