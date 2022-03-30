package cn.j08_dataaccesslayer.demotest;

import cn.j08_dataaccesslayer.demo.Student;
import cn.j08_dataaccesslayer.demo.StudentDao;
import cn.j08_dataaccesslayer.demo.StudentDaoImpl;

import java.sql.SQLException;

/**
 * 根据编号修改
 */
public class Test_update {
    public static void main(String[] args) {
        //创建一个实现类的对象。通过dao来实现增删改查
        StudentDao dao = new StudentDaoImpl();
        //修改对象。把5号的学生修改为王二
        Student stu = new Student(21, "李四", "男");
        try {
            int num = dao.update(stu);    //修改
            if (num != 0) {
                System.out.println("修改成功");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
