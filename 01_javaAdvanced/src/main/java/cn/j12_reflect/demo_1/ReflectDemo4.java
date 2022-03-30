package cn.j12_reflect.demo_1;

import cn.j12_reflect.domain.Person;

import java.lang.reflect.Method;

public class ReflectDemo4 {
    /**
     * *Class对象功能：*
     * 获取功能：*
     * 1. 获取(所有)成员变量
     * Field[ ]  getFields()
     * Field  getField(String name)
     * <p>
     * Field[ ]  getDeclaredFields()
     * Field[ ]  getDeclaredField(String name)
     * 2. 获取(所有)构造方法
     * Constructor<?>[ ]  getConstructors()
     * Constructor<T>[ ]  getConstructor(类<?>... parameterTypes)
     * <p>
     * Constructor<?>[ ]  getDeclaredConstructors()
     * Constructor<T>[ ]  getDeclaredConstructor(类<?>... parameterTypes)
     * 3. 获取(所有)成员方法
     * Method[ ]  getMethods()
     * Method getMethod(String name,类<?>... parameterTypes)
     * <p>
     * Method[ ]  getDeclaredMethods()
     * Method getDeclaredMethod(String name,类<?>... parameterTypes)
     * 4.获取类名
     * String getName()
     */
    public static void main(String[] args) throws Exception {
        //0.获取Person的Class对象
        Class personClass = Person.class;
     /*  3. 获取(所有)成员方法
     		Method[ ]  getMethods()
     		Method getMethod(String name,类<?>... parameterTypes)

     		Method[ ]  getDeclaredMethods()
     		Method getDeclaredMethod(String name,类<?>... parameterTypes)
     */
        //获取指定名称的方法
        Method eat_method = personClass.getMethod("eat");
        Person p = new Person();
        //执行方法
        eat_method.invoke(p);

        //获取指定名称的方法
        Method eat_method2 = personClass.getMethod("eat", String.class);
        //执行方法
        eat_method2.invoke(p, "吃米饭");
        System.out.println("----------------------------");

        //获取所有public 修饰的方法
        Method[] methods = personClass.getMethods();
        for (Method method : methods
        ) {
            System.out.println(method);
            //获取方法名称
            String name = method.getName();
            System.out.println(name);
            //method.setAccessible(true);   //暴力反射，获取私有方法
        }

        //获取类名
        String className = personClass.getName();
        System.out.println(className);  //cn.itcast.donmain.Person

    }
}
