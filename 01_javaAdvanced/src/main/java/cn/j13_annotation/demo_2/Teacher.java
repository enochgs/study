package cn.j13_annotation.demo_2;

/**
 * 自定义注解
 * 元注解：用于描述注解的注解
 *
 * @author GST
 * @Inherited：描述注解是否被子类继承
 */
public class Teacher extends Worker {
    /**
     * 自动继承了父类Worker的 @MyAnno3注解，因@MyAnno3注解被元注解Inherited注解
     */
}
