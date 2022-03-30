package cn.j13_annotation.demo_2;

/**
 * 自定义注解
 * 属性：接口中的抽象方法
 *
 * @author GST
 */
public @interface MyAnno {
    //以下默认省略：public abstract
/*    //viod show();  //注解中不允许出现
    int value();    //当注解只有一个且名为value(),使用注解时直接赋值 @MyAnno(12)
    Person per();  //枚举类型
    MyAnno2 anno2(); //注解类型
    String[] strs(); //字符串数组类型 使用：@MyAnno( strs = {"aaa", "bbb"})，数组只有一个值{}可省略@MyAnno(strs = "aaa")
    //Worker w();类注解报错，除了规定的返回值类型，其他都不行
    */
    int age();

    String name() default "张三";

    Person per();

    MyAnno2 anno2();

    String[] strs();


}
