package cn.j08_dataaccesslayer.demotest;

import cn.j08_dataaccesslayer.demo.Student;
import cn.j08_dataaccesslayer.demo.StudentDao;
import cn.j08_dataaccesslayer.demo.StudentDaoImpl;

import java.sql.SQLException;

/**
 * 添加学生信息
 */
public class Test_insert {
    public static void main(String[] args) {
        //创建一个实现类的对象。通过DAO来添加学生信息
        StudentDao dao = new StudentDaoImpl();
        //插入信息
        Student st = new Student(21, "张三", "男");
        try {
            int num = dao.insert(st);
            if (num != 0) {
                System.out.println("插入成功");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
