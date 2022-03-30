package cn.j12_reflect.demo_1;

import cn.j12_reflect.domain.Person;

import java.lang.reflect.Field;

public class ReflectDemo2 {
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
        /* 1. 获取(所有)成员变量
     				Field[ ]  getFields()   //获取所有public修饰的成员变量
     				Field  getField(String name)

     				Field[ ]  getDeclaredFields()   //获取所有成员变量，不考虑修饰符
     				Field[ ]  getDeclaredField(String name)
        */
        //1.Field[ ]  getFields()
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);  //运行完并未发现类，因为getFields()方法获取所有public修饰的成员变量
        }

        System.out.println("------------------");
        //Field  getField(String name)
        Field a = personClass.getField("a");
        //获取成员变量a的值
        Person p = new Person();
        Object value = a.get(p);
        System.out.println(value);
        //设置a的值
        a.set(p, "张三");
        System.out.println(p);

        System.out.println("------------------");
        //Field[ ]  getDeclaredFields();  获取所有成员变量，不考虑修饰符
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields
        ) {
            System.out.println(declaredField);
        }
        //Field[ ]  getDeclaredField(String name)
        Field d = personClass.getDeclaredField("d");
        //忽略访问权限修饰符的安全检查
        d.setAccessible(true);  //暴力反射
        Object value2 = d.get(p);
        System.out.println(value2);


    }

}
