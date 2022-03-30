package cn.j14_jdbc2.jdbc;

import java.sql.*;

/**
 * 查询表中数据
 * 查询全部信息
 */
public class JdbcDemo7 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///db2", "root", "root");
            //3.定义sql语句
            String sql = "SELECT * FROM account";
            //4.获取执行sql对象
            stmt = conn.createStatement();
            //5.执行sql
            rs = stmt.executeQuery(sql);
            //6处理结果
            //6.1 让光标向下移动一行
            while (rs.next()) {
                //循环判断光标是否是最后一行末尾。
                //6.2获取数据
                int id = rs.getInt(1);
                String name = rs.getString("name");
                double balance = rs.getDouble(3);
                System.out.println(id + "---" + name + "---" + balance);
            }
     /*       if (rs.next()){
                //6.2获取数据
                int id1=rs.getInt(1);
                String name1=rs.getString("name");
                double balance1=rs.getDouble(3);
                System.out.println(id1+"---"+name1+"---"+balance1);
            }
            if (rs.next()){ //判断是否为最后一行，无数据：false返回
                //6.2获取数据
                int id2=rs.getInt(1);
                String name2=rs.getString("name");
                double balance2=rs.getDouble(3);
                System.out.println(id2+"---"+name2+"---"+balance2);
            }*/
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
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
}
