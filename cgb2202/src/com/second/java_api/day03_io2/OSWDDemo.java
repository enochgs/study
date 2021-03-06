package com.second.java_api.day03_io2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/**
 * 字符流
 * jvava将流按照读写的数据单位划分为字节流与字符流
 * java.io.InputStream和OutputStream是所有字节输入和输出流的超类
 * java.io.Reader和Writer则是所有字符输入与输出流的超类
 * 注：这两对超类之间是平级的，互相没有继承关系。
 *
 * Reader里定义了读取字符相关方法。
 * Writer里定义了写出字符的相关方法。
 * 特点都是以char为单位
 *
 * 转换流：
 * java.io.InputStreamReader和OutputStreamWriter
 * 它们是常见的字符流实现类，同时是一对高级流。实际开发中我们不会直接使用它们
 * 但是在流连接中它们是重要的一环。
 */
public class OSWDDemo {
    public static void main(String[] args) throws IOException {
        //向文件osw.txt中写入文本数据
        FileOutputStream fos = new FileOutputStream("osw.txt");
        //创建转换流时，可以通过第二个参数来指定字符集
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        String line = "摩擦摩擦，魔鬼的步伐";
        osw.write(line);
        System.out.println("写出完毕");
        osw.close();
    }
}
