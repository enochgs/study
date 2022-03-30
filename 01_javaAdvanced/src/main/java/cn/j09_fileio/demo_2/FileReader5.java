package cn.j09_fileio.demo_2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * 使用字符输入流 FileReader 类读取文本文件
 *
 * @author GST
 */
public class FileReader5 {
    public static void main(String[] args) {
        Reader fr = null;  //声明输入流对象
        try {   //创建fr对象
            fr = new FileReader("E:/Code/txt/hello.txt");
            char[] ch = new char[50];    //字符串中转站
            fr.read(ch);    //从输入流fr读取最多ch.lenth个字符到数组ch中
            System.out.println(ch);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
