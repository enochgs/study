package cn.j15_jdbctemplate.datasource.druid;

import cn.j15_jdbctemplate.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 使用新的工具类
 */
public class DruidDemo2 {

    public static void main(String[] args) {
        /**
         * 完成添加操作：给account添加一条记录
         */
        Connection conn = null;
        PreparedStatement psmt = null;
        try {
            //1.获取连接
            conn = JDBCUtils.getConnection();
            //2.定义sql
            String sql = "insert into account values(null,?,?)";
            //3.获取pstmt对象
            psmt = conn.prepareStatement(sql);
            //4.给？赋值
            psmt.setString(1, "赵六");
            psmt.setDouble(2, 3000);
            //5.执行sql
            int count = psmt.executeUpdate();
            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //6.释放资源
            JDBCUtils.close(psmt, conn);
        }
    }
}
