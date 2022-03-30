package cn.j07_jdbc.demo_1;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 使用纯java驱动模式连接数据库
 *
 * @author GST
 */
public class Sample2 {
    private static Logger logger = Logger.getLogger(Sample1.class);

    public static void main(String[] args) {
        Connection connection = null;
        //加载驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            logger.error(e);
        }
        String url = "jdbc:mysql://localhost:3306/db2";
        //建立连接
        try {
            connection = DriverManager.getConnection(url, "root", "root");
            System.out.println("连接成功");
        } catch (SQLException e) {
            logger.error(e);
        } finally {
            //关闭连接
            if (null != connection) {
                try {
                    connection.close();
                    System.out.println("关闭连接！");
                } catch (SQLException e) {
                    logger.error(e);
                }
            }
        }

    }
}
