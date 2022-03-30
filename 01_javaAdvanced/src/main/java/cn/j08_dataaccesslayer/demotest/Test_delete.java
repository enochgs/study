package cn.j08_dataaccesslayer.demotest;

import cn.j08_dataaccesslayer.demo.StudentDao;
import cn.j08_dataaccesslayer.demo.StudentDaoImpl;

import java.sql.SQLException;

/**
 * 根据编号删除
 */
public class Test_delete {
    public static void main(String[] args) {
        //创建一个实现类的对象。通过dao来实现删除
        StudentDao dao = new StudentDaoImpl();
        //根据编号No删除对象
        try {
            int num = dao.delete(21);   //删除
            if (num != 0) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败！表中没有该数据");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}