package cn.j13_annotation.demo_2;

import java.lang.annotation.*;

/**
 * 自定义注解
 * 元注解：用于描述注解的注解
 *
 * @Target：描述注解能够作用的位置
 * @Retention：描述注解被保留的阶段
 * @Documented：描述注解是否被抽取到api文档中
 * @Inherited：描述注解是否被子类继承
 */
@Target(value = {ElementType.TYPE, ElementType.METHOD, ElementType.FIELD}) //表示该MyAnno3注解只能作用在类上,方法上，成员变量上
@Retention(RetentionPolicy.RUNTIME)     //自定义注解一般使用RUNTIME这个值
@Documented     //MyAnno3这个注解描述的信息会被抽取到Doc文档中
@Inherited
public @interface MyAnno3 {
}
