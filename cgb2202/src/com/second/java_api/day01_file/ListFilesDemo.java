package com.second.java_api.day01_file;

import java.io.File;

/**
 * 使用File访问一个目录中的子项
 *
 */
public class ListFilesDemo {
    public static void main(String[] args) {
        //查看当前目录下的所有子项
        File dir = new File(".");//当前目录
       /*
       判断当前File表示的是否为一个文件
        boolean isFile()

        判断当前File表示的是否为一个目录
        boolean isDirectory()
*/
        if (dir.isDirectory()){
            /*
                返回当前目录中所有子项，每个子项都包含在返回的数组中作为一个元素
                File[]  listFiles()
             */
            File[] subs = dir.listFiles();
            System.out.println("当前目录下有"+subs.length+"个子项");
            for (int i = 0; i < subs.length; i++) {
                File sub = subs[i];
                System.out.println(sub.getName()+"  --->  "+sub);
            }
        }else if (dir.isFile()){
            System.out.println("是文件");
        }

    }
}
