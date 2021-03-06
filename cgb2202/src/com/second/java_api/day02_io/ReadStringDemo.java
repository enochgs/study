package com.second.java_api.day02_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 从文件中读取文本数据
 */
public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("test.txt");
        byte[] bytes = new byte[1024 * 10];
        int len = fis.read(bytes);
        System.out.println("实际读取字节数"+len);

        String line = new String(bytes,0,len, StandardCharsets.UTF_8);
        System.out.println(line.length());
        System.out.println(line);
    }
}
