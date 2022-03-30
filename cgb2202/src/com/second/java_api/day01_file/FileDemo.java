package com.second.java_api.day01_file;


import java.io.File;

/**
 * java.io.File
 * File可以表示硬盘上的一个文件或目录(实际表示的是一个抽象路径)
 * File可以：
 * 1：访问其表示的文件或目录的属性信息(名字，大小，修改时间等等)
 * 2：可以创建或删除文件和目录
 * 3：可以访问一个目录中的子项内容
 * 但是File不能访问文件数据
 */
public class FileDemo {
    public static void main(String[] args) {
        /*
            实际开发中我们不会使用绝对路径。。虽然清晰明了，但是不利于跨平台。

            相对路径有更好的跨平台性，但是具体位置要看程序运行环境而定。

            例如"./": 当前目录，对于IDEA而言，该目录是当前程序所在的项目目录。
         */
        File file = new File("./bug.txt");
        //获取文件名字或目录名称
        String name = file.getName();
        System.out.println("文件名称："+name);

        //获取大小，就是文件在硬盘上实际占用的空间（单位是字节）
        long length = file.length();
        System.out.println("文件大小："+length+" 字节");

        boolean b = file.canWrite();
        System.out.println("可写："+b);
        boolean b1 = file.canRead();
        System.out.println("可读："+b1);
        boolean hidden = file.isHidden();
        System.out.println("是否隐藏"+hidden);


    }
}
