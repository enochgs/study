package cn.j08_dataaccesslayer.demo;

import java.sql.SQLException;
import java.util.List;

/**
 * DAO接口。隔离了数据库的关联。任何一种数据库都可以实现这个接口
 *
 * @author GST
 */
public interface StudentDao {
    int insert(Student stu) throws SQLException;    //插入学生信息--定义int类型的原因：执行插入完成后，返回影响行数为int类型

    int update(Student stu) throws SQLException;    //修改学生信息

    int delete(int No) throws SQLException;         //根据No删除学生信息

    Student findByNo(int No) throws SQLException;   //根据No查询学生信息

    List<Student> findAll() throws SQLException;     //查询所有学生
}
