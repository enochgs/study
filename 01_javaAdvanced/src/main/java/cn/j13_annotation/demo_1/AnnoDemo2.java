package cn.j13_annotation.demo_1;

import java.util.Date;

/**
 * JDK中预定义的三个主要注解
 *
 * @author GST
 * @Override ：检测被该注解标注的方法是否是继承自父类(接口)
 * @Deprecated ：该注解标注的内容，表示已过时
 * @SuppressWarnings ：压制警告
 */
@SuppressWarnings("all") //压制警告
public class AnnoDemo2 {
    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public void show1() {
        //有缺陷，不推荐使用，写了新方法来弥补缺陷，但不要删除
    }

    public void show2() {
        //替代show1方法
    }

    public void demo() {
        show1();    //横线表示该方法已过时，可使用但不推荐使用。
        Date date = new Date();


    }
}
