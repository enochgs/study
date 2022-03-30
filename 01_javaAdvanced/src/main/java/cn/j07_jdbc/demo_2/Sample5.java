package cn.j07_jdbc.demo_2;

import org.apache.log4j.Logger;

import java.sql.*;

/**
 * 查询
 * 使用 Statement 的executeQuery() 方法查询并输出英雄信息
 *
 * @author GST
 */
public class Sample5 {
    private static Logger logger = Logger.getLogger(Sample5.class);

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;
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
            st = connection.createStatement();
            rs = st.executeQuery("SELECT * FROM hero");
            System.out.println("\t\t英雄信息列表");
            System.out.println("编号\t 昵称\t 生命值\t 忠诚度\t 性别\t 职业\t");
            while (rs.next()) {
                System.out.print(rs.getInt(1) + "\t \t");
                System.out.print(rs.getString(2) + "\t\t");
                System.out.print(rs.getInt(3) + "\t\t");
                System.out.print(rs.getInt(4) + "\t\t");
                System.out.print(rs.getString(5) + "\t\t");
                System.out.println(rs.getString(6) + "\t");
            }
            logger.info("更新成功");
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
                if (connection != null) {
                    connection.close();
                }
                System.out.println("关闭数据库连接");
            } catch (SQLException e) {
                logger.error(e);
            }
        }
    }
}
