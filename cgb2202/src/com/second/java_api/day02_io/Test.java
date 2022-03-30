package com.second.java_api.day02_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("test.txt");
        fos.write(97);
        for (int i = 1; i < 26; i++) {
            fos.write(97+i);
        }
        System.out.println("写出完毕");
        FileInputStream fis = new FileInputStream("test.txt");
        for (int i = 0; i < 26; i++) {
            System.out.println((char) fis.read());
        }
        fos.close();
        fis.close();

    }
}
