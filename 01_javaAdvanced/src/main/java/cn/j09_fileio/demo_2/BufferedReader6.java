package cn.j09_fileio.demo_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 使用BuffereReader 类 读取文本文件
 *
 * @author GST
 */
public class BufferedReader6 {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            //创建一个FileReader 对象
            fr = new FileReader("E:/Code/txt/hello.txt");
            //创建一个BuffereReader 对象
            br = new BufferedReader(fr);    //把fr对象内容读到缓冲区，后面操作从缓冲区获取
            //readLine()读取一行数据,没有就返回null
            String line = br.readLine();  //首行返回给line，br.readLine()指向下一行
            while (line != null) {
                System.out.println(line);
                line = br.readLine();   //首行返回给line，br.readLine()指向下一行
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    br.close();
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
