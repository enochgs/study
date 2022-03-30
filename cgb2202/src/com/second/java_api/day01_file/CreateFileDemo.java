package com.second.java_api.day01_file;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo {
    public static void main(String[] args) throws IOException {
        //在当前目录下新建一个文件：test.txt
        File file = new File("./test.txt");
        if (file.exists()){
            //存在
            System.out.println("该文件已存在！");
        }else {
            //不存在
            file.createNewFile();
            System.out.println("创建文件成功");
        }
    }
}

