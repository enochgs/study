package com.second.java_api.day02_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 通过提高每次读写的数据量，减少实际读写的次数，可以提高读写效率。
 *
 * 单字节的读写属于随机读写形式。
 * 一组字节的读写属于块读写形式。
 * 大多数硬件快读写都比随机读写性能好，尤其是机械硬盘上体现最为明显。
 *
 * InputStream和OutputStream上定义了块读写数据的相关方法。
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./test.txt");
        FileOutputStream fos = new FileOutputStream("./testcp.txt");
        byte[] data = new byte[1024*10];    //10kb
        /*
            read()
         */
        int len;    //每次实际读取到的字节数
        long start = System.currentTimeMillis();
        while ((len = fis.read(data))!=-1){
            //fos.write(data);//文件最多比原来大10kb
            fos.write(data, 0,len);//原始文件的大小
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完，耗时："+(end-start)+"ms");
        fis.close();
        fos.close();
    }
}
