package cn.j09_fileio.demo_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream3 {
    public static void main(String[] args) {
        InputStream fis = null;
        try {
            fis = new FileInputStream("E:/Code/txt/hello.txt");   //创建文件输入流对象
            int data;   //用来接收读取到的数据
            System.out.println("可读取的字节数：" + fis.available()); //因为读取是按1字节每个读取，汉字会乱码
            System.out.println("文件内容为：");
            //循环读数据
            while ((data = fis.read()) != -1) {
                System.out.print((char) data + " ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
