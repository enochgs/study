package com.second.java_api.day03_io2;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 缓冲输出流写出数据的缓冲区问题
 */
public class BOS_FlushDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("bos.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        String line = "奥利给！";
        byte[] data = line.getBytes(StandardCharsets.UTF_8);
        bufferedOutputStream.write(data);
        System.out.println("写出完毕");
        /*
            缓冲流的flush方法用于强制将缓冲区中已经缓存的数据一次性写出。
            注：该方法实际上在字节输出流的超类OutputStream上定义的，并非只有缓冲输出流有这个方法。
            但是实际上只有缓冲输出流的该方法有实际意义，其他的流实现该方法的目的仅仅是为了在流连接过程中
            传递flush动作给缓冲输出流。
         */
        bufferedOutputStream.flush();//冲
        bufferedOutputStream.close();
    }
}
