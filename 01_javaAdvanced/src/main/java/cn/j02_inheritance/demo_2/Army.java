package cn.j02_inheritance.demo_2;

import cn.j02_inheritance.demo_1.Person;

/**
 * 雇佣兵类,人物类的子类
 * 关键字：extends 、super
 *
 * @author GST
 * @ demo_2 继承 & 重写
 */
public class Army extends Person {
    private String birth;  // 出生地

    public Army(String name) {
        super(name);
    }

    /**
     * 构造方法
     *
     * @param name  雇佣兵名字
     * @param birth 出生地
     */
    public Army(String name, String birth) {
        super(name); //调用父类参数为name的构造方法为昵称赋值。不写会隐式调用super();即调用父类无参构造方法
        //this("张三");  //本类的其他构造方法(无参构造方法)
        this.birth = birth;
        super.setHealth(99);
        /**
         * 无super(name)或者无this("张三")的结果是：
         *  执行人物的无参构造方法
         *  我叫无名，生命值:99，出生地是：弓箭手营房
         *
         *  含super(name)的结果是：
         *  我叫关羽，生命值:99，出生地是：弓箭手营房
         *
         *  或者含this("张三")的结果是：
         *  我叫张三，生命值:99，出生地是：弓箭手营房
         *
         *  (super 或者 this ：调用父类或者本类其他构造方法)
         *
         *  继承条件下构造方法调用规则如下：
         *  (1) 如果子类的构造方法没有super显式调用父类的有参构造方法，也没有通过this显式调用自身其他构造方法，
         *      则系统会默认先调用父类无参构造方法，这种情况下有没有super() 效果都是一样的。
         *  (2) 如果子类的构造方法通过super显式调用父类的有参构造方法，则将执行父类的有参构造方法，而不再执行父类
         *      的无参构造方法。
         *  (3) 如果子类的构造方法通过this显式调用自身的其他参构造方法时，则在相应的构造方法中应用上面两条规则。
         *  (4) 特别注意的是，如果存在多级继承关系，则在创建一个子类对象时，以上规则会多次向更高一级父类应用，
         *      一直到执行顶级父类Object类的无参构造方法为止。
         *   参考 示例 demo_3
         */
    }

    /**
     * 重写父类的 print() 的方法
     */
    public void print() {
        System.out.print("英雄的自白：\n 我叫" + this.getName() + "，生命值:" + this.getHealth());
        System.out.println("，出生地是：" + this.birth);
    }
}
