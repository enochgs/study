package com.second.java_api.day02_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 完成一个简易记事本工具
 * 要求：程序启动后，将用户在控制台上输入的每一行字符串都写入文件note.txt中
 * 当用户单独输入exit时程序退出。
 */
public class NoteDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("note.txt",true);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String input = null;

        while (!"exit".equals((input = scanner.nextLine()))){//先获取控制台输入的一行字符串
            //写入文件
            //1先将字符串转换为一组字节
            byte[] bytes = (input+"\n").getBytes(StandardCharsets.UTF_8);
            fos.write(bytes);
        }

        System.out.println("程序已退出");
        fos.close();

    }
}
