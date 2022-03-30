package com.second.java_api.day02_io;

import java.io.*;

/**
 * java将流分为两类：节点流与处理流
 * 节点流：又称为低级流，是实际连接我们的程序与另一端的“管道”，负责实际读写数据的流。
 *      记住：读写一定是建立在低级流的基础上进行的！
 *  处理流：又称为高级流，过滤流。不能独立存在，必须连接在其他流上，目的是当数据流经它时
 *      对数据进行某种加工处理，简化我们的相应操作。
 *  实际开发中，我们总是串联一组高级流到低级流上，完成一个复杂的数据读写操作，这个过程
 *  也称为流的连接，这是IO的精髓。
 *
 *  缓冲流
 *  java.io..BufferedInputStream和BufferedOutputStream
 *  缓冲流在流连接中的作用是加快读写效率
 */
public class CopyDemo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("test.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        FileOutputStream fileOutputStream = new FileOutputStream("test2.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        int d = 0;
        long start = System.currentTimeMillis();
        while ((d = bufferedInputStream.read())!=-1){
            bufferedOutputStream.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制成功，用时"+(end-start)+"ms");
        bufferedInputStream.close();
        bufferedOutputStream.close();

    }
}
