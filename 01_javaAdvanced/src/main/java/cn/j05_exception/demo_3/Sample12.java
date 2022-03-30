package cn.j05_exception.demo_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 处理Checked异常
 *
 * @author GST
 */
public class Sample12 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        //创建文件指定的流
        try {
            fis = new FileInputStream(new File("01_java/src/main/resources/txt.txt"));
        } catch (FileNotFoundException e) {
            System.err.println("无法找到指定文件！");
            System.out.println(new File(".").getAbsolutePath());//打印当前目录
            e.printStackTrace();
        }
        //关闭流
        try {
            fis.close();
        } catch (IOException e) {
            System.err.println("关闭指定文件输入流时出现异常！");
            e.printStackTrace();

        }
    }
}
