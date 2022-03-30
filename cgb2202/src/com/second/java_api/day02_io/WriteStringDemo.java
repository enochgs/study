package com.second.java_api.day02_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        //向文件中写入文本数据。创建时若test.txt文件有内容将会被覆盖，然后顺序添加
        //FileOutputStream fos = new FileOutputStream("./test.txt");
        //向文件中写入文本数据。创建时若test.txt文件有内容不会被覆盖，接着原来内容顺序添加
        FileOutputStream fos = new FileOutputStream("./test.txt",true);

        //String line = "super idol 的笑容没你甜，八月中午的阳光都没你耀眼。";
        /*
            String 提供了一个方法：getBytes()可以将该字符串按照指定的字符集转换为对应的一组字节。
            参数指定的就是字符集。。用StandardCharsets.UTF_8。
         */
        String line = "热爱105度的水。";
        byte[] data = line.getBytes(StandardCharsets.UTF_8);
        fos.write(data);
        //接着添加
        line = "巴扎嘿。";
        data = line.getBytes(StandardCharsets.UTF_8);
        fos.write(data);
        System.out.println("写出完毕");
        fos.close();

    }
}
