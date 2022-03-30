package cn.j08_dataaccesslayer.demotest;

import cn.j08_dataaccesslayer.demo.Student;
import cn.j08_dataaccesslayer.demo.StudentDao;
import cn.j08_dataaccesslayer.demo.StudentDaoImpl;

import java.sql.SQLException;
import java.util.List;

/**
 * 查询全部学生
 */
public class Test_select {
    public static void main(String[] args) {
        //创建一个实现类的对象。通过dao来实现增删改查
        StudentDao dao = new StudentDaoImpl();
        //查询全部信息
        try {
            List<Student> list = dao.findAll();
            for (Student student : list) {
                System.out.println(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
