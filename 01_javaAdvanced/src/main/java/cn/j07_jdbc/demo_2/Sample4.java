package cn.j07_jdbc.demo_2;

import org.apache.log4j.Logger;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 修改
 * Sataement 的execute()方法更新英雄信息
 *
 * @author GST
 */
public class Sample4 {
    private static Logger logger = Logger.getLogger(Sample4.class);

    public static void main(String[] args) throws SQLException {
        java.sql.Connection connection = null;
        java.sql.Statement st = null;
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
            System.out.println("连接成功");
            //插入信息到数据库
            st = connection.createStatement();
            st.execute("UPDATE hero SET health = 100,loyalty = 99 WHERE id=1");
            logger.debug("更新成功");
        } catch (SQLException e) {
            logger.error(e);
        } finally {
            try {
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
