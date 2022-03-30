package cn.j05_exception.demo_3;

import java.io.File;
import java.io.FileInputStream;

/**
 * 不处理Checked异常导致报错
 *
 * @author GST
 */
public class Sample11 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        //不处理Checked异常导致报错
/*        //创建文件指定的流
            fis=new FileInputStream(new File("01_java/src/main/resources/txt.txt"));
        //关闭流
            fis.close();
      */
    }
}
