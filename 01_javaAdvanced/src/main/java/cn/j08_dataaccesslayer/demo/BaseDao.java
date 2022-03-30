package cn.j08_dataaccesslayer.demo;

import java.sql.*;

/**
 * BaseDao.具有的功能
 * 创建数据库的连接、关闭数据库
 * 增加、修改、删除、查询
 *
 * @author GST
 */
public class BaseDao {
    //静态属性。不需要实例化，可以直接通过“类名.属性名”来调用
    private static String driver = "com.mysql.jdbc.Driver";
    public static String url = "jdbc:mysql://localhost:3306/db2?useUnicode=true&characterEncoding=utf8";
    public static String user = "root";
    public static String password = "root";
    public static Connection conn = null;
    public static PreparedStatement ps = null;

    //加载驱动
    static {    //静态代码块，类加载的时候执行
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    //创建数据库的连接
    public static Connection getConnection() throws SQLException {
        conn = DriverManager.getConnection(url, user, password);
        return conn;
    }

    //关闭连接
    public static void closeAll(ResultSet rs, Statement st, Connection conn) throws SQLException {
        if (rs != null) {  //判断是否有结果集
            rs.close(); //关闭结果集
        }
        if (st != null) {  //判断是否有载体
            st.close(); //关闭载体
        }
        if (conn != null) {     //判断是否有连接
            conn.close();   //关闭连接
        }
    }

    //增加、修改、删除。这3个方法只有Sql语句和参数列表不同，其他都一样
    public static int executeSQL(String sql, Object[] param) throws SQLException {
        conn = getConnection();   //调用连接
        ps = conn.prepareStatement(sql);  //调用载体
        if (param != null) {
            for (int i = 0; i < param.length; i++) {   //循环赋值
                ps.setObject(i + 1, param[i]);//i是数组下标，从零开始；i+1是占位符的下标从1开始
            }
        }
        int num = ps.executeUpdate(); //执行更新
        closeAll(null, ps, conn); //关闭载体和连接
        return num;
    }

    //执行查询
    public static ResultSet executeQuery(String sql, Object[] param) throws SQLException {
        conn = getConnection();           //调用连接
        ps = conn.prepareStatement(sql);  //调用载体
        if (param != null) {               //判断是否有参数
            for (int i = 0; i < param.length; i++) {   //循环进行赋值
                ps.setObject(i + 1, param[i]);
            }
        }
        ResultSet rs = ps.executeQuery(); //执行查询
        return rs;                      //返回结果集
    }
}
