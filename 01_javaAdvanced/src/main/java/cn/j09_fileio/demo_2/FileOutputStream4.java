package cn.j09_fileio.demo_2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用字节输出流FileOutputStream 类向文件中写入数据
 *
 * @author GST
 */
public class FileOutputStream4 {
    public static void main(String[] args) {
        FileOutputStream out = null;
        try {
            //创建流对象，append 设为true是以追加方式写入文件，默认直接覆盖原文件内容
            out = new FileOutputStream("E:/Code/txt/hello.txt", true);
            String str = "\ngood good study,up up every day.";
            byte[] bytes = str.getBytes();  //将字符串转换为字节数组
            //写入文件
            out.write(bytes, 0, bytes.length);
            System.out.println("hello文件更新");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("创建文件时出错");
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
