package cn.j07_jdbc.demo_3;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 使用PreparedStatement更新英雄信息
 *
 * @author GST
 */
public class Sample7 {
    private static Logger logger = Logger.getLogger(Sample7.class);

    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement ps = null;
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

            ps = connection.prepareStatement("UPDATE hero SET health=?,loyalty=? WHERE id=?");
            ps.setInt(1, 7);     //第一个占位符 更新参数1
            ps.setInt(2, 8);     //第二个占位符 更新参数2
            ps.setInt(3, 1);     //第三个占位符 要更新的id
            ps.executeUpdate();
            ps.setInt(1, 44);
            ps.setInt(2, 56);
            ps.setInt(3, 2);
            ps.executeUpdate();
            logger.info("更新成功");
        } catch (SQLException e) {
            logger.error(e);
        } finally {
            try {
                if (null != ps) {
                    ps.close();
                }
                if (null != connection) {
                    connection.close();
                }
                System.out.println("关闭连接 ");
            } catch (SQLException e) {
                logger.error(e);
            }
        }
    }
}
