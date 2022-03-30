package cn.j13_annotation.demo_2;

/**
 * 自定义注解
 * 属性：接口中的抽象方法
 *
 * @author GST
 */
@MyAnno(age = 12, per = Person.P1, anno2 = @MyAnno2, strs = {"aaa", "bbb"})
@MyAnno3
public class Worker {
    /*
    @MyAnno3    //@MyAnno3注解的注解@Target的value值只有ElementType.TYPE，则不能加在方法上
          2，会报错
    public void show(){
    }*/
    @MyAnno3
    public void show() {
    }

    @MyAnno3
    public String name = "aaa";
}
