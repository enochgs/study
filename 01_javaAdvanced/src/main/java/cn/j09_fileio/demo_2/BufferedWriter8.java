package cn.j09_fileio.demo_2;

import java.io.*;

/**
 * 使用字符输出流 BufferedWriter 向文件写数据
 * 使用字符输入流 BufferedReader 读取文件数据
 */
public class BufferedWriter8 {
    public static void main(String[] args) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            //创建输出流对象
            fw = new FileWriter("E:/Code/txt/hello.txt", true);
            //创建有缓冲的输出流对象
            bw = new BufferedWriter(fw);
            bw.write("大家好\n");
            bw.write("我正在学BufferedWriter");
            bw.newLine();   //插入换行符
            bw.write("请多指教");
            bw.newLine();   //插入换行符
            bw.flush(); //刷新缓冲区

            //读取文件内容
            fr = new FileReader("E:/Code/txt/hello.txt");
            br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
                if (bw != null) {
                    bw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
