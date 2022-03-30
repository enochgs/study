package cn.j08_dataaccesslayer.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 使用mysql 数据库实现了StudentDao接口
 */
public class StudentDaoImpl implements StudentDao {

    @Override
    public int insert(Student stu) throws SQLException {
        String sql = "insert into student values(?,?,?);"; //编写插入的sql语句
        Object[] arr = {stu.getNo(), stu.getName(), stu.getSex()};
        int num = BaseDao.executeSQL(sql, arr);    //执行更新sql语句
        return num;
    }

    @Override
    public int update(Student stu) throws SQLException {
        String sql = "update student set name=?,sex=? where No=?";    //编写修改的sql语句
        Object[] arr = {stu.getName(), stu.getSex(), stu.getNo()};
        int num = BaseDao.executeSQL(sql, arr);    //执行更新sql语句
        return num;
    }

    @Override
    public int delete(int No) throws SQLException {
        String sql = "delete from student where No=?";    //编写删除的sql语句
        Object[] arr = {No};
        int num = BaseDao.executeSQL(sql, arr);           //执行更新sql语句
        return num;
    }

    @Override
    public Student findByNo(int No) throws SQLException {
        String sql = "select * from student where No=?";  //编写查询的sql语句
        Object[] arr = {No};
        ResultSet rs = BaseDao.executeQuery(sql, arr);     //执行查询sql语句
        Student stu = null;                            //声明一个学生对象
        if (rs.next()) {                              //判断是否有结果
            stu = new Student();                       //创建学生对象
            stu.setNo(rs.getInt("No")); //从结果集rs的No列取值，赋值给学生对象stu的No属性
            stu.setName(rs.getString("name"));//从结果集rs的name列取值，赋值给学生对象stu的name属性
            stu.setSex(rs.getString("sex"));//从结果集rs的sex列取值，赋值给学生对象stu的sex属性
        }
        return stu;     //返回学生对象
    }

    @Override
    public List<Student> findAll() throws SQLException {
        String sql = "select * from student";     //编写查询的sql语句
        ResultSet rs = BaseDao.executeQuery(sql, null); //这里不需要参数，所以设置为null
        List<Student> list = new ArrayList<Student>();//创建一个可以包含很多个对象的动态数组
        Student stu = null;       //声明一个学生对象
        while (rs.next()) {       //循环判断是否有结果
            stu = new Student();  //创建学生对象
            stu.setNo(rs.getInt("No"));//从结果集rs的No列取值，赋值给学生stu的No属性
            stu.setName(rs.getString("name"));
            stu.setSex(rs.getString("sex"));
            list.add(stu);
        }
        return list;
    }
}
