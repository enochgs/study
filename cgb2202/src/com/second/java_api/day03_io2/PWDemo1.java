package com.second.java_api.day03_io2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/**
 * 缓冲字符流
 * java.io.BufferedWriter和BufferedReader
 * 缓冲字符流是一对高级的字符流，作用是块写文本数据加速的。
 *
 * java.io.PrintWriter具有自动刷新的缓冲字符输出流，内部总是连接BufferedWriter
 * 更常用。
 */
public class PWDemo1 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        //向文件pw.txt中写入文本数据
        PrintWriter printWriter = new PrintWriter("pw.txt","utf-8");
        printWriter.println("让我掉下眼泪的，不是昨夜的酒。");
        printWriter.println("让我掉下不舍得，不是昨你的的温柔。");
        System.out.println("写出完毕！");
        printWriter.close();
    }
}
