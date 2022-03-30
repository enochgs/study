package com.second.java_api.day01_file;

import java.io.File;

/**
 * 删除一个目录
 */
public class DeleDirDemo {
    public static void main(String[] args) {
        //将当前目录下的demo目录删除
        File dir = new File("demo");
        if (dir.exists()){
            //删除目录时只有空目录可以被删除！
            dir.delete();//删除空目录
            System.out.println("文件删除成功");
        }else {
            System.out.println("文件不存在");
        }
    }
}
