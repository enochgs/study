package com.second.java_api.day02_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("./test.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("./test_copy.txt");
        int d;
        while ((d=fileInputStream.read())!=-1){
            fileOutputStream.write(d);
        }
        System.out.println("复制完毕！");
        fileInputStream.close();
        fileOutputStream.close();
    }
}
