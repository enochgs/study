package cn.j12_reflect.demo_1;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 框架类
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //可以创建任意类的对象，可以执行任意方法
        /*
        前提，不能改变该类的任何代码。可以创建任意类的对象，可以执行任意方法
         */
        /*Person person = new Person();
        person.eat();*/
        /*Student student = new Student();
        student.sleep();*/

        //1.加载配置文件,Properties会将以properties的配置文件用load()方法加载到内存,形成集合
        //1.1 创建Properties对象
        Properties pro = new Properties();
        //1.2 加载配置文件 转换为一个(双列的)集合，Map的子类
        //1.2.1 获取class目录下的配置文件,用类加载器把类路径下的class文件加载到内存
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        //1.2.2 获取对应资源的字节流
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);

        //2.获取配置文件中定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

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
