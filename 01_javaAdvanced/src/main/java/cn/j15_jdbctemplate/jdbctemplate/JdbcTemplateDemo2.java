package cn.j15_jdbctemplate.jdbctemplate;

import cn.j15_jdbctemplate.domain.Emp;
import cn.j15_jdbctemplate.utils.JDBCUtils;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class JdbcTemplateDemo2 {

    // Junit 单元测试，可以让方法独立执行
    //1.获取JDBCTemplate对象
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    /**
     * 1.修改1号数据的 salary 为 10000
     */
    @Test
    public void test1() {
        //2.定义sql
        String sql = "update emp set salary =10000 where id=1001";
        //3.执行sql
        int count = template.update(sql);
        System.out.println(count);
    }

    /**
     * 2.添加一条记录
     */
    @Test
    public void test2() {
        String sql = "insert into emp(id,ename,dept_id)values(?,?,?)";
        int count = template.update(sql, 1015, "郭靖", 10);
        System.out.println(count);
    }

    /**
     * 3.删除上面添加的记录
     */
    @Test
    public void test3() {
        String sql = "delete from emp where id=?";
        int count = template.update(sql, 1015);
        System.out.println(count);
    }

    /**
     * 4.查询id为1001的记录，将其封装为Map集合
     * 注意：这个方法查询的结果集长度只能为1(一条记录)，否则下面的写法报错
     * String sql="select * from emp where id=? OR id=?";
     * Map<String, Object> map = template.queryForMap(sql, 1001,1002);
     */
    @Test
    public void test4() {
        String sql = "select * from emp where id=?";
        //查询结果，将结果集封装为map集合,列名作为key，值作为value，这条记录封装为一个Map集合。
        Map<String, Object> map = template.queryForMap(sql, 1001);
        System.out.println(map);
        //{id=1001, ename=孙悟空, job_id=4, mgr=1004, joindate=2000-12-17, salary=10000.00, bonus=null, dept_id=20}
    }

    /**
     * 5.查询所有记录
     * 注意：将每一条记录封装为一个Map集合，再将Map集合装载到List集合中
     */
    @Test
    public void test5() {
        String sql = "SELECT * from emp";
        //将每条记录封装到Map集合，再将Map装载到list集合
        List<Map<String, Object>> list = template.queryForList(sql);
        for (Map<String, Object> stringObjectMap : list) {
            System.out.println(stringObjectMap);
        }
    }

    /**
     * 6.查询所有记录，将其封装为Emp对象的List集合
     * 常见：将数据查询出来，将其封装为JavaBean的对象，然后将JavaBean对象装载到list集合里
     * 6_1：自己实现 RowMapper接口，即new RowMapper<Emp>(){}
     * //new RowMapper<Emp>() 后跟{} 这是匿名内部类写法
     */
    @Test
    public void test6_1() {
        String sql = "select * from emp";
        //封装为JavaBean的对象，使用query方法，query有两个值，sql和RowMapper接口(可默认可自己实现)
        //自己实现RowMapper接口
        List<Emp> list = template.query(sql, new RowMapper<Emp>() {//匿名内部类的写法
            //mapRow()方法每调用一次，就会封装一个emp对象返回list集合，list集合放着一个个的emp对象
            @Override
            public Emp mapRow(ResultSet rs, int i) throws SQLException {
                Emp emp = new Emp();
                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");

                emp.setId(id);
                emp.setEname(ename);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_id(dept_id);

                return emp;
            }
        });
        for (Emp emp : list
        ) {
            System.out.println(emp);
        }

    }

    /**
     * 6.查询所有记录，将其封装为Emp对象的List集合
     * 常见：将数据查询出来，将其封装为JavaBean的对象，然后将JavaBean对象装载到list集合里
     * 6_2：spring也提供了几个实现类
     */
    @Test
    public void test6_2() {
        String sql = "select * from emp";
        List<Emp> list = template.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));
        for (Emp emp : list
        ) {
            System.out.println(emp);
        }
    }

    /**
     * 7.查询总记录数
     * queryForObject: 一般用来执行聚合函数
     */
    @Test
    public void test7() {
        String sql = "select count(id) from emp";
        //count(id)返回的是long类型数据
        Long total = template.queryForObject(sql, Long.class);
        System.out.println(total);
    }

}
