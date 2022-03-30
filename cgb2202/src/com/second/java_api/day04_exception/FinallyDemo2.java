package com.second.java_api.day04_exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 异常处理机制在IO当中使用
 */
public class FinallyDemo2 {
    public static void main(String[] args) throws InterruptedException, IOException {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("fos.txt");
            fos.wait(1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
