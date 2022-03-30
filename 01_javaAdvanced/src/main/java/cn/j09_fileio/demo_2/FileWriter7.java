package cn.j09_fileio.demo_2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 使用字符输出流 FileWriter 类向文件写入数据
 */
public class FileWriter7 {
    public static void main(String[] args) {
        Writer fw = null;
        //创建FileWriter 对象
        try {
            fw = new FileWriter("E:/Code/txt/hello.txt", true);//append 设为true是以追加方式写入文件，默认直接覆盖原文件内容
            //写入信息
            fw.write("\n我热爱Java！,此内容不覆盖原文件内容");
            fw.flush();     //刷新缓冲区
            System.out.println("写入成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (fw != null) {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
