package com.second.java_api.Lambda;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bc {
    public static void main(String[] args) throws IOException {
        //获取当前目录下全部文件
        File dir = new File(".");
        //判断dir是否为目录文件
        if(dir.isDirectory()){
            //把dir目录全部文件添加过滤规则(是文件的)返回存入到对象数组中
            File[] subs = dir.listFiles(file->file.isFile());
            //遍历文件对象
            for(int i=0;i<subs.length;i++){
                File file = subs[i];
                //获取当前坐标的对象的文件名
                String fileName = file.getName();
                //System.out.println(fileName);

                //名字
                try {
                    //获取最右边“.”左边的文件名
                    String name1 = fileName.substring(0,fileName.lastIndexOf("."));
                    //获取 最后一次出现.txt的后缀
                    String name2 = fileName.substring(fileName.lastIndexOf(".")+1);
                    //复制的文件的名字，连接字符串
                    String newFileName =name1+"_cp."+name2;
                    //System.out.println(newFileName);
                    //字节输入流对象
                    FileInputStream fis = new FileInputStream(file);
                    //字节输出流对象
                    FileOutputStream fos = new FileOutputStream(newFileName);
                    //创建缓冲块
                    byte[] data = new byte[1024*10];
                    int len;
                    //块读写
                    while((len = fis.read(data))!=-1){//把流对象读到内存
                        //把流输出遍历对应的文件中
                        fos.write(data,0,len);
                    }
                    fis.close();
                    fos.close();

                }catch (Exception e){
                }

            }
        }
        System.out.println("全部复制完毕!");
    }
}
