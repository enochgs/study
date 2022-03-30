package cn.j12_reflect.demo_1;

import cn.j12_reflect.domain.Person;

import java.lang.reflect.Constructor;

public class ReflectDemo3 {
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
   /* 获取(所有)构造方法
			Constructor<?>[ ]  getConstructors()
			Constructor<T>[ ]  getConstructor(类<?>... parameterTypes)

			Constructor<?>[ ]  getDeclaredConstructors()
			Constructor<T>[ ]  getDeclaredConstructor(类<?>... parameterType
        */
        //Constructor<T>[ ]  getConstructor(类<?>... parameterTypes)获取构造器
        Constructor constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        //创建对象，用构造器创建
        Object person = constructor.newInstance("张三", 23);
        System.out.println(person);

        System.out.println(".......");

        //传空参
        Constructor constructor1 = personClass.getConstructor();
        System.out.println(constructor1);
        //创建对象
        Object person1 = constructor1.newInstance();
        System.out.println(person1);

        Object o = personClass.newInstance();
        System.out.println(o);

    }

}
