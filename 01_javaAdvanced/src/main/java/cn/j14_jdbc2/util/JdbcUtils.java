package cn.j14_jdbc2.util;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;


/**
 * JDBC工具类
 */
public class JdbcUtils {
    private static String url;  //为什么使用静态，只有静态变量才能被静态的代码块访问
    private static String user; //只有静态变量才能被静态的方法块访问
    private static String password;
    private static String driver;

    /**
     * 文件的读取，只需要读取一次即可拿到这些值。不要写到getConnection（）方法方法中
     * 可以避免每次调用getConnection（）方法时读取文件
     * 解决方案：写静态代码块,随着类的加载而加载静态代码块，只加载一次静态代码块
     */
    static {
        //读取资源文件，获取值

        try {
            //1.创建Properties集合类
            Properties pro = new Properties();
            //动态获取src路径下的文件的方式--->要使用ClassLoader 类加载器：可加载字节码文件进内存，而且它可获取src下资源文件的路径
            //要获取ClassLoader 首先要获取与他对应的字节码文件对象（随便一个对象都可以）如下行：
            ClassLoader classLoader = JdbcUtils.class.getClassLoader();
            //ClassLoader对象有个getResoure方法，(它以src为相对根路径)传入文件名就可以获取这个文件的资源，返回一个url对象
            URL url1 = classLoader.getResource("jdbc.properties");
            //URL：统一资源定位符，定位这个文件的绝对路径，要获取这个文件的url路径，使用url对象的getPath()方法
            String path = url1.getPath();
            //2.加载文件 Properties对象有一个load方法，加载文件进内存
            // load方法可接收字符流：new FileReader 或字节流。绝对路径不符合开发规范
            // pro.load(new FileReader("E:\\Code\\maven\\IdeaProjects\\itcast\\day04_jdbc\\src\\jdbc.properties"));
            pro.load(new FileReader(path));
            //3.获取数据，赋值
            url = pro.getProperty("url");
            user = pro.getProperty("user");
            password = pro.getProperty("password");
            driver = pro.getProperty("driver");
            //4.注册驱动
            Class.forName(driver);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    /**
     * 获取连接
     *
     * @return 连接对象
     */
    public static Connection getConnection() throws SQLException {
        //url,user,password 写静态代码块避免每次调用getConnection（）方法时读取文件
        return DriverManager.getConnection(url, user, password);
    }

    /**
     * 释放资源 重载
     * 增删改是 Statement类型 查询是 Result类型，所以写两个同名方法即重载
     */
    public static void close(Statement stmt, Connection conn) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(ResultSet rs, Statement stmt, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
