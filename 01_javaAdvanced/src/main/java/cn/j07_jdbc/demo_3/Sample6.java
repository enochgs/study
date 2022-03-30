package cn.j07_jdbc.demo_3;

import org.apache.log4j.Logger;

import java.sql.*;
import java.util.Scanner;

/**
 * 使用Statement 的安全性差
 *
 * @author GST
 */
public class Sample6 {
    private static Logger logger = Logger.getLogger(Sample7.class);

    public static void main(String[] args) {
        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;

        //根据控制台提升输入账号密码进行登录
        Scanner in = new Scanner(System.in);
        System.out.println("\t 主公登录");
        System.out.println("请输入账号：");
        String name = in.next();
        System.out.println("请输入密码：");
        String password = in.next();
        //加载驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("加载驱动成功");
        } catch (ClassNotFoundException e) {
            logger.error(e);
        }
        String url = "jdbc:mysql://localhost:3306/db2?useUnicode=true&characterEncoding=utf8";
        //建立连接
        try {
            connection = DriverManager.getConnection(url, "root", "root");
            System.out.println("连接数据库成功");
            //判断主公是否登录成功
            st = connection.createStatement();  //由Connection 产生，执行sql语句
            String sql = "select * from master where name ='" + name + "'and password = '" + password + "';";
            System.out.println(sql);
            rs = st.executeQuery(sql);  //获取Statement 执行sql后的结果
            if (rs.next()) {
                System.out.println("登录成功，欢迎您！");
            } else {
                System.out.println("登录失败，请重新输入！");
            }
            logger.info("查询成功");

        } catch (SQLException e) {
            logger.error(e);
        } finally {
            try {
                if (null != rs) {
                    rs.close();
                }
                if (null != st) {
                    st.close();
                }
                if (null != connection) {
                    connection.close();
                }
                System.out.println("关闭连接");
            } catch (SQLException e) {
                logger.error(e);
            }
        }

    }
}
