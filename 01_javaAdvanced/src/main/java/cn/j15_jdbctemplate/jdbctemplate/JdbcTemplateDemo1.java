package cn.j15_jdbctemplate.jdbctemplate;

import cn.j15_jdbctemplate.utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * JdbcTemplate 入门
 */
public class JdbcTemplateDemo1 {
    public static void main(String[] args) {
        //1.导入jar包
        //2.导入JDBCTemplate对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        //3.调用方法
        String sql = "update account set balance=5000 where id=?";
        int count = template.update(sql, 3);   //返回int类型
        System.out.println(count);
    }
}
