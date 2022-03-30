package cn.j13_annotation.demo_3;

import java.lang.reflect.Method;

/**
 * 解析注解
 * 框架类
 */
@Pro(className = "cn.j13_annotation.demo_3.Demo1", methodName = "show")
public class ReflecTest {
    public static void main(String[] args) throws Exception {
        /*
        前提：不能改变该类的任何代码。可以创建任意类的对象，可以执行任意方法
         */
        //1.解析注解
        //1.1 获取该类的字节码文件对象（ReflecTest被Pro注解，Pro被@Retention(RetentionPolicy.RUNTIME)注解）
        Class<ReflecTest> reflecTestClass = ReflecTest.class;
        //1.2获取上面的注解对象
        //其实就是在内存中生成了一个该注解接口的子类实现对象
        /*
          public class ProImpl implements Pro{
          //覆写接口的方法
            public String className(){
                  return "cn.itcast.annotation.Demo1";
              };
             public String methodName(){
                  return "show";
              };
          }
        */
        Pro an = reflecTestClass.getAnnotation(Pro.class);
        //2 调用注解对象中定义的抽象方法，获取返回值
        String className = an.className();
        String methodName = an.methodName();
        System.out.println(className);
        System.out.println(methodName);
        //3.加载该（className的值Person）类进内存
        Class cls = Class.forName(className);
        //4.创建对象
        Object obj = cls.newInstance();
        //5.获取方法对象
        Method method = cls.getMethod(methodName);
        //6.执行方法
        method.invoke(obj);
    }
}
