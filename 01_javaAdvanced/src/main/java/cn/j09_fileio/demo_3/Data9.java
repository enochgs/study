package cn.j09_fileio.demo_3;

import java.io.*;

/**
 * DataInputStream
 * DataOutputStream
 */
public class Data9 {
    public static void main(String[] args) {
        DataOutputStream oud = null;
        DataInputStream ind = null;
        FileOutputStream os = null;
        FileInputStream is = null;
        try {
            //创建输入流对象
            is = new FileInputStream("E:/Code/txt/hello.txt");
            //创建输出流对象
            os = new FileOutputStream("E:/Code/txt/h2.txt");
            ind = new DataInputStream(is);  //二进制输入流
            oud = new DataOutputStream(os);  //二进制输出到文件
            int read;
            //循环读写
            while ((read = ind.read()) != -1) {  //循环输入流
                oud.write(read);        //把输入流对象内容输出流写入文件
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
