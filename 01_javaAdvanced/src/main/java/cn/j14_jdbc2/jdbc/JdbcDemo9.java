package cn.j14_jdbc2.jdbc;

import cn.j14_jdbc2.util.JdbcUtils;

import java.sql.*;
import java.util.Scanner;

/**
 * 需求：
 * 1.通过键盘录入用户名和密码
 * 2.判断用户是否登录成功
 */
public class JdbcDemo9 {
    public static void main(String[] args) {
        //1.键盘录入，接收用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();
        //2.调用方法
        boolean flag = new JdbcDemo9().login2(username, password);
        //3.判断结果，输出不同语句
        if (flag) {
            System.out.println("登录成功");
        } else {
            System.out.println("用户名或密码错误！");
        }

    }

    /**
     * 登录方法,使用PreparedStatement实现
     */
    public boolean login2(String username, String password) {
        if (username == null || password == null) {
            return false;
        }
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        //连接数据库判断是否登录成功
        try {
            //1.获取连接
            conn = JdbcUtils.getConnection();
            //2.定义sql
            String sql = "select * from user where username=?and password=?";
            //3.获取执行sql的对象
            pstmt = conn.prepareStatement(sql);
            //4.给?赋值
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            //执行查询 返回结果集对象。不需要传参(sql)，这是子类特有的，父类需要传参
            rs = pstmt.executeQuery();
            //判断
       /*   if (rs.next()){ //如果有下一行 返回true。判断语句本来就返回Boolean类型，所以这样写很多余
                return true;
            }else{
                return false;
            }
            */

            return rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.close(rs, pstmt, conn);
        }
        //如果出现异常，没有查询成功 返回false
        return false;
    }

    /**
     * 登录方法
     */
    public boolean login(String username, String password) {
        if (username == null || password == null) {
            return false;
        }
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        //连接数据库判断是否登录成功
        try {
            //1.获取连接
            conn = JdbcUtils.getConnection();
            //2.定义sql
            String sql = "select * from user where username='" + username + "'and password='" + password + "'";
            //3.获取执行sql对象
            stmt = conn.createStatement();
            //执行查询 返回结果集
            rs = stmt.executeQuery(sql);
            //判断
       /*   if (rs.next()){ //如果有下一行 返回true。判断语句本来就返回Boolean类型，所以这样写很多余
                return true;
            }else{
                return false;
            }
            */

            return rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.close(rs, stmt, conn);
        }
        //如果出现异常，没有查询成功 返回false
        return false;
    }

}
