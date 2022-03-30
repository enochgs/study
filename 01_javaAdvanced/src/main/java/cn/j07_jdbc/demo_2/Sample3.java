package cn.j07_jdbc.demo_2;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 添加
 * 使用Statement的execute()方法插入信息
 *
 * @author GST
 */
public class Sample3 {
    private static Logger logger = Logger.getLogger(Sample3.class);

    public static void main(String[] args) {
        Connection connection = null;
        Statement st = null;
        String name = "黄蓉";    //昵称
        int health = 95;    //生命值
        int loyalty = 95;   //忠诚度
        String sex = "women";  //性别
        String occupation = "治疗师";    //职业
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
            StringBuffer sb = new StringBuffer();
            sb.append("insert into hero(name,health,loyalty,sex,occupation) values('");
            sb.append(name + "',");
            sb.append(health + ",");
            sb.append(loyalty + ",'");
            sb.append(sex + "','");
            sb.append(occupation + "');");
            System.out.println(sb.toString());
            st.execute(sb.toString());
            logger.info("插入成功");
        } catch (SQLException e) {
            logger.error(e);
        } finally {
            //关闭连接

            try {
                if (null != st) {
                    st.close();
                }
                if (null != connection) {
                    connection.close();
                }
                System.out.println("关闭连接！");
            } catch (SQLException e) {
                logger.error(e);
            }

        }

    }
}
