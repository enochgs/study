package cn.j13_annotation.demo_3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 * 描述需要执行的类名，和方法名
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME) //运行时阶段，即被Pro注解的类被加载到虚拟机，即它的字节码文件加载到虚拟机
public @interface Pro {
    String className();

    String methodName();
    /* ReflecTest 代码
                   //1.2获取上面的注解对象
                   //其实就是在内存中生成了一个该注解接口的子类实现对象
                   Pro an=reflecTestClass.getAnnotation(Pro.class);
        的解释：相当于下面代码
        public class ProImpl implements Pro{
            public String className(){
             return "cn.itcast.annotation.Demo1";
             };
            public String methodName(){
             return "show";
             };
        }


     */
}
